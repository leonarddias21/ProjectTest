package com.traqade.core.pages.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class DashboardPage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	private By accountIcon = By.xpath("//div[@class='el-popover__reference']//img[1]");

	private By signOut = By.xpath("//span[contains(text(),'Sign Out')]");

	private By staffIcon = By.xpath("//p[contains(text(),'staff')]");

	private By leadsModule = By.xpath("//a[contains(@href,'leads')]");

	private By Membericon = By.xpath("//p[@class='menu-link__name'][contains(text(),'members')]");

	private By packageIcon = By.xpath("//p[contains(text(),'packages')]");
	private By closeNotifyPopUp = By.xpath("//div[@class='notification__close-icon']");

	private By personalTrainingLink = By.xpath("//p[contains(text(),'PT')]");
	private By more = By.xpath("//div[@id='root']/section[1]/aside[1]/nav[1]/ul[1]/span[1]/li[1]/a[1]");

	private By tasksIcon = By.xpath("//li[2]//a[1]");

	private By paymentsLink = By.xpath("//p[contains(text(),'payments')]");

	private By campaignIcon = By.xpath("//a[@href='/campaign']");

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public String getLoginText() {
		return find(By.xpath("//a[contains(text(),'Login')]")).getText();
	}

	public void waitForDashboardPageToLoad() {
		waitForVisibilityOf(accountIcon, 10);
	}

	public void clickNotifyIcon() {

		log.info("Closing the Notify Pop Up");
		find(closeNotifyPopUp).click();
	}

	public void waitForDashboardPageStaffIconToLoad() {
		waitForVisibilityOf(staffIcon, 5);
	}

	public void clickstafficon() {
		log.info("Clicking Staff Icon");
		find(staffIcon).click();

	}

	public String staffTitleGetText() {
		return find(By.xpath("//span[@class='el-breadcrumb__inner']")).getText();
	}

	public PackagePage clickPackageIcon() {
		log.info("Hovering on More");
		WebElement ele = driver.findElement(more);
		WebElement ele1 = driver.findElement(packageIcon);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).click().moveToElement(ele1).click().build().perform();
		return new PackagePage(driver);
	}

	public void clickAccountIcon() {
		log.info("Clicking User Account Icon");
		find(accountIcon).click();
	}

	public WelcomePage clickSignOutButton() {
		log.info("clicking SignOut Button");
		find(signOut).click();
		return new WelcomePage(driver);
	}

	public MemberPage clickmembericon() {
		log.info("clicking Member icon");
		find(Membericon).click();
		return new MemberPage(driver);
	}

	public LeadsPage clickLeadsModule() {
		log.info("clicking Leads Module");
		find(leadsModule).click();
		return new LeadsPage(driver);
	}

	public PersonalTrainingPage clickPersonalTrainingModule() {
		log.info("Hovering on More");
		WebElement hover = driver.findElement(By.xpath("//div[@class='menu-link__icon menu-link__icon--more']"));
		log.info("clicking Personal Training Module");
		WebElement pt = driver.findElement(personalTrainingLink);
		Actions ac = new Actions(driver);
		ac.moveToElement(hover).click().moveToElement(pt).click().build().perform();
		return new PersonalTrainingPage(driver);
	}

	public TasksPage clickTasksIcon() {
		log.info("Clicking Tasks Module");
		find(tasksIcon).click();
		return new TasksPage(driver);

	}

	public CampaignPage clickCampaignIcon() {
		log.info("Hovering on More");
		WebElement ele = driver.findElement(
				By.xpath("//body/div[@id='root']/section[1]/aside[1]/nav[1]/ul[1]/span[1]/li[1]/a[1]/div[1]"));
		log.info("Clicking Campaign Module");
		WebElement ele1 = driver.findElement(campaignIcon);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).click().moveToElement(ele1).click().build().perform();
		return new CampaignPage(driver);
	}

	public StaffPage clickstaffModule() {

		log.info("Clicking Staff Icon");
		find(staffIcon).click();
		return new StaffPage(driver);

	}

	public PaymentPage clickPaymentModule() {
		log.info("Hovering on More");
		WebElement hover = driver.findElement(By.xpath("//div[@class='menu-link__icon menu-link__icon--more']"));
		log.info("clicking Payment Module");
		WebElement pt = driver.findElement(paymentsLink);
		Actions pm = new Actions(driver);
		pm.moveToElement(hover).click().moveToElement(pt).click().build().perform();
		return new PaymentPage(driver);
	}

}
