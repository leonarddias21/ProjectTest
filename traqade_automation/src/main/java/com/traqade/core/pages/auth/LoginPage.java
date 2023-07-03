package com.traqade.core.pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class LoginPage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	private String loginPageUrl = "https://staging.traqade.com/staff/login";

	private By usernameLocator = By.name("staffMobile");
	private By sendOtpButtonLocator = By.id("sendStaffMobileNumberForOTPBtn");

	private By mobileOtp = By.name("staffMobileOtp");
	private By loginButtonLocator = By.id("sendOTPForVerificationBtn");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void open() {
		openUrl(loginPageUrl);
	}

	public void waitForLoginPageToLoad() {
		waitForVisibilityOf(usernameLocator, 5);
	}

	public void waitForOTPScreen() {
		waitForVisibilityOf(mobileOtp, 5);
	}

	public void sendOTP(String mobile) {
		log.info("Entering mobile");
		find(usernameLocator).sendKeys(mobile);
		clickSendOtpButton();
	}

	public AuthorizeCenterPage login(String otp) {
		log.info("Entering OTP");
		find(mobileOtp).sendKeys(otp);
		clickLoginButton();
		return new AuthorizeCenterPage(driver);
	}

	private void clickSendOtpButton() {
		log.info("Clicking Send OTP button");
		find(sendOtpButtonLocator).click();
	}

	private void clickLoginButton() {
		log.info("Clicking Login button");
		WebElement loginButton = find(loginButtonLocator);
		loginButton.click();
	}

}
