package com.traqade.tests.personalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PersonalTrainingPage;
import com.traqade.tests.auth.AuthTest;

public class ValidationPackageExpireTest extends AuthTest {

	@Test(priority = 1)
	public void validationPackageExpireTest() throws InterruptedException {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait to load the webpage
		delay(2000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();

		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();
		PersonalTrainingPage personalTrainingPage = dashBoardPage.clickPersonalTrainingModule();
		delay(3000);

		// Navigating to Personal Training Page
		personalTrainingPage.clickAddAppointmentButton();
		personalTrainingPage.selectPersonalTraining();
		personalTrainingPage.selectInvalidMemberPackage();
		delay(3000);
		personalTrainingPage.selectTrainer();
		personalTrainingPage.selectCurrentDate();
		personalTrainingPage.selectHour();
		personalTrainingPage.selectMinute();
		delay(3000);
		personalTrainingPage.selectTime();
		personalTrainingPage.selectDuration();
		personalTrainingPage.clickCreateAppointmentButton();
		delay(3000);

		// Check validation package expire message is display
		Assert.assertEquals(personalTrainingPage.packageExpireValidation(),
				"Member Does Not Have Active Personal Training Package For The Selected Date",
				"Member is able to booked an appointment");

	}

}