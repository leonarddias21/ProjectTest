
package com.traqade.tests.staff;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.StaffPage;
//import com.traqade.core.pages.auth.WelcomePage;
import com.traqade.tests.auth.AuthTest;

	public class StaffTest extends AuthTest {
		
		@Test(priority = 1)
		public void staffTest() throws InterruptedException {
			
			  AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();
		      delay(5000);
			  DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
			  delay(5000);
			  dashBoardPage.waitForDashboardPageStaffIconToLoad();
			  dashBoardPage.clickNotifyIcon();
			  dashBoardPage.clickstafficon();
			  delay(5000);
		     
			  //Verify the Staff Listing Page
			  String staffTitle = dashBoardPage.staffTitleGetText();
	          Assert.assertEquals(staffTitle,dashBoardPage.staffTitleGetText(),"Staff title matched");
	        
		      //Clicking the staffAdd Button and entering details
		      StaffPage staffPage = new StaffPage(driver);
		      staffPage.clickAddStaff();
		      delay(3000);
		      
		      String staffEmail=staffPage.enterEmailAdd();
		      
		      //Entering Phone No
		      String staffPhone=staffPage.enterPhoneNo();
		     
		      //Entering Staff Name
		      String staffName = staffPage.enterStaffName();
		      
		      staffPage.waitForGenderDropToLoad();
		      staffPage.clickGender();
		      delay(2000);
		      
		      staffPage.waitForDOBCalendarToLoad();
		      staffPage.clickDOBCalendar();
		      
		      staffPage.scrollStaffPopUp();
		      delay(2000);
		      
		      staffPage.waitForRoleDropToLoad();
		      staffPage.clickRole();
		      
		      staffPage.clickspecialisation();
		      
		      staffPage.clickReportingManagerdropdown();
		      staffPage.selectReportingManagerName();
		      delay(2000);
		            
		      staffPage.clicksubmitStaffButton();
		      delay(5000);
		      
		      //Verify the Staff is created
		      Assert.assertEquals(staffEmail,staffPage.staffEmailGetText(),"Email not matched!");
		      
		      //Staff Searching
		      staffPage.clickFilterOption();
			  delay(2000);
			  staffPage.clickFilterName();
			  delay(2000);
			  staffPage.inputNameFilter(staffName);
			  delay(2000);
			  staffPage.clickApplyFilter();
			  delay(3000);
			  
			  //Verifying Staff Name is available or not
			  Assert.assertEquals(staffName.toLowerCase(),staffPage.staffNmGetText().toLowerCase(),"Staff Name Not Found!");
	          //delay(5000);
	          
	          staffPage.clickClear();
			  delay(2000);
	          staffPage.clickFilterPhn(staffPhone);
	          delay(2000);
	          staffPage.clickApplyFilter();
	          delay(2000);
	          
	          //Verifying Staff Phone is available or not
	          Assert.assertEquals(staffPhone,staffPage.staffPhnGetText(),"Staff Phone Number Not Found!");
	          delay(3000);
	          
	          staffPage.clickClear();
			  delay(2000);
	          staffPage.clickFilterEmail(staffEmail);
	          delay(2000);
	          staffPage.clickApplyFilter();
	          delay(2000);
	          
	          Assert.assertEquals(staffEmail,staffPage.staffEmailGetText(),"Staff Email Id Not Found!");
	          delay(5000);
	          
	          staffPage.clickClear();
			  delay(3000);  
	          staffPage.clickFilterDesignation();
	          delay(2000);
	          staffPage.waitForDesignationTypeToLoad();
	          staffPage.clickDesignationType();
	          staffPage.clickApplyFilter();
	          delay(3000);
	          
	          Assert.assertEquals(staffPage.staffDesginationGetText(),"Manager","Staff With Manager Designation Not Found!");
	          delay(5000);
	          
	          staffPage.clickClear();
			  delay(2000);
	          staffPage.clickFilterReportingManager();
	          String staffReportManager=staffPage.selectFilterReportingManagerName();
	          staffPage.clickApplyFilter();
	          staffPage.clickClear();
			  delay(2000);
			  
			  Assert.assertEquals(staffReportManager,staffPage.staffReportMngGetText(),"Reporting Manager Name is Not Found!");
	          staffPage.clickStaff();
	          delay(3000);
	          
	          //Staff Detail Page BasicInfo Part-------
	          staffPage.clickEditBasicInfo();
	          delay(2000);
	          staffPage.clickLanguage();
	          staffPage.selectLanguages();
	          staffPage.clickBasicInfoSubmit();
	          delay(5000);
	          
		      Assert.assertEquals(staffPage.toastStaffUpdate(),"Hindi, English","Languages are not updated");
		      delay(3000);
		      
	          staffPage.clickEditBasicInfo();
	          delay(3000); 
	          staffPage.clickStaffAddress();
	          delay(2000);
	          staffPage.enterPresentAddress();   
	          staffPage.enterPincode();
	          staffPage.waitForLocalityToLoad();
	          staffPage.clickLocality();
	          delay(5000);
	          staffPage.selectLocality();
	          staffPage.scrollStaffEditPopUp();
	          delay(2000);
	          staffPage.selectChkPermanentAddress();
	          staffPage.clickAddressSave();
	          delay(3000);
	          
	          //Verify Address is Updated
	          Assert.assertEquals(staffPage.toastAddressGetText(),"Address Updated Successfully!","Address not Updated");
	          delay(2000);
	          
	          staffPage.clickEditBasicInfo();
	          staffPage.clickInternalDetails();
	          delay(3000); 
	          staffPage.clickeditDesignation();
	          delay(3000);
	          staffPage.updateDesignation();
	          delay(3000);
	          staffPage.clickEditSpecialisation();
	          delay(3000);
	          staffPage.updateSpecialisation();
	          delay(2000);
	          staffPage.clickInternalDetailsSave();
	          delay(3000);
	          
	          Assert.assertEquals(staffPage.toastInternalGetTetxt(),"Staff Internal Details Updated Successfully!","Staff Internal Details not updated");
	          delay(2000);
	          
	          
	          //Staff Detail Page attendance Part------------
	          staffPage.clickAttendanceTab();
	          delay(2000);
	          staffPage.clickPresentDateCalendar();
	          delay(2000);
	          
	          staffPage.scrollStaffDetailPopUp();
	          delay(2000);
	          
	          staffPage.clickInTime();
	          delay(2000);
	          staffPage.clickOutTime();
	          delay(2000);
	          staffPage.clickmarkpresentAttendance();
	          delay(2000);
	         
	          Assert.assertEquals(staffPage.toastStaffPresentAttendance(),"Attendance Marked Successfully !","Staff attendance not marked sucessfully!");
	      
	          staffPage.clickAttendanceAbsent();
	          delay(3000);
	          staffPage.waitForAttendanceTypeToLoad();
	          staffPage.selectattendanceAbsentType();
	          
	          staffPage.clickAbsentDateCalendar();
	          staffPage.selectAbsentDateCalendar();
	          delay(2000);
	          staffPage.clickmarkabsentAttendance();
	          delay(3000);
	          
	          Assert.assertEquals(staffPage.toastStaffAbsentAttendance(),"Attendance Marked Successfully !","Staff attendance not marked sucessfully!");
	          delay(2000);
	          
	          staffPage.waitForAttendanceLeaveToLoad();
	          staffPage.clickLeaveDateCalendar();
	          
	          staffPage.selectLeaveDateCalendar();
	          staffPage.clickmarkleaveAttendance();
	          delay(3000);
	          
	          Assert.assertEquals(staffPage.toastStaffLeaveAttendance(),"Attendance Marked Successfully !","Staff attendance not marked sucessfully!");
	          delay(2000);
	             
	         //Staff Detail Page Document's Part------ 
	          staffPage.scrollStaffNotes();
	          delay(3000);
	          staffPage.clickDocumentsTab();
	          delay(3000);
	          
	          //Staff adding notes
	          staffPage.enterNotes();
	          delay(2000);
	          
	          Assert.assertEquals(staffPage.notesToastGetText(),"Comment Added Successfully!","Comment not added Sucessfully!");
	          delay(3000);
	                   
	          staffPage.clickDeactivate();
	          delay(2000);
	          staffPage.clickdeactivateOption();
	          
	          Assert.assertEquals(staffPage.deactivateToastGetText(),"Staff Deactivated Successfully!","Staff not deactivated Sucessfully!");
	          delay(3000);
	          
	          dashBoardPage.clickstafficon();
	          delay(2000);
	          staffPage.clickInactiveTab();
			  delay(3000);
	          
			  //Implementing Assert Method to Verify Inactive Staff in Staff Inactive Listing Page
			  Assert.assertEquals(staffEmail,staffPage.staffDeactiveEmailGetText(),"Staff Email Id Not Inactive!");
	          delay(5000);
			  
	          staffPage.clickStaffList();
			  delay(3000);
	          staffPage.clickActivate();
	          staffPage.clickActivateOption();
	          delay(2000);
	          
	          Assert.assertEquals(staffPage.activatetoastGetText(),"Staff Reactivated Successfully!","Staff not reactivated Sucessfully!");
	          delay(5000);
	           
	          dashBoardPage.clickstafficon();
	          delay(2000);
	          staffPage.clickActiveTab();
			  delay(3000);
	          
			  //Implementing Assert Method to Verify Active Staff in Staff Active Listing Page
			  Assert.assertEquals(staffEmail,staffPage.staffActiveEmailGetText(),"Staff Email Id Not Active!");
	          delay(3000);
	          
	          staffPage.clickStaffList();
			  delay(3000);
	          staffPage.clickDelete();	
	          delay(2000);
	          staffPage.clickDeleteOption();
			  
		}

	}


