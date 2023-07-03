package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

public class ReactivateMemberTest extends AuthTest
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
	delay(3000);  
	memberPage.clickSaveButton();
	memberPage.clickOnSubmitButton();
	
	//Select Payment Method 
	memberPage.selectPaymentModeDD();
	memberPage.scroll();
	memberPage.submit();
	delay(5000);
	
	//Click on Deactivate
	memberPage.clickOnDeactivate();
	delay(3000);
	memberPage.yesButton();
	delay(2000);
	
	//Click On Reactivate
	memberPage.clickOnReactivate();
	memberPage.clickYes();
	delay(5000);
	
	
	//Toaster Message for Reactivate member successfully
	Assert.assertEquals(memberPage.toastReactive(), "Member Reactivated Successfully!", "Member not reactivated");
	}
}
