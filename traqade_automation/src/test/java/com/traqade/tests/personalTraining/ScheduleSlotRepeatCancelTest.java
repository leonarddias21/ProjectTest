package com.traqade.tests.personalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PersonalTrainingPage;
import com.traqade.tests.auth.AuthTest;

public class ScheduleSlotRepeatCancelTest extends AuthTest {

	@Test(priority = 1)
	public void scheduleSlotRepeatCancelTest() throws InterruptedException {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait to load the webpage
		delay(2000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();

		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();
		PersonalTrainingPage personalTrainingPage = dashBoardPage.clickPersonalTrainingModule();
		delay(3000);

		// Navigating to Personal Training Appointment Page
		personalTrainingPage.clickAllTrainers();
		delay(5000);
		personalTrainingPage.scrollDown();
		delay(5000);
		//Cancel First Appointment
		personalTrainingPage.clickFirstSchduleAppointmentLink();
		personalTrainingPage.clickCommonCancel();
		personalTrainingPage.clickCommonConfirm();
        personalTrainingPage.scrollDown();
		delay(3000);
		//Cancel Second Appointment
		personalTrainingPage.clickFirstSchduleAppointmentLink();
		personalTrainingPage.clickCommonCancel();
		personalTrainingPage.clickCommonConfirm();
		personalTrainingPage.scrollDown();
		delay(3000);
		//Cancel Third Appointment
		personalTrainingPage.clickFirstSchduleAppointmentLink();
		personalTrainingPage.clickCommonCancel();
		personalTrainingPage.clickCommonConfirm();
		delay(2000);

		// Check Add Appointment button is present
		Assert.assertTrue(personalTrainingPage.isAppointmentButtonPresent(), "Appointment button is not present");

	}

}