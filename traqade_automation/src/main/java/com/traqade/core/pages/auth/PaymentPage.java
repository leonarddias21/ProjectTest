package com.traqade.core.pages.auth;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class PaymentPage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(PaymentPage.class);

	private By paymentRequestButton = By.xpath("//a[@id='addNewPaymentRequestButton']");
	private By buyerNameField = By.xpath("//input[@id='buyerName']");
	private By emailField = By.xpath("//input[@id='emailId']");
	private By phoneField = By.xpath("//input[@id='phone']");
	private By amountField = By.xpath("//input[@id='amount']");
	private By reasonField = By.xpath("//input[@id='paidFor']");
	private By requestButton = By.xpath("//button[contains(text(),'Add Request')]");
	private By paymentToaster = By.xpath("//*[text()[contains(.,'Payment Request Created Successfully')]]");

	private By requestMemberLink = By
			.xpath("//div[@class='align-pagination content-wrapper']//../table/tbody/tr[1]/td[1]//a");
	private By resendPaymentLink = By.xpath("//a[contains(text(),'Resend Payment Link')]");
	private By resendToaster = By
			.xpath("//*[text()[contains(.,'Payment Link Mailed Successfully, Please Check Your Inbox!')]]");
	private By paymentUrl = By.xpath("//div[@class='member-details']//../a[@target='_blank']");
	private By paymentsLink = By.xpath("//p[contains(text(),'payments')]");
	private By dashBoardLink = By.xpath("//p[contains(text(),'Dashboard')]");
	private By amountPaid = By.xpath("//div[1]/div[1]/table/tbody/tr[3]/td[2]");
	private By paymentId = By.xpath("//div[3]//div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[2]");
	private By accountIcon = By.xpath("//div[@class='el-popover__reference']//img[1]");

	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	public void clickAddPaymentRequestButton() {
		log.info("Click Add Payment Request Button");
		find(paymentRequestButton).click();
	}

	public String inputBuyerName() {
		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String buyerName = "test" + userName;
		log.info("Entering Email");
		find(buyerNameField).sendKeys(buyerName);
		return buyerName;
	}

	public String inputBuyerEmail() {
		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String emailID = "testpay" + userName + "@gmail.com";
		log.info("Entering Email");
		find(emailField).sendKeys(emailID);
		return emailID;
	}

	public void inputBuyerMobileNo() {
		String randomNumbers = RandomStringUtils.randomNumeric(9);
		String phNo = 9 + randomNumbers;
		log.info("Entering Mobile No");
		find(phoneField).sendKeys(phNo);
	}

	public void inputAmount() {
		log.info("Entering the amount");
		find(amountField).sendKeys("1000");

	}

	public void inputReason() {
		log.info("Entering reason");
		find(reasonField).sendKeys("Gympk");
	}

	public void clickAddRequestButton() {
		log.info("Click Add Request Button");
		find(requestButton).click();
	}

	public String paymentConfirmationToaster() {
		return find(paymentToaster).getText();
	}

	public void clickMemberRequestIdLink() {
		log.info("Click Member Request Id Link");
		find(requestMemberLink).click();
	}

	public void clickResendPaymentLink() {
		log.info("Click Resend Payment Link");
		find(resendPaymentLink).click();
	}

	public String paymentResendConfirmationToaster() {
		return find(resendToaster).getText();
	}

	public InstamojoPage clickPaymentRequestUrl() {
		log.info("Click Payment Request Url");
		find(paymentUrl).click();
		return new InstamojoPage(driver);
	}

	public void clickDashBoardLink() {
		log.info("Click DashBoard Link");
		find(dashBoardLink).click();
	}

	public PaymentPage clickPayment() {
		log.info("Hovering on More");
		WebElement hover = driver.findElement(By.xpath("//div[@class='menu-link__icon menu-link__icon--more']"));
		log.info("clicking Payment Module");
		WebElement pt = driver.findElement(paymentsLink);
		Actions pm = new Actions(driver);
		pm.moveToElement(hover).click().moveToElement(pt).click().build().perform();
		return new PaymentPage(driver);
	}

	public void waitForDashboardPageToLoad() {
		waitForVisibilityOf(accountIcon, 10);
	}

	public void waitForPaymentPageToLoad() {
		waitForVisibilityOf(requestMemberLink, 10);
	}

	public String paidAmountText() {
		log.info("Get the amount text");
		String amount = find(amountPaid).getText();
		return amount.replaceAll("\\W+", "");

	}

	public boolean isPaymentIdPresent() {
		log.info("Checking Payment Id is present");
		find(paymentId);
		return true;
	}

}