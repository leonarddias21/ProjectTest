package com.traqade.tests.personalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PersonalTrainingPage;
import com.traqade.tests.auth.AuthTest;

public class CreatePersonalTrainingTest extends AuthTest {

	@Test(priority = 1)
	public void createPersonalTrainingTest() throws InterruptedException {

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
		personalTrainingPage.selectHour();
		personalTrainingPage.selectMinute();
		delay(3000);
		personalTrainingPage.selectTime();
		personalTrainingPage.selectDuration();
		personalTrainingPage.clickCreateAppointmentButton();
		delay(3000);

		//Verify Appointment Confirmation Toaster is display
		Assert.assertEquals(personalTrainingPage.appointmentConfirmationToaster(),
				"Appointment Booking Created Successfully!", "Incorrect Toaster Message is getting display");
		
		

	}

}