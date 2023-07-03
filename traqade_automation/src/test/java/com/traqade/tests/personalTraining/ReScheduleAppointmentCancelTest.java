package com.traqade.tests.personalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PersonalTrainingPage;
import com.traqade.tests.auth.AuthTest;

public class ReScheduleAppointmentCancelTest extends AuthTest{
	
	@Test(priority = 1)
	public void rescheduleAppointmentCancelTest() throws InterruptedException {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait to load the webpage
		delay(2000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();

		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();
		PersonalTrainingPage personalTrainingPage = dashBoardPage.clickPersonalTrainingModule();
		delay(3000);
		
		//Navigating to Personal Training Appointment Page
		personalTrainingPage.clickAllTrainers();
		delay(5000);
		personalTrainingPage.scrollDown();
		delay(5000);
		personalTrainingPage.clickSchduleAppointmentLink();
		delay(3000);
		personalTrainingPage.clickAssignTrainerLink();
		personalTrainingPage.clickDropdown();
		delay(3000);
		
		//Check the assigned trained is disabled
		Assert.assertTrue(personalTrainingPage.isTrainerDisabled(), "Assigned Trainer is getting enabled");
		
		//Select another trainer to reassigned member
		personalTrainingPage.selectAnotherTrainer();
		personalTrainingPage.clickSaveLink();
		delay(3000);
		personalTrainingPage.selectReAssignedTrainer();
		delay(5000);
		personalTrainingPage.scrollDown();
		delay(5000);
		personalTrainingPage.clickSchduleAppointmentLink();
		delay(3000);
		personalTrainingPage.clickCancelButton();
		personalTrainingPage.clickConfirmButton();
		delay(3000);
		
		//Verify Appointment Cancellation Toaster is display
		Assert.assertEquals(personalTrainingPage.appointmentCancelToaster(),
				"Appointment Booking Cancelled Successfully!", "Incorrect Toaster Message is getting display");

     }

}