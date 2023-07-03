package com.traqade.tests.campaign;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.CampaignPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.tests.auth.AuthTest;

public class CampaignTest extends AuthTest{
	
	@Test(priority = 1)
	public void campaignTest() throws InterruptedException {
		
		  AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();
	      delay(3000);
		  DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
		  delay(2000);
		  dashBoardPage.waitForDashboardPageToLoad();
		  dashBoardPage.clickNotifyIcon();
		  CampaignPage campaignPage=dashBoardPage.clickCampaignIcon();
		  delay(2000);
		  
		  //Assert Method to Verify Campaign Page Title
		  String campaignTitle = campaignPage.campaignPageGetText();
		  Assert.assertEquals(campaignTitle,campaignPage.campaignPageGetText(),"Campaign Page title matched");
		  delay(2000);

		  campaignPage.clickAddCampaign();
		  String campName=campaignPage.enterCampaignName();
		  campaignPage.enterDescription();
		  delay(2000);
		  campaignPage.clickNext();
		  delay(9000);
		  campaignPage.selectLists();
		  delay(2000);
		  campaignPage.clickNextPage();
		  delay(7000);
		  campaignPage.clickCreateEmailTemp();
		  delay(2000);
		  campaignPage.selectEmailTemp();
		  delay(2000);
		  campaignPage.enterTemplateName();
		  delay(2000);
		  campaignPage.clickSubmit();
		  delay(5000);
		  campaignPage.selectRndEmailTemp();
		  delay(2000);
		  campaignPage.clickCreateSMSTemp();
		  delay(2000);
		  campaignPage.selectSMSTemp();
		  delay(2000);
		  campaignPage.enterSmsName();
		  delay(2000);
		  campaignPage.clickSmsSubmit();
		  delay(2000);
		  campaignPage.selectRndSMSTemp();
		  delay(2000);
		  campaignPage.clickNextPage();
		  delay(5000);
		  campaignPage.clickSendNow();
		  delay(7000);
		  
		  //Verifying if the Campaign is Scheduled
		  String campaignStatus = campaignPage.campaignStatusGetText();
		  Assert.assertEquals(campaignStatus,campaignPage.campaignStatusGetText(),"Campaign Status  matched !");
		  delay(3000);
		  
		  campaignPage.clickFilter();
		  delay(2000);
		  campaignPage.inputCampNameFilter(campName);
		  delay(2000);
		  
		  //Verifying Campaign Name is available or not
		  Assert.assertEquals(campName.toLowerCase(),campaignPage.campaignNmGetText().toLowerCase(),"Campaign Name Not Found!");
		  delay(3000);
		  
		  campaignPage.clickCloseFilter();
		  delay(2000);
		  campaignPage.clickCreatedFrom();
		  delay(2000); 
		  campaignPage.clickCreatedTo();
		  delay(2000);
		  campaignPage.clickCloseFilter();
		  delay(2000);
		  campaignPage.clickScheduleFrom();
		  delay(2000);
		  
		  //Verifying Campaign Name Scheduled from is available or not
		  Assert.assertEquals(campName.toLowerCase(),campaignPage.campaignNmGetText().toLowerCase(),"Campaign Name Not Found!");
		  delay(3000);
		  
		  campaignPage.clickCloseFilter();
		  delay(2000);
		  campaignPage.clickScheduleTo();
		  delay(2000);
		  campaignPage.clickCloseFilter();
		  delay(2000);
		  campaignPage.clickMode();
		  delay(2000);
		  
		  //Verifying Campaign Mode is available or not
		  Assert.assertEquals(campaignPage.campaignModeGetText(),"SMS, Email","Campaign With Email Mode Not Found!");
          delay(3000);
		  
		  campaignPage.clickCloseFilter();
		  delay(2000);
		  String createdBy=campaignPage.clickCreatedBy();
		  delay(2000);
		  
		  //Verifying Created By Name is available or not
		  Assert.assertEquals(createdBy,campaignPage.createdByGetText(),"Created By Name is Not Found!");
		  delay(3000);
		  
		  campaignPage.clickCloseFilter();
		  delay(2000);
		  campaignPage.clickStatus();
		  delay(2000);
		  
		  //Verifying Campaign Status is available or not
		  Assert.assertEquals(campaignPage.statusGetText(),"Running","Status running is Not Found!");
		  delay(3000);
		 
		  campaignPage.clickCloseFilter();
		  delay(2000);
		  
		  campaignPage.clickCampaignName();
		  delay(3000);
		  campaignPage.scrollCampDetails();
		  delay(2000);
		  campaignPage.inputTestEmail();
		  delay(2000);
		  campaignPage.inputTestPhone();
		  delay(2000);
		  campaignPage.clickSend();
		  delay(2000);
		  
		  //Assert Method for Test Email & Phone No
		  Assert.assertEquals(campaignPage.testEmailGetText(),"Test Email & Sms Sent Successfully","Test Email & SMS not sent successfully!");
		  delay(3000);
		
		  campaignPage.clickCampaignIcon();
		  delay(5000);
		  campaignPage.clickAddCampaign();
		  campaignPage.enterCampaignName();
		  campaignPage.enterDescription();
		  delay(2000);
		  campaignPage.clickNext();
		  delay(9000);
		  campaignPage.selectLists();
		  delay(2000);
		  campaignPage.clickNextPage();
		  delay(7000);
		  campaignPage.clickCreateEmailTemp();
		  delay(2000);
		  campaignPage.selectEmailTemp();
		  delay(2000);
		  campaignPage.enterTemplateName();
		  delay(2000);
		  campaignPage.clickSubmit();
		  delay(5000);
		  campaignPage.selectRndEmailTemp();
		  delay(2000);
		  campaignPage.clickCreateSMSTemp();
		  delay(2000);
		  campaignPage.selectSMSTemp();
		  delay(2000);
		  campaignPage.enterSmsName();
		  delay(2000);
		  campaignPage.clickSmsSubmit();
		  delay(2000);
		  campaignPage.selectRndSMSTemp();
		  delay(2000);
		  campaignPage.clickNextPage();
		  delay(2000);
		  campaignPage.clickScheduleLater();
		  delay(2000);
		  campaignPage.scrollCampDetails();
		  delay(2000);
		  campaignPage.selectSchedule();
		  delay(2000);
		  campaignPage.selectScheduleDate();
		  delay(2000);
		  campaignPage.clickScheduleButton();
		  delay(7000);
		  campaignPage.clickFilter();
		  delay(2000);
		  campaignPage.clickStatusOption();
		  delay(2000);
		  
		  //Assert Method to check the Campaign Status
		  Assert.assertEquals(campaignPage.campaignNewStatusGetText(),"Success","Success status is Not Found!");
		  delay(3000);
		  
		  campaignPage.clickCloseFilter();
		  delay(3000);
		  campaignPage.clickDeleteCampagin();
		  delay(2000);
		  campaignPage.clickDeleteOption();
		  delay(2000);
		  
		  ///Assert Method for deletion of Campaign
		  Assert.assertEquals(campaignPage.campaignDeleteGetText(),"Campaign Deleted Successfully","Campaign not deleted Successfully!");
		  delay(3000);
		  
		  //Existing List Part
		  campaignPage.clickExistList();
		  campaignPage.waitForExistingListPageToLoad();
		  
		  Assert.assertEquals(campaignPage.campaignExistListGetText(),"All Members","All Members list is not found!");
		  delay(2000);
		  
		  campaignPage.clickCreateNewList();
		  delay(2000);
		  String existName=campaignPage.enterListName();
		  campaignPage.enterListDescription();
		  campaignPage.clickMembershipStatus();
		  campaignPage.clickAdditionalFilters();
		  delay(2000);
		  campaignPage.scrollTempPopUp();
		  delay(2000);
		  //campaignPage.clickStartDate();
		  //delay(2000);
		  campaignPage.selectGender();
		  delay(2000);
		  campaignPage.selectMembershipPackage();
		  delay(2000);
		  campaignPage.scrollTempPopUp();
		  delay(2000);
		  campaignPage.clickSaveButton();
		  delay(5000);
		  campaignPage.clickListFilter();
		  delay(2000);
		  campaignPage.inputListNameFilter(existName);
		  delay(2000);
		  
		  //Verifying the New Lists Name
		  Assert.assertEquals(existName.toLowerCase(),campaignPage.campaignExistingListGetText().toLowerCase(),"Lists Name Not Found!");
		  delay(3000);
		  
		  campaignPage.clickClearFilter();
		  campaignPage.clickGroupType();
		  delay(2000);
		  
		  //verifying the Group Type Name
		  Assert.assertEquals(campaignPage.groupTypeGetText(),"Member","Member Group Type is not found!");
		  delay(2000);
		  
		  campaignPage.clickClearFilter();
		  delay(2000);
		  campaignPage.clickCreatedFromList();
		  delay(2000);
		  campaignPage.clickClearFilter();
		  delay(2000);
		  campaignPage.clickCreatedToList();
		  delay(2000);
		  
		  //Verifying the newly added List is Present
		  Assert.assertEquals(existName.toLowerCase(),campaignPage.campaignExistingListGetText().toLowerCase(),"Lists Name Not Found!");
		  delay(3000);
		  
		  campaignPage.clickClearFilter();
		  delay(2000);
		  String createdByList=campaignPage.clickCreatedByList();
		  delay(2000);
		  
		  Assert.assertEquals(createdByList,campaignPage.createdByListGetText(),"Created By Name is Not Found!");
		  delay(3000);
		  
		  campaignPage.clickClearFilter();
		  delay(2000);
		  campaignPage.clickEditList();
		  delay(2000);
		  campaignPage.clickAdditionalFilters();
		  delay(2000);
		  campaignPage.clickUserGroup();
		  //delay(2000);
		  campaignPage.clickStaffStatus();
		  delay(2000);
		  campaignPage.clickUpdate();
		  delay(2000);
		  
		  Assert.assertEquals(campaignPage.listUpdateGetText(),"User List Updated Successfully","User List not Updated successfully!");
		  delay(2000);
		  
		  campaignPage.clickDeleteList();
		  delay(2000);
		  campaignPage.clickDeleteListOption();
		  delay(2000);
		  
		  Assert.assertEquals(campaignPage.listDeleteGetText(),"User List Deleted Successfully","User List not deleted successfully!");
		  delay(2000);
	}
	
	
}

