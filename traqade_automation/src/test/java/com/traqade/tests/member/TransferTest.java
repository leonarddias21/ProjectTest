package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

	public class TransferTest extends AuthTest{

		@Test(priority = 1)
			public void memberTest() throws InterruptedException
			{
			AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

			// wait to load the webpage
			delay(2000);
			DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
			dashBoardPage.waitForDashboardPageToLoad();
			dashBoardPage.clickNotifyIcon();
			
			//Click on Member Icon
			MemberPage memberPage=dashBoardPage.clickmembericon();
			delay(2000);
			
			memberPage.clickOnAddMemberButton();
			memberPage.enterEmailId();
			memberPage.enterPhoneNo();
			memberPage.enterUserName();
			memberPage.selectGender();
			memberPage.clickDob();
			memberPage.clickOnProceed();
			memberPage.selectPackageType();
			memberPage.selectPackage();
			memberPage.clickAssignATrainer();
			memberPage.clickSaveButton();
			delay(3000);
			memberPage.clickOnSubmitButton();
			memberPage.selectPaymentModeDD();
			memberPage.paymentReferenceNumber();
			memberPage.registrationNumber();
			memberPage.submit();
			delay(5000);
	
			//Transfer to a new member
			memberPage.clickTransfer();
			delay(5000);
			memberPage.enterTransferEmailId();
			memberPage.enterTransferPhoneNo();
			memberPage.enterTransMemName();
			memberPage.selectGender();
			memberPage.clickDob();
			memberPage.clickOnProceed();
			memberPage.clickOnProceed();
			memberPage.transRegistrationNum();
			memberPage.clickEmergencyContact();
			memberPage.transEmergencyContactName();
			memberPage.transEmergencyContactNo();
			memberPage.enterNotes();
			memberPage.submit();
			delay(5000);
			
			//Toaster Message for Transfer package successfully
			Assert.assertEquals(memberPage.toastTransfer(),"Transfered Packages Succesfully!","Package Not Transferred");
		
			
		}	
}
