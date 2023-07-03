package com.traqade.tests.auth;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.WelcomePage;

public class LogoutTest extends AuthTest {

	@Test(priority = 1)
	public void logOutTest() {
		
		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();
		
		//wait to load the webpage
	    delay(2000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
		
		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();
		dashBoardPage.clickAccountIcon();
		
		//Redirecting to Welcome Page
		WelcomePage traqadeWelcomePage = dashBoardPage.clickSignOutButton();
		traqadeWelcomePage.waitForTraqadeWelcomePageToLoad();
		traqadeWelcomePage.clickPopupLink();
		
		
		//Get the Login button text
		String loginTitle = traqadeWelcomePage.getLoginText();

		
        //Verify the Login Button appears
		Assert.assertEquals(loginTitle, "LOGIN");
	}

}
