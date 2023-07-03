package com.traqade.tests.payments;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.InstamojoPage;
import com.traqade.core.pages.auth.PaymentPage;
import com.traqade.tests.auth.AuthTest;

public class PaymentTest extends AuthTest {

	@Test(priority = 1)
	public void paymentTest() throws Throwable {

		AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();

		// wait to load the webpage
		delay(2000);
		DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();

		dashBoardPage.waitForDashboardPageToLoad();
		dashBoardPage.clickNotifyIcon();
		PaymentPage paymentPage = dashBoardPage.clickPaymentModule();
		delay(3000);

		paymentPage.clickAddPaymentRequestButton();
		paymentPage.inputBuyerName();
		paymentPage.inputBuyerEmail();
		paymentPage.inputBuyerMobileNo();
		paymentPage.inputAmount();
		paymentPage.inputReason();
		paymentPage.clickAddRequestButton();
		delay(3000);

		// Verify Payment Request toaster is getting display
		Assert.assertEquals(paymentPage.paymentConfirmationToaster(), "Payment Request Created Successfully",
				"Incorrect toaster is getting display");

		paymentPage.clickMemberRequestIdLink();
		delay(5000);

		InstamojoPage instamojoPage = paymentPage.clickPaymentRequestUrl();
		instamojoPage.switchToChildWindow();
		delay(5000);
		instamojoPage.clickBankDropdown();
		instamojoPage.clickTestBank();
		instamojoPage.clickCheckoutButton();
		delay(9000);

		instamojoPage.clickSubmitButton();

		// Switch to Parent window
		instamojoPage.switchToParentWindow();

		delay(5000);
		paymentPage.clickDashBoardLink();
		paymentPage.waitForDashboardPageToLoad();
		dashBoardPage.clickPaymentModule();
		paymentPage.waitForPaymentPageToLoad();
		paymentPage.clickMemberRequestIdLink();
		delay(5000);
		String payAmountText = paymentPage.paidAmountText();

		// Check the amount paid is correct
		Assert.assertEquals(payAmountText, "1000", "Amount mismatch");

		// Check the payment id is present
		Assert.assertTrue(paymentPage.isPaymentIdPresent(), "Payment Id is not present");

	}

}