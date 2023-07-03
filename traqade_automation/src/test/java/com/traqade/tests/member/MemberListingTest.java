package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

	public class MemberListingTest extends AuthTest{

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
			
			//Click on any Member from MemberList
			memberPage.memberList();
			delay(5000);
			
			//Verify Member Details Page
			memberPage.memberDetailsPage();
			
			//Click on Edit Basic Info
			memberPage.clickEditBasicInfo();
			delay(2000);
			memberPage.clickLanguageDD();
			memberPage.scrollBasicInfoEditPage();
			memberPage.emergencyContactName();
			memberPage.emergencyContactNo();
			memberPage.saveButtonEditPage();
			delay(5000);
			
			//Verify the Member Details Updated
			Assert.assertEquals(memberPage.toastBasicinfo(),"Member Details Updated Successfully!","Details not updated");
			delay(2000);
			
			//Click on Address Edit Button
			memberPage.clickEditAddress();
			delay(5000);
			memberPage.presentStreetAddress();
			memberPage.enterPincode();
			memberPage.clickOnLocalityDD();
			memberPage.addressSaveButton();
			
			//Verify the Member Address Updated
			Assert.assertEquals(memberPage.toastAddress(),"Address Updated Successfully!","Address not updated"); 
						
			//Click on Body Measurements Edit Button
			memberPage.clickEditBodyMeasurements();
			delay(5000);			
			memberPage.clickFitnessGoalDD();
			memberPage.clickFitnessActivitiesDD();
			memberPage.clickDietPreferenceDD();
			memberPage.healthProblems();
			memberPage.clickBMSaveButton();
			
			//Verify the Member Body Measurements Updated
			Assert.assertEquals(memberPage.toastBodyMeasurement(),"Body Measurement Details Updated Successfully!","Body Measurement Details not updated");
			
			//Click on Assign Another Package
			memberPage.clickAssignAnotherPackage();
			
			}
	}

