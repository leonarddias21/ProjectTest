package com.traqade.tests.personalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PersonalTrainingPage;
import com.traqade.core.pages.auth.StaffPage;
import com.traqade.tests.auth.AuthTest;

public class StaffInactiveDropdownTest extends AuthTest {

	@Test(priority = 1)
	public void staffInactiveDropdownTest() throws InterruptedException {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();
		delay(5000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
		delay(5000);
		dashBoardPage.waitForDashboardPageStaffIconToLoad();
		dashBoardPage.clickNotifyIcon();
		StaffPage staffPage = dashBoardPage.clickstaffModule();
		delay(5000);

		staffPage.clickInactiveTab();
		staffPage.waitForInactiveStaffVisible();
		String inactiveStaff = staffPage.getStaffInactiveName();
		PersonalTrainingPage personalTrainingPage = staffPage.clickPersonalTrainingModule();
		delay(3000);

		// Navigating to Personal Training Page
		personalTrainingPage.clickAddAppointmentButton();
		personalTrainingPage.selectPersonalTraining();
		delay(3000);
		personalTrainingPage.checkInactiveTrainer(inactiveStaff);

		// Check Inactive appears under the trainer drop down
		Assert.assertEquals(personalTrainingPage.getErrorText(), "No matching data",
				"Staff is visible under the dropdown");

	}
}