package com.traqade.tests.personalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PersonalTrainingPage;
import com.traqade.tests.auth.AuthTest;

public class ZeroValidAppointmentTest extends AuthTest {

	@Test(priority = 1)
	public void zeroValidAppointmentTest() throws InterruptedException {

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
		personalTrainingPage.selectClient();
		delay(3000);
		personalTrainingPage.selectTrainer();
		personalTrainingPage.selectCurrentDate();
		personalTrainingPage.pastHour();
		personalTrainingPage.selectMinute();
		delay(3000);
		personalTrainingPage.selectPastTime();
		personalTrainingPage.selectDuration();
		personalTrainingPage.clickCreateAppointmentButton();
		delay(3000);

		//Verify Appointment Confirmation Toaster is display
		Assert.assertEquals(personalTrainingPage.pastHourAppointmentValidation(),
				"Appointment Can Not Be Created In Past Time", "Incorrect Toaster Message is getting display");

	}

}