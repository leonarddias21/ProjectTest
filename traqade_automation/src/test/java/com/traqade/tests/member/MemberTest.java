package com.traqade.tests.member;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;


	
	@Test(priority = 1)
	public class MemberTest extends AuthTest
	{
		public void memberTest() throws InterruptedException 
			 {
			
			AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();
			
			//wait to load the webpage
			delay(5000);
			DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
			
			dashBoardPage.waitForDashboardPageToLoad();
			dashBoardPage.clickNotifyIcon();
			
			//click on member icon
			MemberPage memberPage=dashBoardPage.clickmembericon();
			memberPage.clickOnAddMemberButton();
			delay(2000);
						
			//Enter Email Id and Mobile Number
			String MemberEmailId= memberPage.enterEmailId();
			memberPage.enterPhoneNo();
			memberPage.enterUserName();
			memberPage.selectGender();
			memberPage.clickDob();
			delay(2000);
			memberPage.clickOnProceed();
			
			//Selecting package types
			memberPage.selectPackageType();
			memberPage.selectPackage();
			memberPage.selectACouponCode();
			memberPage.clickAssignATrainer();
			delay(3000);  
			memberPage.clickSaveButton();
			memberPage.clickOnSubmitButton();
			delay(5000);
			
			//Clicking on Yes Radio Button for Pay in Installments
			memberPage.clickOnYesButton();
			memberPage.currentAmount();
			memberPage.selectPartialPaymentModeDD();
			delay(3000);
			memberPage.enterPaymentReferenceNumber();
			memberPage.enterRegistrationNumber();
			memberPage.scroll();
			delay(2000);
			memberPage.submit();
			memberPage.waitForDetailsPageToLoad();
			
			//Verify the Member is created
			Assert.assertEquals(MemberEmailId,memberPage.emailIdGetText(),"Email is mismatch");
			delay(3000);
			
			//Advanced Filters
			memberPage.memberLinkIcon();
			memberPage.clickAdvancedFilters();
			delay(2000);
			memberPage.EmailFilter(MemberEmailId);
			delay(3000);
	
			//Verify Filter Result is Displaying
			Assert.assertTrue(memberPage.verifyFilter(), "Filter not Verified");
			
			//Clear Filter
			memberPage.clearFilter();
			delay(2000);
			
			//Verify filter is cleared
			Assert.assertEquals(memberPage.verifyClear(),"Add A Member","Filter not cleared");
			
		}
}
	