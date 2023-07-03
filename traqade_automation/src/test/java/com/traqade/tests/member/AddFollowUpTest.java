package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

public class AddFollowUpTest extends AuthTest
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
		memberPage.clickMemberFollowUp();
		memberPage.clickonCallTypeDD();
		memberPage.assignToDD();
		memberPage.selectDate();
		memberPage.clickAddFollowUp();
		delay(1000);
		
		//verify follow up created
		Assert.assertEquals(memberPage.toastFollowup(),"Member Followup Created Successfully!","Member Follow up Not Created");
	
		}
}