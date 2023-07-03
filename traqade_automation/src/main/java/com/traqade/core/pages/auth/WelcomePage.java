package com.traqade.core.pages.auth;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class WelcomePage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	private String traqadeUrl = "https://staging.traqade.com";
	private By requestDemoButton = By.xpath("//a[@class='btn btn-white-out requestDemoButton']");
	private By nameField = By.xpath("//input[@placeholder='Name']");
	private By mobileField = By.xpath("//input[@placeholder='Mobile']");
	private By emailField = By.xpath("//input[@placeholder='Email']");
	private By centerName = By.xpath("//input[@placeholder='Fitness Centre Name']");
	private By cityField = By.xpath("//input[@placeholder='City']");
	private By textField = By.xpath("//textarea[@placeholder='Any Message (Optional)']");
	private By submitButton = By.xpath("//button[@type='submit']");
	private By title = By.xpath("//h4[contains(text(),'Thank you!')]");
	private By popUp = By.xpath("//div[@id='OnAdPopup']//./button[@type='button']");

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	public String getLoginText() {
		return find(By.xpath("//a[contains(text(),'Login')]")).getText();
	}

	public void waitForTraqadeWelcomePageToLoad() {
		waitForVisibilityOf(popUp, 5);
	}

	public void openTraqadeUrl() {
		openUrl(traqadeUrl);
	}

	public void clickRequestDemoButton() {
		log.info("Clicking Request Demo Button");
		find(requestDemoButton).click();
	}

	public void inputDemoName() {
		log.info("Entering Demo Name");
		find(nameField).sendKeys("Automation");
	}

	public void inputDemoMobileNo() {
		String randomNumbers = RandomStringUtils.randomNumeric(9);
		String phNo = 7 + randomNumbers;
		log.info("Entering Mobile No");
		find(mobileField).sendKeys(phNo);
	}

	public String inputDemoEmail() {
		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String emailID = "test" + userName + "@gmail.com";
		log.info("Entering Email");
		find(emailField).sendKeys(emailID);
		return emailID;
	}

	public void inputCenterName() {
		log.info("Entering Center Name");
		find(centerName).sendKeys("Fitness Club");
	}

	public void inputCity() {
		log.info("Entering City Name");
		find(cityField).sendKeys("Bangalore");
	}

	public void inputTextMessage() {
		log.info("Entering message");
		find(textField).sendKeys("This is text automation");
	}

	public void clickDemoSubmitButton() {
		log.info("Clicking Submit Request Demo Button");
		find(submitButton).click();
	}

	public String getTitle() {
		return find(title).getText();
	}

	public void clickPopupLink() {
		log.info("Clicking Popup Link");
		find(popUp).click();
	}
}