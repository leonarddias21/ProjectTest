package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

public class FreezeTest extends AuthTest{

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
		memberPage.memberList();
		delay(3000);
		memberPage.clickOnFreeze();
		memberPage.clickOnFreezeFrom();
		memberPage.clickOnFreezeTo();
		memberPage.clickOnFreezePackage();
		delay(3000);
		
		//Toaster Message for Freeze package successfully
		Assert.assertEquals(memberPage.toastFreeze(),"Freeze Membership Request Has Been Processed Successfully!","Freeze Request not Processed!");		
		delay(1000);  
		
		//Click on Unfreeze
		memberPage.clickOnUnfreeze();
		memberPage.unFreezeFromDate();
		memberPage.clickOnUnfreezeButton();
		delay(3000);
		
		//Toaster Message for Freeze package successfully
		Assert.assertEquals(memberPage.toastUnfreeze(),"Unfreeze Request Has Been Processed Successfully!","Unfreeze Request not Processed!");
		
		}
}