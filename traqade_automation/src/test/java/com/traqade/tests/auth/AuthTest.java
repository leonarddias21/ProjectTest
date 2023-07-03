package com.traqade.tests.auth;

import com.traqade.core.BaseTest;
import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.LoginPage;
import com.traqade.core.pages.auth.WelcomePage;

public class AuthTest extends BaseTest{
	
	protected AuthorizeCenterPage getAuthorizationCenterPage()
	{
		LoginPage loginPage = new LoginPage(driver);

		loginPage.open();
		loginPage.waitForLoginPageToLoad();

		// Send OTP
		loginPage.sendOTP("8888918299");
		
		
		
		delay(5000);
		AuthorizeCenterPage authorizeCenterPage = loginPage.login("325798");
		return authorizeCenterPage;
	}
	
	protected WelcomePage getWelcomePage()
	{
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.openTraqadeUrl();
		delay(3000);
		return welcomePage;
	}

}
