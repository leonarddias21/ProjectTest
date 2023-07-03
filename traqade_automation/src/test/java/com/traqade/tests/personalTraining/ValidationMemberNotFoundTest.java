package com.traqade.tests.personalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PersonalTrainingPage;
import com.traqade.tests.auth.AuthTest;

public class ValidationMemberNotFoundTest extends AuthTest {

	@Test(priority = 1)
	public void validationMemberNotFoundTest() throws InterruptedException {

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
		personalTrainingPage.selectNotMember();
		delay(3000);
        
		//Check validation message is display
		Assert.assertEquals(personalTrainingPage.notMemberValidation(), "Member Not Found", "Member Found");

	}

}