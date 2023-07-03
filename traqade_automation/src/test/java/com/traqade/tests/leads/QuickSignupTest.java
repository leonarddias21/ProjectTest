package com.traqade.tests.leads;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.LeadsPage;
import com.traqade.tests.auth.AuthTest;

public class QuickSignupTest extends AuthTest {

	@Test(priority = 1)
	public void leadsTest() throws InterruptedException {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait to load the webpage
		delay(2000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();

		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();

		// Redirecting to Leads Page
		LeadsPage leadsPage = dashBoardPage.clickLeadsModule();
		leadsPage.waitForLeadPageToLoad();

		// Enter lead deatils in the lead form

		leadsPage.clickOnAddIcon();
		leadsPage.clickOnQuickAddLink();
		leadsPage.clickOnSendLinkButton();

		// Check the email validation error is displayed
		Assert.assertEquals(leadsPage.emailValidationError(), "Either Email Or Mobile Is Required",
				"Email Validation is mismatch");

		// Check the phone validation error is displayed
		Assert.assertEquals(leadsPage.phoneValidationError(), "Either Email Or Mobile Is Required",
				"Phone Validation is mismatch");

		leadsPage.clickOnCloseButton();
		delay(3000);

		leadsPage.clickOnAddIcon();
		leadsPage.clickOnQuickAddLink();

		leadsPage.inputQuickEmail();
		leadsPage.inputQuickMobileNo();
		leadsPage.clickOnSendButton();
		delay(5000);

		// Check the lead invitation successful validation is displayed
		Assert.assertEquals(leadsPage.validationGetText(), "Lead Invitation Request Sent Successfully!",
				"Validation is mismatch displayed");

	}

}
