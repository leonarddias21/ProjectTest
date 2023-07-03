package com.traqade.tests.leads;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.LeadsPage;
import com.traqade.core.pages.auth.MemberPage;
import com.traqade.tests.auth.AuthTest;

public class LeadConvertTest extends AuthTest {

	@Test(priority = 1)
	public void leadsTest() throws InterruptedException {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait to load the webpage
		delay(2000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();

		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();

		// Redirecting to Leads Page
		LeadsPage leadsPage = dashBoardPage.clickLeadsModule();
		leadsPage.waitForLeadPageToLoad();

		// Clicking on Add Lead button
		leadsPage.clickAddLeadButton();
		leadsPage.waitForLeadFormPageToOpen();

		// Enter lead deatils in the lead form
		String leadEmailAddress = leadsPage.inputEmail();

		leadsPage.inputName();
		leadsPage.waitForGenderDropToLoad();
		leadsPage.clickGenderDropDown();

		leadsPage.selectGender();
		leadsPage.clickAssignDropDown();
		delay(9000);

		leadsPage.selectAssignTo();
		leadsPage.clickSaveButton();
		delay(5000);

		// Verify the lead is created
		Assert.assertEquals(leadEmailAddress, leadsPage.emailIdGetText(), "Email is mismatch");

		MemberPage memberPage = leadsPage.clickConvertToMemberButton();
		delay(3000);
		memberPage.enterPhoneNo();
		memberPage.clickOnProceed();
		memberPage.selectPackageType();
		memberPage.selectPackage();
		memberPage.clickAssignATrainer();
		memberPage.clickSaveButton();
		memberPage.clickOnSubmitButton();
		memberPage.selectCard();
		memberPage.scroll();
		memberPage.submit();
		memberPage.waitForMemberPageToLoad();

		// Verify member is created
		Assert.assertEquals(leadEmailAddress, memberPage.emailIdGetText(), "Email is mismatch");
		
		delay(5000);

		memberPage.scrollDownTillInvoice();

		// Check the send invoice link is present
		Assert.assertTrue(memberPage.isSendInvoiceLinkPresent(), "Send Invoice Link is not present");

		// Check the view invoice link is present
		Assert.assertTrue(memberPage.isViewInvoiceLinkPresent(), "View Invoice Link is not present");

		memberPage.clickSendInvoiceLink();
		memberPage.clickConfirmButton();
		delay(3000);

		// Verify invoice toaster is getting display
		Assert.assertEquals(memberPage.invoiceToaster(), "Invoice Mailed Successfully, Please Check Your Inbox!",
				"Validation is mismatch");

		// Navigating to Lead listing page
		memberPage.selectLeadModule();
		leadsPage.clickAdvancedFilters();
		leadsPage.inputEmailId(leadEmailAddress);
		delay(5000);

		// Verify lead converted text is displayed
		Assert.assertEquals(leadsPage.leadConverted(), "Lead Converted", "Incorrect Message is getting display");

	}

}
