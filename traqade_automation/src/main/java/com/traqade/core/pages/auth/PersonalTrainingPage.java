package com.traqade.core.pages.auth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class PersonalTrainingPage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	private By addAppointmentButton = By.xpath("//span[contains(text(),'add appointment')]");
	private By selectService = By.xpath("//input[@placeholder='Select A Service']");
	private By personalTrainingOption = By.xpath("//span[contains(text(),'Personal Training')]");
	private By searchClient = By.xpath("//input[@placeholder='Search for Client']");
	private By memberList = By.xpath("//span[contains(text(),'Testautomate10')]");
	private By trainerDropDown = By
			.xpath("//form[@class='el-form add-appointment-form']/div[3]/div[1]/div[1]/div[1]/span[1]/span[1]/i[1]");
	private By selectTrainer = By
			.xpath("//body/div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']//ul/li[3]");
	private By dateIcon = By
			.xpath("//form[@class='el-form add-appointment-form']//i[@class='el-input__icon el-icon-date']");
	private By availableToday = By.xpath("//tr[@class='el-date-table__row']//td[@class='available today']");
	private By hourOption = By.xpath("//div[@class='el-form-item']//input[@placeholder='Hour']");
	private By sevenHour = By.xpath(
			"//*[@class='el-dialog__wrapper']/../div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div/ul/li");
	private By minOption = By.xpath("//div[@class='el-form-item']//input[@placeholder='Min']");
	private By zeroMinute = By.xpath("//li[@class='el-select-dropdown__item']//span[contains(text(),'00')]");
	private By timeOption = By.xpath(
			"//div[@class='el-dialog__wrapper']//div[3]//div[1]//div[1]//div[1]//div[1]//span[1]//..//i[@class='el-select__caret el-input__icon el-icon-arrow-up']");
	private By selectPm = By.xpath(
			"//div[@class='el-dialog__wrapper']//../div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div/ul/li[contains(text(),'PM')]");
	private By pickDuration = By.xpath("//input[@placeholder='Pick Duration']");
	private By sixtyMin = By.xpath("//li[@class='el-select-dropdown__item']//span[contains(text(),'60 min')]");
	private By createAppointmentButton = By.xpath("//span[contains(text(),'create appointment')]");

	private By allTrainers = By
			.xpath("//div[@class='el-col el-col-10']//i[@class='el-select__caret el-input__icon el-icon-arrow-up']");
	private By trainerSelect = By.xpath("//body/div[@class='el-select-dropdown el-popper']//div/ul/li[4]");
	private By scrollPT = By.xpath("//div[@class='appointment-cell']/div[contains(text(),'PT')]");
	private By appointmentTime = By.xpath("//div[@class='popover-reference el-popover__reference']");
	private By cancelButton = By.xpath("//div[@class='action footer-action__cancel-event']//div[@class='action-icon']");
	private By confirmButton = By.xpath("//span[contains(text(),'Confirm')]");
	private By appointmentConfirmation = By
			.xpath("//*[text()[contains(.,'Appointment Booking Created Successfully!')]]");
	private By appointmentCancel = By.xpath("//*[text()[contains(.,'Appointment Booking Cancelled Successfully!')]]");

	private By selectAM = By.xpath(
			"//div[@class='el-dialog__wrapper']//../div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div/ul/li[contains(text(),'AM')]");
	private By validationMessage = By.xpath("//*[text()[contains(.,'Appointment Can Not Be Created In Past Time')]]");
	private By anotherMember = By.xpath("//span[contains(text(),'Manual')]");
	private By appointmentBooked = By
			.xpath("//*[text()[contains(.,'Trainer Already Has A Booking At This Time Slot')]]");

	private By assignTrainerDropdown = By.xpath("//div[contains(text(),'Assign Trainer')]");
	private By dropDown = By
			.xpath("//div[@class='event event-assign-trainer']//div[@class='el-form-item__content']//../i");
	private By trainerDisabled = By.xpath(
			"//div[@id='root']//../div[@class='el-select-dropdown el-popper']//div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul/li[@class='el-select-dropdown__item is-disabled']");
	private By trainerReassigned = By.xpath("//body/div[6]/div[1]//ul/li[2]");
	private By saveLink = By.xpath("//body/div[@role='tooltip']/div[4]//button//span[contains(text(),'Save')]");
	private By reassignedTrainer = By.xpath("//body/div[@class='el-select-dropdown el-popper']//div/ul/li[3]");

	private By memberRepeat = By.xpath("//span[contains(text(),'Repeat Client')]");
	private By repeatCheckbox = By
			.xpath("//form[@class='el-form add-appointment-form']//../span[@class='el-checkbox__inner']");
	private By sundayWeek = By.xpath("//div[@role='group']//label/span[contains(text(),'Sunday')]");
	private By tuesdayWeek = By.xpath("//div[@role='group']//label[2]");
	private By wednesdayWeek = By.xpath("//div[@role='group']//label[3]");
	private By thursdayWeek = By.xpath("//div[@role='group']//label[4]");
	private By fridayWeek = By.xpath("//div[@role='group']//label[5]");
	private By saturdayWeek = By.xpath("//div[@role='group']//label[6]");

	private By firstAppointment = By
			.xpath("//div[@class='tq-time-table__class-grid']/div[1]//../div[@class='appointment-cell']");
	private By commonCancel = By.xpath("//body/div[@role='tooltip']//../div[contains(text(),'Cancel Event')]");
	private By commonConfirm = By.xpath("//body/div[@role='tooltip']//../button/span[contains(text(),'Confirm')]");
	private By appointmentButton = By.xpath("//div[@class='no-data']//../button");
	private By notMember = By.xpath("//p[contains(text(),'Member Not Found')]");
	private By invalidPackage = By.xpath("//span[contains(text(),'Invalidpackage')]");
	private By packageExpire = By.xpath(
			"//*[text()[contains(.,'Member Does Not Have Active Personal Training Package For The Selected Date')]]");

	private By virtualTrainingOption = By.xpath("//span[contains(text(),'Virtual Training')]");
	private By virtualMember = By.xpath("//span[contains(text(),'Virtual Member')]");
	private By virtualAppointment = By.xpath(
			"//div[@class='tq-time-table__class-grid']//div[@class='appointment-cell']//div[@class='popover-reference el-popover__reference']");
	private By placeHolder = By.xpath("//input[@placeholder='Select Trainer']");
	private By inactiveTrainer = By.xpath("//p[contains(text(),'No matching data')]");

	public PersonalTrainingPage(WebDriver driver) {
		super(driver);
	}

	public void clickAddAppointmentButton() {
		log.info("Click Add Appointment Button");
		find(addAppointmentButton).click();
	}

	public void selectPersonalTraining() throws InterruptedException {
		log.info("Click Service Drop Down");
		find(selectService).click();
		Thread.sleep(3000);
		log.info("Select Personal Training");
		find(personalTrainingOption).click();
	}

	public void selectClient() throws InterruptedException {
		log.info("Click Search Client Field");
		find(searchClient).sendKeys("Testautomate10");
		Thread.sleep(5000);
		log.info("Select the Client");
		WebElement member = driver.findElement(memberList);

		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", member);

	}

	public void selectTrainer() throws InterruptedException {
		log.info("Click Trainer Drop Down");
		find(trainerDropDown).click();
		Thread.sleep(3000);
		log.info("Select Trainer");
		WebElement ele = driver.findElement(selectTrainer);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
	}

	public void selectCurrentDate() throws InterruptedException {
		log.info("Click Date Icon");
		find(dateIcon).click();
		Thread.sleep(3000);
		log.info("Select Today Date");
		find(availableToday).click();
	}

	public void selectHour() throws InterruptedException {
		log.info("Click Time Drop Down");
		find(hourOption).click();
		Thread.sleep(3000);
		log.info("Select 7 Hour");
		List<WebElement> dates = driver.findElements(sevenHour);
		int total = dates.size();
		System.out.println(total);
		for (int i = 1; i <= total; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("7")) {

				dates.get(i).click();
				break;
			}

		}
	}

	public void selectMinute() throws InterruptedException {
		log.info("Click Minute Drop Down");
		find(minOption).click();
		Thread.sleep(3000);
		log.info("Select Zero Minute");
		WebElement minute = driver.findElement(zeroMinute);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", minute);
	}

	public void selectTime() throws InterruptedException {
		log.info("Click Time Drop Down");
		find(timeOption).click();
		Thread.sleep(3000);
		log.info("Select PM");
		find(selectPm).click();
	}

	public void selectDuration() throws InterruptedException {
		log.info("Click Duration Drop Down");
		find(pickDuration).click();
		Thread.sleep(3000);
		log.info("Select 60 Minutes");
		find(sixtyMin).click();
	}

	public void clickCreateAppointmentButton() {
		log.info("Click Create Appointment Button");
		find(createAppointmentButton).click();
	}

	public void clickAllTrainers() {
		log.info("Click All Trainers");
		find(allTrainers).click();
		waitForVisibilityOf(trainerSelect, 10);
		log.info("Trainer Select ");
		WebElement trainer = driver.findElement(trainerSelect);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", trainer);
	}

	public void scrollDown() {
		log.info("Scroll Down the page");
		WebElement lastElement = driver.findElement(scrollPT);
		int y = lastElement.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + y + ")");
	}

	public void clickSchduleAppointmentLink() {
		log.info("Click on Appointment Schedule");
		WebElement appointment = driver.findElement(appointmentTime);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", appointment);
	}

	public void clickAssignTrainerLink() {
		log.info("Click Assign Trainer Link");
		find(assignTrainerDropdown).click();
	}

	public void clickDropdown() {
		log.info("Click Dropdown");
		find(dropDown).click();
	}

	public boolean isTrainerDisabled() {
		log.info("Checking Assigned Trainer Disabled");
		find(trainerDisabled);
		return true;
	}

	public void selectAnotherTrainer() {
		log.info("Select another trainer");
		find(trainerReassigned).click();
	}

	public void clickSaveLink() {
		log.info("Click Save Link");
		find(saveLink).click();
	}

	public void clickCancelButton() {
		log.info("Click Cancel Button");
		find(cancelButton).click();
	}

	public void clickConfirmButton() {
		log.info("Click Confirm Button");
		find(confirmButton).click();
	}

	public String appointmentConfirmationToaster() {
		return find(appointmentConfirmation).getText();
	}

	public String appointmentCancelToaster() {
		return find(appointmentCancel).getText();
	}

	public void pastHour() throws InterruptedException {
		log.info("Click Time Drop Down");
		find(hourOption).click();
		Thread.sleep(3000);
		log.info("Select 6 Hour");
		List<WebElement> dates = driver.findElements(sevenHour);
		int total = dates.size();
		System.out.println(total);
		for (int i = 1; i <= total; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("6")) {

				dates.get(i).click();
				break;
			}

		}
	}

	public void selectPastTime() throws InterruptedException {
		log.info("Click Time Drop Down");
		find(timeOption).click();
		Thread.sleep(3000);
		log.info("Select AM");
		find(selectAM).click();
	}

	public String pastHourAppointmentValidation() {
		return find(validationMessage).getText();
	}

	public void selectAnotherClient() throws InterruptedException {
		log.info("Click Search Client Field");
		find(searchClient).sendKeys("Manual");
		Thread.sleep(5000);
		log.info("Select the Client");
		WebElement member = driver.findElement(anotherMember);

		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", member);
	}

	public void selectSameTrainer() throws InterruptedException {
		log.info("Click Trainer Drop Down");
		find(trainerDropDown).click();
		Thread.sleep(3000);
		log.info("Select Trainer");
		WebElement eleo = driver.findElement(selectTrainer);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", eleo);
	}

	public void selectTodaysDate() throws InterruptedException {
		log.info("Click Date Icon");
		find(dateIcon).click();
		Thread.sleep(3000);
		log.info("Select Today Date");
		find(availableToday).click();
	}

	public String alreadyBookedAppointment() {
		return find(appointmentBooked).getText();
	}

	public void selectReAssignedTrainer() {
		log.info("Click All Trainers");
		find(allTrainers).click();
		waitForVisibilityOf(reassignedTrainer, 10);
		log.info("Reassigned Trainer ");
		WebElement retrainer = driver.findElement(reassignedTrainer);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", retrainer);
	}

	public void selectRepeatClient() throws InterruptedException {
		log.info("Click Search Client Field");
		find(searchClient).sendKeys("Repeat Client");
		Thread.sleep(5000);
		log.info("Select the Client");
		WebElement member = driver.findElement(memberRepeat);

		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", member);

	}

	public void clickRepeatCheckbox() {
		WebElement lastElement = driver.findElement(repeatCheckbox);
		int y = lastElement.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + y + ")");
		log.info("Click Repeat Checkbox");
		find(repeatCheckbox).click();
	}

	public void scrollTillSunday() {
		log.info("Scroll Till Sunday");
		find(sundayWeek).click();
	}

	public void selectAllDays() throws InterruptedException {
		log.info("Select Tuesday");
		find(tuesdayWeek).click();
		Thread.sleep(3000);
		log.info("Select Wednesday");
		find(wednesdayWeek).click();
		Thread.sleep(3000);
		log.info("Select Thursday");
		find(thursdayWeek).click();
		Thread.sleep(3000);
		log.info("Select Friday");
		find(fridayWeek).click();
		Thread.sleep(3000);
		log.info("Select Saurday");
		find(saturdayWeek).click();
		Thread.sleep(3000);
		log.info("Deselect Thursday");
		find(thursdayWeek).click();
		Thread.sleep(3000);
		log.info("Deselect Friday");
		find(fridayWeek).click();
		Thread.sleep(3000);
		log.info("Deselect Saurday");
		find(saturdayWeek).click();
		Thread.sleep(3000);
		log.info("Deselect Sunday");
		find(sundayWeek).click();
		Thread.sleep(3000);
	}

	public void clickFirstSchduleAppointmentLink() throws InterruptedException {
		log.info("Click on Appointment Schedule");
		find(firstAppointment).click();
	}

	public void clickCommonCancel() {
		log.info("Click Cancel");
		find(commonCancel).click();
	}

	public void clickCommonConfirm() throws InterruptedException {
		log.info("Click Confirm");
		find(commonConfirm).click();
		Thread.sleep(3000);
	}

	public boolean isAppointmentButtonPresent() {
		log.info("Checking Appointment button present");
		find(appointmentButton);
		return true;
	}

	public void selectNotMember() throws InterruptedException {
		log.info("Click Search Client Field");
		find(searchClient).sendKeys("NotMember");
		Thread.sleep(5000);
	}

	public String notMemberValidation() {
		return find(notMember).getText();
	}

	public void selectInvalidMemberPackage() throws InterruptedException {
		log.info("Click Search Client Field");
		find(searchClient).sendKeys("Invalidpackage");
		Thread.sleep(5000);
		log.info("Select the Client");
		WebElement member = driver.findElement(invalidPackage);

		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", member);

	}

	public String packageExpireValidation() {
		return find(packageExpire).getText();
	}

	public void selectVirtualTraining() throws InterruptedException {
		log.info("Click Service Drop Down");
		find(selectService).click();
		Thread.sleep(3000);
		log.info("Select Virtual Training");
		find(virtualTrainingOption).click();
	}

	public void selectVirtualClient() throws InterruptedException {
		log.info("Click Search Client Field");
		find(searchClient).sendKeys("Virtual Member");
		Thread.sleep(5000);
		log.info("Select the Virtual Client");
		WebElement virtual = driver.findElement(virtualMember);

		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", virtual);

	}

	public void scrollVTDown() {
		log.info("Scroll Down the page");
		WebElement lastElement = driver.findElement(virtualAppointment);
		int y = lastElement.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + y + ")");
	}

	public void clickVirtualAppointmentLink() {
		log.info("Click on Virtual Appointment Schedule");
		WebElement vAppointment = driver.findElement(virtualAppointment);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", vAppointment);
	}

	public void checkInactiveTrainer(String inactiveStaff) throws InterruptedException {
		log.info("Click Trainer Drop Down");
		find(trainerDropDown).click();
		Thread.sleep(3000);
		log.info("Click Search Client Field");
		find(placeHolder).sendKeys(inactiveStaff);
		Thread.sleep(5000);

	}

	public String getErrorText() {
		return find(inactiveTrainer).getText();
	}

}
