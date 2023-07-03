package com.traqade.core;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTest {

	private static final Logger log = LoggerFactory.getLogger(BaseTest.class);

	 protected WebDriver driver;
	

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "environment", "platform" })
	protected void init(@Optional("chrome") String browser, @Optional("local") String environment,
			@Optional String platform) {
		DriverFactory factory = new DriverFactory(browser);

		driver = factory.createDriver();
		//delay(10000);
		driver.manage().window().maximize();
		
	}

	@AfterMethod(alwaysRun = true)
	protected void close() {
		// Closing driver
		log.info("Closing driver");
		driver.quit();
	}

	protected void delay(Integer timeOutInSeconds) {
		try {
			Thread.sleep(timeOutInSeconds);
		} catch (InterruptedException e) {
			log.error(e.getMessage(), e);
		}
	}

	protected void takeScreenshot(String fileName) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//test-output//screenshots//" + fileName + ".png";
		try {
			FileUtils.copyFile(scrFile, new File(path));
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
	}
}