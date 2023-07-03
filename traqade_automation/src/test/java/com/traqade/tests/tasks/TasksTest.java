package com.traqade.tests.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.LeadsPage;
import com.traqade.core.pages.auth.TasksPage;
import com.traqade.tests.auth.AuthTest;

public class TasksTest extends AuthTest {
	
	@Test(priority = 1)
	public void tasksTest() throws InterruptedException {
		
		  AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();
	      delay(3000);
		  DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
		  delay(2000);
		  dashBoardPage.waitForDashboardPageToLoad();
		  dashBoardPage.clickNotifyIcon();
		  TasksPage tasksPage=dashBoardPage.clickTasksIcon();
		  delay(2000);
		 
		  //Verifying if Landed on the Tasks Management Page
		  String tasksTitle = tasksPage.tasksPageGetText();
		  Assert.assertEquals(tasksTitle,tasksPage.tasksPageGetText(),"Tasks Page title matched");
  
		  tasksPage.clickMemberTab();
		  tasksPage.clickAddFollowUp();
		  delay(2000);
		  tasksPage.clickselectMember();
		  delay(2000);
		  tasksPage.clickCallType();
		  tasksPage.waitCallTypeToLoad();
		  tasksPage.selectCallTypeOption();
		  delay(2000);
		  tasksPage.clickAssignTo();
		  tasksPage.selectAssignToOption();
		  delay(2000);
		  tasksPage.clickDateTime();
		  delay(2000);
		  tasksPage.enterNote();
		  tasksPage.clickAddFollowUpButton();
		  delay(5000);
		  
		  //Assert method to verify if the Member follow Up is added.
		  Assert.assertEquals(tasksPage.memberAddedGetText(),"Testautomate10","Member Name Testautomate10 is not found!");
	      delay(3000);
	      
	      tasksPage.clickReschedule();
	      delay(2000);
	      tasksPage.clickReason();
	      tasksPage.waitReasonOptionToLoad();
	      tasksPage.selectreasonOption();
	      delay(2000);
	      tasksPage.clickDateTime1();
	      tasksPage.clickRescheduleButton();
	      delay(2000);
	      tasksPage.scrollTasksPage();
	      tasksPage.clickRescheduleTab();
	      delay(2000);
	      
	      //Assert method to verify if the Member is Rescheduled
	      Assert.assertEquals(tasksPage.memberAddedGetText(),"Testautomate10","Member Name Testautomate10 is not found!");
	      delay(5000);	
	      
	      
	      tasksPage.clickTaskIcon();
	      delay(2000);
	      tasksPage.clickMemberTab();
	      tasksPage.clickAddFollowUp();
		  delay(2000);
		  tasksPage.clickselectMember();
		  delay(2000);
		  tasksPage.clickCallType();
		  tasksPage.waitCallTypeToLoad();
		  tasksPage.selectCallTypeOption();
		  delay(2000);
		  tasksPage.clickAssignTo();
		  tasksPage.selectAssignToOption();
		  delay(2000);
		  tasksPage.clickDateTime();
		  delay(2000);
		  tasksPage.enterNote();
		  tasksPage.clickAddFollowUpButton();
		  delay(2000);
		  
		  //Assert method to verify if the Member follow Up is added.
		  Assert.assertEquals(tasksPage.memberAddedGetText(),"Testautomate10","Member Name Testautomate10 is not found!");
	      delay(3000);
	      
	     
	     tasksPage.clickOpenTab();
	     delay(2000);
	     tasksPage.clickCloseOption();
	     delay(2000);
	     tasksPage.clickReason2();
	     tasksPage.clickReasonOption1();
	     delay(2000);
	     tasksPage.clickCloseButton();
	     delay(2000);
	     tasksPage.clickAllFollowUps();
	     delay(2000);
	     tasksPage.clickCloseTab();
	     delay(2000);
	     
	     
	     //Verifying if the Member is closed or not
	     Assert.assertEquals(tasksPage.closeMemberGetText(),"Closed","Member Name Testautomate10  with Closed Status is not found!");
	     delay(3000);
	     
	     //Members Part 
		  tasksPage.clickMemberTab();
		  tasksPage.clickMemberFilter();
		  delay(2000);
		  tasksPage.selectStaff1();
		  tasksPage.clickFilterBy();
		  delay(2000);
		  tasksPage.selectFilterByCallType();
		  delay(2000);
		  
		  
		  //Assert method to verify if the call type is present or not
		  Assert.assertEquals(tasksPage.callTypeGetText(),"Welcome","Welcome Call Type not found!");
	      delay(5000);
	     
		  LeadsPage leadsPage = tasksPage.clickLeadIcon();
		  delay(5000);
		  leadsPage.clickAddLeadButton();
		  delay(3000);
		  leadsPage.inputMobileNo();
		  leadsPage.inputName();
		  delay(2000);
		  leadsPage.waitForGenderDropToLoad();
		  leadsPage.clickGenderDropDown();
		  delay(3000);
		  leadsPage.selectGender();
		  leadsPage.clickAssignDropDown();
		  leadsPage.selectAssignTo();
		  leadsPage.clickSaveButton();
		  delay(5000);
		  
		  leadsPage.clickFollowUpButton();
		  leadsPage.waitForLeadFollowupFormToOpen();

		  leadsPage.dateSelect();
		  leadsPage.selectFollowUpTime();

		  leadsPage.selectAddNote();
		  leadsPage.clickSaveChangesButton();
		  delay(3000);
		  tasksPage.clickTaskIcon();
	      delay(2000);
	      tasksPage.clickLeadTab();
	      tasksPage.clickLeadFilter();
		  delay(2000);
		  tasksPage.selectStaff();
		  delay(3000);
		  
		  Assert.assertEquals(tasksPage.leadNameGetText(),"Lead","Lead Name not found!");
	      delay(3000);
}
}