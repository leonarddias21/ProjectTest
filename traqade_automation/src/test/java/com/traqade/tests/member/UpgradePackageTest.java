package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

public class UpgradePackageTest extends AuthTest
{

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
		
		//Selecting package types
		memberPage.selectPackageType();
		memberPage.selectPackage();
		memberPage.clickAssignATrainer(); 
		memberPage.clickSaveButton();
		memberPage.clickOnSubmitButton();
		
		//Select Payment Method 
		memberPage.selectPaymentModeDD();
		memberPage.scroll();
		memberPage.submit();
		delay(3000);
		
		memberPage.waitForDetailsPageToLoad();
		memberPage.scrollDetailsPage();
		delay(2000);
		memberPage.clickUpgrade();
		memberPage.selectUpgradePackage();
		memberPage.clickAssignATrainer();
		memberPage.clickOnProceed();
		memberPage.selectPaymentModeDD();
		memberPage.submit();
		delay(5000);
		//Toaster Message for Freeze package successfully
		Assert.assertEquals(memberPage.toastUpgrade(),"Package Upgraded Successfully","Package not Upgraded!");
				
		}
}