package com.traqade.tests.leads;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.LeadsPage;
import com.traqade.tests.auth.AuthTest;

public class LeadsTest extends AuthTest {

	@Test(priority = 1)
	public void leadsTest() throws InterruptedException {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait to load the webpage
		delay(6000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();

		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();

		// Redirecting to Leads Page
		LeadsPage leadsPage = dashBoardPage.clickLeadsModule();
		leadsPage.waitForLeadPageToLoad();

		// Clicking on Add Lead button
		leadsPage.clickAddLeadButton();
		leadsPage.waitForLeadFormPageToOpen();

		// Enter lead deatils in the lead form
		String leadEmailAddress = leadsPage.inputEmail();
		leadsPage.inputMobileNo();

		leadsPage.inputName();
		leadsPage.waitForGenderDropToLoad();
		leadsPage.clickGenderDropDown();

		leadsPage.selectGender();
		leadsPage.clickAssignDropDown();
		delay(9000);

		leadsPage.selectAssignTo();
		leadsPage.clickSaveButton();
		delay(9000);

		// Verify the lead is created
		Assert.assertEquals(leadEmailAddress, leadsPage.emailIdGetText(), "Email is mismatch");

		leadsPage.clickFollowUpButton();
		leadsPage.waitForLeadFollowupFormToOpen();

		leadsPage.dateSelect();
		leadsPage.selectFollowUpTime();

		leadsPage.selectAddNote();
		leadsPage.clickSaveChangesButton();
		delay(9000);

		// Checking the activity notes is displayed
		Assert.assertTrue(leadsPage.isActivityTextDisplayed(), "Activity Notes is missing");

		// Checking Trial text is displayed
		Assert.assertTrue(leadsPage.isTrialTextDisplayed(), "Trial text is missing");

		// Checking Follow up text is displayed
		Assert.assertTrue(leadsPage.isFollowUpTextDisplayed(), "Follow up text is missing");

		//Redirecting to Lead Listing Page
		leadsPage.clickLeadModule();
		leadsPage.clickAdvancedFilters();
		leadsPage.inputEmailId(leadEmailAddress);
		delay(5000);

		leadsPage.selectLeadDelete();
		leadsPage.clickYesButton();
		delay(3000);

		// Check the toaster message is matching
		Assert.assertEquals(leadsPage.toasterDelete(), "Lead Deleted Successfully!", "Delete toaster is mismatch");

	}

}
