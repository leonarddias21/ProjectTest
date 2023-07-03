package com.traqade.tests.member;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

public class MarkAttendanceTest extends AuthTest
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
		
		MemberPage memberPage=dashBoardPage.clickmembericon();
		delay(2000);
		memberPage.memberList();
		delay(2000);
		memberPage.clickMarkAttendance();
		delay(2000);
		memberPage.selectAttendanceDate();
		memberPage.clickInTime();
		memberPage.clickPMDD();
		memberPage.clickOnUpdate();
		delay(3000);
		
		//Toaster Message for Delete package successfully
		Assert.assertEquals(memberPage.toastAttendance(), "User Attendance Marked Successfully", "Member Attendance not Marked");
		}
}
