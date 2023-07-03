package com.traqade.tests.auth;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;

public class LoginTest extends AuthTest {

	@Test(priority = 1)
	public void logInTest() {
		
		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait for success message
		delay(2000);
		String title = authorizeCenterPage.getH2Title();
		
		Assert.assertTrue(title.contains("Authorize centers"), "Title Authorize Centers not found");
	}

}
