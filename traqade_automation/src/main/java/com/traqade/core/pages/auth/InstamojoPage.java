package com.traqade.core.pages.auth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class InstamojoPage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(InstamojoPage.class);

	private By paymentOption = By.xpath(
			"//div[@class='payments-container is--embed-iframe']//div[@class='payments-form']//../ul[@class='push-half--top']/li[3]/a//span[2]");
	private By bankDropdown = By.xpath("//option[contains(text(),'Choose another Bank')]");
	private By selectBank = By.xpath("//ul[@class='form-items-container ']//option[contains(text(),'Test Bank')]");
	private By checkoutButton = By.xpath("//ul[@class='form-items-container ']//input[@type='submit']");
	private By submitButton = By.xpath("//input[@type='submit']");
	private By amountText = By.xpath("//b[contains(text(),'1000.00')]");
	private By formPay = By.xpath("//body/form");

	public InstamojoPage(WebDriver driver) {
		super(driver);
	}

	public void clickNetBankingOption() {
		waitForVisibilityOf(paymentOption, 10);
		log.info("Click NetBanking Option");
		find(paymentOption).click();
	}

	public void clickBankDropdown() {
		log.info("Click Dropdown");
		find(bankDropdown).click();
	}

	public void clickTestBank() {
		log.info("Click TestBank");
		find(selectBank).click();
	}

	public void switchToChildWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> r1 = driver.getWindowHandles();
		Iterator<String> i2 = r1.iterator();
		while (i2.hasNext()) {
			String childwindow = i2.next();
			if (!parentWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(paymentOption);
				find(paymentOption).click();

			}

		}

	}

	public void clickCheckoutButton() {
		log.info("Click Checkout Button");
		find(checkoutButton).click();
	}

	public void clickSubmitButton() {
		log.info("Click Submit Button");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		find(submitButton).click();

	}

	public void waitForPaymentPageToLoad() {
		waitForVisibilityOf(formPay, 20);
	}

	public void waitForPaymentSuccessPage() {
		waitForVisibilityOf(amountText, 20);
	}

	public String paidAmount() {
		return find(amountText).getText();

	}

	public void switchToParentWindow() {
		// Get all window handles
		Set<String> allHandles = driver.getWindowHandles();

		// Get current handle or default handle
		String currentWindowHandle = allHandles.iterator().next();

		// Remove first/default Handle
		allHandles.remove(allHandles.iterator().next());

		// get the last Window Handle
		allHandles.iterator().next();

		driver.switchTo().window(currentWindowHandle);
		System.out.println(driver.getTitle());
	}

}