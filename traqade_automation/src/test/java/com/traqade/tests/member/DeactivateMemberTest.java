package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

public class DeactivateMemberTest extends AuthTest
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
		memberPage.memberList();
		delay(2000);
		memberPage.clickOnDeactivate();
		memberPage.yesButton();
		delay(5000);
		
		//Toaster Message for Deactivate member successfully
		Assert.assertEquals(memberPage.toastDeactivate(), "Member Deactivated Successfully!", "Member not Deactivated");
		
		}
}
