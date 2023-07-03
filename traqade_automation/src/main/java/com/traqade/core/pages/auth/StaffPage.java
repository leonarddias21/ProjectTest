package com.traqade.core.pages.auth;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class StaffPage extends BasePageObject {
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	//private By staffText = By.xpath("//span[@class='el-breadcrumb__inner')]");
	private By addStaff = By.xpath("//span[.='Add Staff']");
	private By emailAddress = By.xpath("//input[@placeholder='Enter Email Address']");
	private By phoneNumber = By.xpath("//input[@placeholder='Enter Phone Number']");
	private By staffName = By.xpath("//input[@placeholder='Enter Staff Name']");
	private By genderSelect = By.xpath("//input[@placeholder='Select Gender']");
	private By genderType = By.xpath("//span[contains(text(),'Male')]");
	private By dob = By.xpath("//input[@placeholder='Select Date']");
	private By date = By.xpath("//td[@class='available today']");
	private By roleSelect = By.xpath("//input[@placeholder='Select Role']");
	private By roleType = By.xpath(
			"//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper is-multiple']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[3]/span");
	private By specialisationSelect = By.xpath("//input[@placeholder='Select Specialisation']");
	private By specialisationType = By.xpath(
			"//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper is-multiple']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[3]/span[contains(text(),'Dance - Salsa')]");
	private By selectreportingManger = By.xpath("//input[@placeholder='Select Reporting Manager']");
	private By submitStaff = By.xpath(
			"//button[@class='el-button primary-gradient el-button--primary']//span[contains(text(),'Add Staff')]");
	// private By staffEmail =
	// By.xpath("//a[text()[contains(.,'@gmail.com')]]");
	private By toastStaffAdd = By.xpath("//*[contains(text(),'Staff Added Successfully!')]");
	private By staffNameRn = By.xpath("//div[@id='root']//tr[1]//td[2]");

	// Xpath for Staff Detail's Page Section
	private By attendanceTab = By.xpath("//div[@id='tab-second']");
	private By documentsTab = By.xpath("//div[@id='tab-third']");
	private By editBasicInfo = By
			.xpath("//div[@class='basic-info-container']//a[@class='edit'][contains(text(),'Edit')]");
	private By language = By.xpath("//input[@placeholder='Select languages']");
	private By submit = By.xpath("//span[contains(text(),'Submit')]");
	private By Address = By.xpath("//div[@id='tab-address']");
	private By presentAddress = By.xpath(
			"//body[@class='el-popup-parent--hidden']/div[@id='root']/section[@class='el-container']/section[@class='el-container is-vertical']/main[@class='el-main']/div[@class='main-content-container']/div[@class='tq-sd-container']/div[@class='sd-page-container']/div[@class='el-dialog__wrapper']/div[@class='el-dialog is-fullscreen tq-fullscreen-dialog add-discount-form-dialog']/div[@class='el-dialog__body']/div[@class='tq-fullscreen-dialog__form-container']/div/div[@class='filter-tab modal-tab el-tabs el-tabs--top']/div[@class='el-tabs__content']/div[@id='pane-address']/div/div[@class='tq-fullscreen-dialog__form-body']/form[@class='el-form']/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By pincode = By.xpath("//div[@class='el-form-item is-required']//input[@placeholder='Enter pincode']");
	private By locality = By
			.xpath("//div[@id='pane-address']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//span[1]//span[1]//i[1]");
	private By selectlocality = By.xpath(
			"//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[1]");
	private By actualXpathScroll = By.xpath("//p[@class='title title__2']");
	private By checkBoxPermanentAddress = By.xpath("//span[@class='el-checkbox__label']");
	private By saveButton = By.xpath("//div[@id='pane-address']//div//span[contains(text(),'Save')]");
	private By internalDetails = By.xpath("//div[@id='tab-internal']");
	private By editDesignation = By.xpath(
			"//body[@class='el-popup-parent--hidden']/div[@id='root']/section[@class='el-container']/section[@class='el-container is-vertical']/main[@class='el-main']/div[@class='main-content-container']/div[@class='tq-sd-container']/div[@class='sd-page-container']/div[@class='el-dialog__wrapper']/div[@class='el-dialog is-fullscreen tq-fullscreen-dialog add-discount-form-dialog']/div[@class='el-dialog__body']/div[@class='tq-fullscreen-dialog__form-container']/div/div[@class='filter-tab modal-tab el-tabs el-tabs--top']/div[@class='el-tabs__content']/div[@id='pane-internal']/div/div[@class='tq-fullscreen-dialog__form-body']/form[@class='el-form']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
	private By updateDesignation = By.xpath("//span[contains(text(),'Front Desk Staff')]");
	private By editSpecialisation = By.xpath(
			"//div[@id='pane-internal']//div[@class='el-row el-row--flex']//div[2]//div[1]//div[1]//div[1]//div[1]");
	private By updateSpecialisation = By.xpath("//span[contains(text(),'Personal Training')]");
	private By enterNotes = By.xpath("//input[@placeholder='Enter notes, if any.']");
	private By deactivate = By.xpath("//span[contains(text(),'Deactivate')]");
	private By deactivateOption = By.xpath("//button[@class='el-button el-button--danger el-button--mini']");
	private By activateStaff = By.xpath("//span[contains(text(),'Activate')]");
	private By activateOption = By.xpath("//button[@class='el-button el-button--danger el-button--mini']");
	private By delete = By.xpath("//u[contains(text(),'Delete')]");
	private By deleteOption = By.xpath("//button[@class='el-button el-button--danger el-button--mini']");
	private By attendanceCalendar = By.xpath("//input[@placeholder='Select a date']");
	private By attendance = By.xpath("//input[@placeholder='Select']");
	private By attendanceTypeAbsent = By.xpath("//span[contains(text(),'Absent')]");
	private By attendanceTypeLeave = By.xpath("//span[contains(text(),'Leave')]");
	private By inTime = By.xpath("//input[@placeholder='Select in time']");
	private By outTime = By.xpath("//input[@placeholder='Select out time']");
	private By markAttendanceButton = By.xpath("//span[contains(text(),'Mark Attendance')]");
	private By toastStaffDetails = By.xpath("//*[contains(text(),'Hindi, English')]");
	private By toastAttendance = By.xpath("//*[contains(text(),'Attendance Marked Successfully !')]");
	private By toastNote = By
			.xpath("//div[@class='el-notification__content']//p[contains(text(), 'Comment Added Successfully!')]");
	private By toastDeactivate = By
			.xpath("//div[@class='el-notification__content']//p[contains(text(), 'Staff Deactivated Successfully!')]");
	private By toastReactivate = By
			.xpath("//div[@class='el-notification__content']//p[contains(text(), 'Staff Reactivated Successfully!')]");
	private By toastInternalDetails = By.xpath(
			"//div[@class='el-notification__content']//p[contains(text(), 'Staff Internal Details Updated Successfully!')]");
	private By toastAddressUpdate = By
			.xpath("//div[@class='el-notification__content']//p[contains(text(), 'Address Updated Successfully!')]");

	// Xpath For Staff Filter Section
	private By staffFilter = By.xpath("//button[@class='el-button btn-icon el-button--default']");
	private By staffNameCheckBox = By
			.xpath("//div[@class='tq-filter__container']//div[1]//div[1]//label[1]//span[1]//span[1]");
	private By staffNameFilter = By
			.xpath("//div[@class='tq-filter__container']//div[1]//div[2]//div[1]//div[1]//input[1]");
	private By applyFilter = By.xpath("//button[@class='el-button primary-gradient el-button--primary']");
	private By staffName1 = By.xpath("//body//td[2]");
	private By staffphnCheckBox = By
			.xpath("//div[contains(@class,'form__body')]//div[2]//div[1]//label[1]//span[1]//span[1]");
	private By staffPhnFilter = By
			.xpath("//div[contains(@class,'form__body')]//div[2]//div[2]//div[1]//div[1]//input[1]");
	private By staffPhone1 = By.xpath("//body//td[3]//div[@class='table-cell']");
	private By staffEmailCheckBox = By.xpath("//span[contains(text(),'Email')]");
	private By staffEmailFilter = By.xpath("//div[@class='form__body']/div[3]/div[2]/div[1]//div[1]//input[1]");
	private By staffEmailVerify = By.xpath("//div[@class='table-cell text-email']");
	private By staffDesignationCheckBox = By.xpath("//span[contains(text(),'Designation')]");
	private By staffDesignationSelect = By.xpath("//div[4]//div[2]//div[1]//div[1]//div[1]//input[1]");
	private By staffDesignationType = By
			.xpath("//li[@class='el-select-dropdown__item']//span[contains(text(),'Manager')]");
	private By staffDesignation1 = By.xpath("//span[contains(@class,'table-cell')][contains(text(),'Manager')]");
	private By staffReportingManager = By.xpath("//span[contains(text(),'Reporting Manager')]");
	private By staffReportingManagerSelect = By.xpath("//div[5]//div[2]//div[1]//div[1]//div[1]//input[1]");
	private By actualXpathReportingManager = By
			.xpath("//div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[1]/li[1]");
	private By reportingManager1 = By
			.xpath("//table[contains(@class,'el-table__body')]/tbody[1]/tr[1]/td[4]/div[1]/div[1]");
	private By clearFilter = By.xpath("//span[@class='close']");

	// Xpath for Staff Active & Inactive
	private By staffInactive = By.xpath("//div[@id='tab-0']");
	private By staffActive = By.xpath("//div[@id='tab-1']");
	private By staffInactiveName = By.xpath("//tr[1]//div[@class='cell']/a/p");
	private By personalTrainingLink = By.xpath("//p[contains(text(),'PT')]");

	public StaffPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public StaffPage clickAddStaff() {
		log.info("Clicking Add Staff button");
		find(addStaff).click();
		return new StaffPage(driver);
	}

	public String enterEmailAdd() {
		String randomInt = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String randomEmail = "staff" + randomInt + "@gmail.com";
		log.info("Entering Email Id");
		find(emailAddress).sendKeys(randomEmail);
		return randomEmail;
	}

	// Entering Staff Phone No
	public String enterPhoneNo() {
		String randomPhn = RandomStringUtils.randomNumeric(9);
		;
		String phn = 9 + randomPhn;
		log.info("Entering Phone No");
		find(phoneNumber).sendKeys(phn);
		return phn;
	}

	// Entering Staff Name
	public String enterStaffName() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomStaffName = "";
		int length = 5;
		Random rn = new Random();
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for (int i = 0; i < text.length; i++) {
			randomStaffName += text[i];
		}
		log.info("Entering Staff Name");
		find(staffName).sendKeys(randomStaffName);
		return randomStaffName;
	}

	// ScrollBar in the Pop Up
	public void scrollStaffPopUp() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Role')]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
	}

	public void waitForGenderDropToLoad() {
		waitForVisibilityOf(genderSelect, 10);
	}

	public StaffPage clickGender() throws InterruptedException {
		log.info("Clicking Gender Field");
		find(genderSelect).click();
		log.info("Selecting gender type");
		find(genderType).click();
		return new StaffPage(driver);
	}

	public void waitForDOBCalendarToLoad() {
		waitForVisibilityOf(dob, 15);
	}

	public StaffPage clickDOBCalendar() throws InterruptedException {
		log.info("Clicking DOB calender");
		find(dob).click();
		log.info("Selecting date from the calender");
		find(date).click();
		return new StaffPage(driver);
	}

	public void waitForRoleDropToLoad() {
		waitForVisibilityOf(roleSelect, 5);
	}

	public StaffPage clickRole() throws InterruptedException {
		log.info("Clicking Role Field");
		find(roleSelect).click();
		Thread.sleep(2000);
		log.info("Selecting Staff Role");
		find(roleType).click();
		return new StaffPage(driver);
	}

	public void waitForSpecialisationToLoad() {
		waitForVisibilityOf(specialisationSelect, 5);
	}

	public StaffPage clickspecialisation() throws InterruptedException {
		log.info("Clicking specialisation field");
		find(specialisationSelect).click();
		Thread.sleep(2000);
		log.info("Selecting specialisation type");
		find(specialisationType).click();
		return new StaffPage(driver);
	}

	public void clickReportingManagerdropdown() throws InterruptedException {
		log.info("Clicking reporting manager drop down");
		find(selectreportingManger).click();
		Thread.sleep(2000);
	}

	public void selectReportingManagerName() {
		log.info("Selecting Reporting manager name");
		List<WebElement> ele = driver.findElements(By.xpath(
				"//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[1]"));
		for (int i = 0; i < ele.size(); i++) {
			int x = ele.get(i).getLocation().getX();
			if (x != 0) {
				ele.get(i).click();
				break;
			}
		}
	}

	public StaffPage clicksubmitStaffButton() throws InterruptedException {
		log.info("Clicking Staff submit button");
		find(submitStaff).click();
		return new StaffPage(driver);
	}

	public String staffToastGetText() {
		return find(toastStaffAdd).getText();
	}

	// Staff Detail's Attendance Page
	public void clickStaff() {
		log.info("Click the staff");
		find(staffNameRn).click();
	}

	// Staff Edit Info
	public void clickEditBasicInfo() {
		log.info("Clicking the Edit");
		find(editBasicInfo).click();
	}

	public void waitLanguagesToLoad() {
		waitForVisibilityOf(language, 5);
	}

	public void clickLanguage() throws InterruptedException {
		log.info("Clicking the language field");
		find(language).click();
		Thread.sleep(3000);
	}

	public void selectLanguages() {
		log.info("Selecting language field");
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Hindi')]"));
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'English')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).click().moveToElement(ele1).click().build().perform();
	}

	public void clickBasicInfoSubmit() throws InterruptedException {
		log.info("Clicking the submit for updated languages");
		find(submit).click();
		Thread.sleep(3000);
	}

	public String toastStaffUpdate() {
		return find(toastStaffDetails).getText();
	}

	public void clickStaffAddress() {
		log.info("Clicking the Address Tab");
		find(Address).click();
	}

	public void enterPresentAddress() {
		log.info("Entering Present Address");
		find(presentAddress).sendKeys(" Next to Green Trends, J P Nagar");
	}

	public void enterPincode() throws InterruptedException {
		log.info("Entering Pincode");
		find(pincode).sendKeys("560078");
		Thread.sleep(2000);
	}

	public void waitForLocalityToLoad() {
		waitForVisibilityOf(locality, 5);
	}

	public void clickLocality() {
		log.info("Clicking the locality");
		find(locality).click();
	}

	public void selectLocality() {
		log.info("Selecting the locality");
		find(selectlocality).click();
	}

	public void scrollStaffEditPopUp() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(actualXpathScroll);
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
	}

	public void selectChkPermanentAddress() {
		log.info("Selecting Permanent Address check box");
		find(checkBoxPermanentAddress).click();
	}

	public void clickAddressSave() throws InterruptedException {
		log.info("Clicking the Submit button for address");
		find(saveButton).click();
	}

	public String toastAddressGetText() {
		return find(toastAddressUpdate).getText();
	}

	public void clickInternalDetails() {
		log.info("Clicking Internal Details");
		find(internalDetails).click();
	}

	public void clickeditDesignation() {
		log.info("Clicking Designation Field");
		find(editDesignation).click();
	}

	public void updateDesignation() {
		log.info(" Selecting the designation");
		find(updateDesignation).click();
	}

	public void clickEditSpecialisation() {
		log.info("Clicking the specialisation field ");
		find(editSpecialisation).click();
	}

	public void updateSpecialisation() {
		log.info("Selecting the specialisation");
		find(updateSpecialisation).click();
	}

	public void clickInternalDetailsSave() {
		WebElement ele1 = driver
				.findElement(By.xpath("//div[@id='pane-internal']//div//span[contains(text(),'Save')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele1).click().build().perform();
	}

	public String toastInternalGetTetxt() {
		return find(toastInternalDetails).getText();
	}

	// Staff Attendance Tab-------------
	public void clickAttendanceTab() {
		log.info("Clicking the Attendance Tab");
		find(attendanceTab).click();
	}

	public void clickPresentDateCalendar() throws InterruptedException {
		log.info("Clicking the Present Date Calendar");
		find(attendanceCalendar).click();
		Thread.sleep(3000);
		log.info("Clicking the present date");
		List<WebElement> al = driver.findElements(By.xpath("//table[@class='el-date-table']//td[@class='available']"));
		for (int i = 0; i < al.size(); i++) {
			String value = al.get(i).getText();
			if (value.equalsIgnoreCase("2")) {
				al.get(i).click();
				break;
			}
			Thread.sleep(2000);
		}
	}

	public void scrollStaffDetailPopUp() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'In Time')]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
	}

	public void clickInTime() throws InterruptedException {
		log.info("Clicking the In Time");
		find(inTime).click();
		Thread.sleep(2000);
		log.info(" Selecting the current time");
		find(inTime).clear();
		find(inTime).sendKeys("07:00 AM");
		find(inTime).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void clickOutTime() throws InterruptedException {
		log.info("Clicking the Out Time");
		find(outTime).click();
		Thread.sleep(2000);
		find(outTime).clear();
		find(outTime).sendKeys("8:00 PM");
		find(outTime).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	public void clickmarkpresentAttendance() throws InterruptedException {
		log.info("Clicking the Mark Attendance Button");
		find(markAttendanceButton).click();
		Thread.sleep(2000);
	}

	public String toastStaffPresentAttendance() {
		return find(toastAttendance).getText();
	}

	public void waitForAttendanceTypeToLoad() {
		waitForVisibilityOf(attendance, 10);
	}

	public void clickAttendanceAbsent() {
		log.info("Selecting attendance type");
		find(attendance).click();
	}

	public void selectattendanceAbsentType() {
		log.info("Selecting the Absent Option");
		find(attendanceTypeAbsent).click();
	}

	public void clickAbsentDateCalendar() throws InterruptedException {
		log.info("Clicking the Absent Date Calendar");
		find(attendanceCalendar).click();
		Thread.sleep(3000);
	}

	public void selectAbsentDateCalendar() throws InterruptedException {
		log.info("Selecting the Absent date in the calendar");
		List<WebElement> al = driver
				.findElements(By.xpath("//table[@class='el-date-table']//td[@class='available default']"));
		for (int i = 0; i < al.size(); i++) {
			String value = al.get(i).getText();
			if (value.equalsIgnoreCase("1")) {
				al.get(i).click();
				break;
			}
			Thread.sleep(2000);
		}
	}

	public void clickmarkabsentAttendance() throws InterruptedException {
		log.info("Clicking the Mark Attendance Button");
		find(markAttendanceButton).click();
		Thread.sleep(2000);
	}

	public String toastStaffAbsentAttendance() {
		return find(toastAttendance).getText();
	}

	public void waitForAttendanceLeaveToLoad() {
		waitForVisibilityOf(attendance, 10);
	}

	public void clickLeaveDateCalendar() throws InterruptedException {
		log.info("Clicking the Calendar Type");
		find(attendance).click();
		Thread.sleep(2000);
		log.info("Selecting the Leave Calendar");
		find(attendanceTypeLeave).click();
	}

	public void selectLeaveDateCalendar() throws InterruptedException {
		log.info("Clicking the Leave Calendar");
		find(attendanceCalendar).click();
		Thread.sleep(2000);
		log.info("Selecting the Leave date in the calendar");
		List<WebElement> al = driver.findElements(By.xpath("//table[@class='el-date-table']//td[@class='available']"));
		for (int i = 0; i < al.size(); i++) {
			String value = al.get(i).getText();
			if (value.equalsIgnoreCase("3")) {
				al.get(i).click();
				break;
			}
		}
	}

	public void clickmarkleaveAttendance() throws InterruptedException {
		log.info("Clicking the Mark Attendance Button");
		find(markAttendanceButton).click();
		Thread.sleep(2000);
	}

	public String toastStaffLeaveAttendance() {
		return find(toastAttendance).getText();
	}

	public void scrollStaffNotes() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Staff Details Page')]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Staff Documents Tab
	public void clickDocumentsTab() throws InterruptedException {
		log.info("Clicking the Document's Tab");
		find(documentsTab).click();
		Thread.sleep(2000);
	}

	public void enterNotes() throws InterruptedException {
		log.info("Entering Notes");
		find(enterNotes).sendKeys("Testing Testing" + "\n");
		Thread.sleep(2000);
	}

	public String notesToastGetText() {
		return find(toastNote).getText();
	}

	public void clickDeactivate() {
		log.info("Clicking deactivate button");
		find(deactivate).click();
	}

	public void clickdeactivateOption() throws InterruptedException {
		log.info("Clicking the deactivate option");
		find(deactivateOption).click();
		Thread.sleep(2000);
	}

	public String deactivateToastGetText() {
		return find(toastDeactivate).getText();
	}

	public void clickActivate() throws InterruptedException {
		log.info("Clicking Activate button");
		find(activateStaff).click();
		Thread.sleep(2000);
	}

	public void clickActivateOption() {
		log.info("Clicking the activate option");
		find(activateOption).click();
	}

	public String activatetoastGetText() {
		return find(toastReactivate).getText();
	}

	public void clickDelete() {
		log.info("Clicking the delete button");
		find(delete).click();
	}

	public void clickDeleteOption() {
		log.info("Clicking the delete option");
		find(deleteOption).click();
	}

	// Filter Staff Functionality
	public void clickFilterOption() {
		log.info("Clicking the Filter Option");
		find(staffFilter).click();
	}

	public void clickFilterName() {
		log.info("Clicking the name filter Option");
		find(staffNameCheckBox).click();
	}

	public void inputNameFilter(String randomStaffName) throws InterruptedException {
		waitForVisibilityOf(staffNameFilter, 9);
		log.info("Entering Staff Name to Filter");
		find(staffNameFilter).sendKeys(randomStaffName);
		Thread.sleep(2000);
	}

	public void clickApplyFilter() {
		log.info("Clicking the Apply Filter Button");
		find(applyFilter).click();
	}

	public String staffNmGetText() {
		return find(staffName1).getText();
	}

	public void clickClear() {
		log.info("Clicking the clear filter Field");
		find(clearFilter).click();
	}

	public void clickFilterPhn(String phn) {
		log.info("Clicking the Phone no check Box");
		find(staffphnCheckBox).click();
		log.info("Entering Staff Phone No to filter");
		find(staffPhnFilter).sendKeys(phn);
	}

	public String staffPhnGetText() {
		return find(staffPhone1).getText();
	}

	public void clickFilterEmail(String randomEmail) {
		log.info("Clicking the Email check box");
		find(staffEmailCheckBox).click();
		log.info("Entering Staff Email id to filter");
		find(staffEmailFilter).sendKeys(randomEmail);
	}

	public String staffEmailGetText() {
		return find(staffEmailVerify).getText();
	}

	public void clickFilterDesignation() {
		log.info("Clicking the Designation check Box");
		find(staffDesignationCheckBox).click();
		log.info("Clicking the Designation drop down");
		find(staffDesignationSelect).click();
	}

	public void waitForDesignationTypeToLoad() {
		waitForVisibilityOf(staffDesignationType, 10);
	}

	public void clickDesignationType() throws InterruptedException {
		log.info("Selecting the designation Type");
		find(staffDesignationType).click();
		// Thread.sleep(2000);
	}

	public String staffDesginationGetText() {
		return find(staffDesignation1).getText();
	}

	public void clickFilterReportingManager() {
		log.info("Clicking the Reporting Manager check Box");
		find(staffReportingManager).click();
		log.info("Clicking the Reporting Manager drop down");
		find(staffReportingManagerSelect).click();
	}

	public String selectFilterReportingManagerName() throws InterruptedException {
		log.info("Selecting Reporting manager name for filter");
		List<WebElement> ele = driver.findElements(actualXpathReportingManager);
		String ReportMng = "";
		for (int i = 0; i < ele.size(); i++) {
			int x = ele.get(i).getLocation().getX();
			if (x != 0) {
				ele.get(i).click();
				ReportMng += ele.get(i).getText();
				break;
			}

		}
		return ReportMng;
	}

	public String staffReportMngGetText() {
		return find(reportingManager1).getText();
	}

	public void clickStaffList() {
		log.info("Clicking available Staff");
		find(staffNameRn).click();
	}

	public void clickInactiveTab() {
		log.info("Clicking the Inactive Staff Tab");
		find(staffInactive).click();
	}

	// Implement Assert Method to Verify Inactive Staff
	public String staffDeactiveEmailGetText() {
		return find(staffEmailVerify).getText();
	}

	public void clickActiveTab() {
		log.info("Clicking the Inactive Staff Tab");
		find(staffActive).click();
	}

	// Implement Assert Method to Verify Active Staff
	public String staffActiveEmailGetText() {
		return find(staffEmailVerify).getText();
	}

	public void waitForInactiveStaffVisible() {
		waitForVisibilityOf(staffInactiveName, 10);
	}

	public String getStaffInactiveName() {
		return find(staffInactiveName).getText();
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
}
