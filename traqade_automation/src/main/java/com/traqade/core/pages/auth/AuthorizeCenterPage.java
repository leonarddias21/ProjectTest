package com.traqade.core.pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class AuthorizeCenterPage extends BasePageObject {
	
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	private By centerSelect = By.xpath("//table[@class='table no-border']//tr[1]//td/a[contains(text(),'Select')]");
	
	
	
	public AuthorizeCenterPage(WebDriver driver) {
		super(driver);
	}

	public String getH2Title() {
		return find(By.xpath(".//h2")).getText();
	}
	
	public DashboardPage clickSelectButton() {
		log.info("Clicking Select button");
		find(centerSelect).click();
		return new DashboardPage(driver);
	}
}
