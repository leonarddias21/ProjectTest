package com.traqade.tests.auth;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.WelcomePage;

public class DemoRequestTest extends AuthTest {

	@Test(priority = 1)
	public void demoRequestTest() {
		WelcomePage welcomePage = getWelcomePage();
		welcomePage.waitForTraqadeWelcomePageToLoad();
		welcomePage.clickPopupLink();
		welcomePage.clickRequestDemoButton();
		welcomePage.inputDemoName();
		welcomePage.inputDemoMobileNo();
		welcomePage.inputDemoEmail();
		welcomePage.inputCenterName();
		welcomePage.inputCity();
		welcomePage.inputTextMessage();
		welcomePage.clickDemoSubmitButton();
		delay(5000);

		// Verify Thank You message is getting display
		Assert.assertEquals(welcomePage.getTitle(), "Thank you!", "Incorrect message is displayed");
	}

}
