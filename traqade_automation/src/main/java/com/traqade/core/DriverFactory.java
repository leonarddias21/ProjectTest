package com.traqade.core;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverFactory {

	private static final Logger log = LoggerFactory.getLogger(DriverFactory.class);

	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private String browser;

	public DriverFactory(String browser) {
		this.browser = browser.toLowerCase();
	}

	public WebDriver createDriver() {
		String os = getOS();
		log.info("Creating driver for : " + browser + " browser on " + os + " OS");

		String driverExtension = os == "windows" ? ".exe" : "";
		// Creating driver
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/" + os + "/chromedriver"+driverExtension);
			driver.set(new ChromeDriver());
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/" + os + "/geckodriver"+driverExtension);
			driver.set(new FirefoxDriver());
			break;

		case "ie":
			System.setProperty("webdriver.ie.driver", "src/main/resources/drivers/"+os+"/IEDriverServer"+driverExtension);
			driver.set(new InternetExplorerDriver());
			break;

		
		  default: System.out.println("Unknown Browser.. starting chrome");
		  System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/" +
		  os + "/chromedriver"+driverExtension); driver.set(new ChromeDriver()); break;
		 
		}

		return driver.get();
	}

	private String getOS() {
		String os = SystemUtils.OS_NAME;
		log.info("Detected OS: " + os);

		os = os.toLowerCase();
		if (os.indexOf("win") >= 0) {
			return "windows";
		}
		if (os.indexOf("mac") >= 0) {
			return "mac";
		}
//		(os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0 )
		return "linux";
	}

}
