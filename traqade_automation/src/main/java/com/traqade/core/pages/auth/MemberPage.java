
package com.traqade.core.pages.auth;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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

public class MemberPage extends BasePageObject {
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	private By memberLinkIcon = By.xpath("//i[@class='tq-icon members']");

	// Adding a New Member
	private By addMemberButton = By.xpath("//button[contains(text(),'Add A Member')]");
	private By enterEmailId = By.xpath("//input[@id='memEmail']");
	private By enterPhoneNo = By.xpath("//input[@id='memMobile']");
	private By enterName = By.xpath("//input[@id='name']");
	private By selectGender = By.xpath("//div[@id='memberGender-multiselect']");
	private By clickGenderType = By.xpath("//div[@id='memberGender-multiselect']//span[contains(text(),'Male')]");
	private By memberDOB = By.xpath("//input[@id='memberdob']");
	private By actualXpath = By.xpath("//div[@class='xdsoft_calendar']/table/tbody/tr/td");
	private By proceedButton = By.xpath("//button[@id='mb-pkg-addedit']");

	private By clickSelectPackageType = By.xpath("//div[@id='memberPackageType-multiselect']");
	private By selectPackageType = By.xpath("//div[@id='memberPackageType-multiselect']//li[3]");
	private By clickSelectPackage = (By.xpath("//div[@id='packageId-multiselect']//div[@class='multiselect__select']"));
	private By selectPackageName = By.xpath("//div[@id='packageId-multiselect']//li[1]");
	private By clickCouponCodeDD = (By
			.xpath("//div[@id='pkgCouponCode-multiselect']//div[@class='multiselect__select']"));
	private By selectAnyCouponCode = (By.xpath("//div[@id='pkgCouponCode-multiselect']//li[1]"));
	private By additionalDiscount = By.xpath("//input[@id='packageDiscountAmount']");
	private By clickAssignATrainerDD = By
			.xpath("//div[@id='trainerUserCode-multiselect']//div[@class='multiselect__select']");
	private By selectAssignATrainer = By.xpath("//div[@id='trainerUserCode-multiselect']//li[2]");
	private By clickActivationDate = By
			.xpath("//div[@class='form-group tq-form-group mb-package-item']//i[@class='tq-icon calendar date-icon']");
	// private By
	// selectActivationDate=By.xpath("//div[19]//tr[1]//td[2]//div[1]");
	private By clickSaveButton = By.xpath("//button[@id='add-more-packages-to-member1']");
	private By clickSubmitButton = By.xpath("//button[@id='mb-pkg-addedit']");

	private By clickYesRadioButton = By.xpath("//div[@id='tab6default']/div[2]/div[1]/label[1]");
	private By currentAmount = By.xpath("//input[@id='packageInstalmentAmount']");
	private By selectPartialPaymentModeDD = By
			.xpath("//div[@id='pkgPartialPaymentMode-multiselect']//div[@class='multiselect__select']");
	private By select1PartialPaymentMode = By.xpath("//div[@id='pkgPartialPaymentMode-multiselect']//li[1]");
	private By selectPaymentModeDD = By
			.xpath("//div[@id='pkgPaymentMode-multiselect']//div[@class='multiselect__select']");
	private By select1paymentMode = By.xpath("//div[@id='pkgPaymentMode-multiselect']//li[2]");
	private By partialPaymentReferenceNumber = By.xpath("//input[@id='paymentPartialReferenceNumber']");
	private By paymentReferenceNumber = By.xpath("//input[@id='paymentReferenceNumber']");
	private By enterRegistrationNumber = By.xpath("//div[@class='payment-options']//div[5]//input[1]");
	private By registrationNumber = By.xpath("//div[@id='tab6default']//div[3]//div[4]//input[1]");
	private By enterNotes = By.xpath("//div[@id='tab6default']//textarea[@placeholder='Please Enter Notes, If Any']");
	private By clickSubmit = By.xpath("//button[@id='mb-pkg-addedit']");

	private By MemberEmailID = By.xpath("//a[text()[contains(.,'@gmail.com')]]");

	//Member Listing 
	private By memberList=By.xpath("//div[@class='main-wrapper']//tr[2]//td[1]//a[1]");
	private By memberDetailsPage=By.xpath("//li[contains(text(),'Member Details')]");
	private By clickEditBasicInfo=By.xpath("//span[@class='editMemberInfo editInfo']//a[contains(text(),'(edit)')]");
	private By clickLanguageDD=By.xpath("//div[@id='memberLanguage-multiselect']//div[@class='multiselect__select']");
	private By emergencyContactName=By.xpath("//input[@id='emergencyContactName']");
	private By emergencyContactNo=By.xpath("//input[@id='emergencyContactNumber']");
	private By saveButtonEditPage=By.xpath("//button[@class='btn btn-secondary memberBtnBasicDetailLoader']");
	
	private By clickEditAddress=By.xpath("//p[contains(text(),'Address')]//a[contains(text(),'(edit)')]");
	private By presentStreetAddress=By.xpath("//input[@id='memberPresentStreetAddress']");
	private By enterPincode=By.xpath("//input[@id='memberPresentPincode']");
	private By clickOnLocalityDD=By.xpath("//div[@id='presentLocality-multiselect']//div[@class='multiselect__tags']");
	private By select1Locality=By.xpath("//div[@id='presentLocality-multiselect']//ul[@class='multiselect__content']/li[1]");
	private By checkboxPermanentAddress=By.xpath("//label[contains(text(),'Same as Present Address')]");
	private By clickAddressSaveButton=By.xpath("//button[@class='btn btn-secondary memberBtnEditAddressLoader']");
	
	private By clickEditBodyMeasurements=By.xpath("//p[contains(text(),'Body Measurements')]//a[contains(text(),'(edit)')]");
	private By clickHeightDD=By.xpath("//div[@id='memberheightFeets-multiselect']//div[@class='multiselect__select']");
	private By selectHeightFeet=By.xpath("//div[@id='memberheightFeets-multiselect']//li[3]");
	private By clickHeightInchesDD=By.xpath("//div[@id='memberheightInches-multiselect']//div[@class='multiselect__select']");
	private By selectHeightInches=By.xpath("//div[@id='memberheightInches-multiselect']//li[1]");
	private By weightInKg=By.xpath("//input[@id='weight']");
	private By clickFitnessGoalDD=By.xpath("//div[@id='memberfitnessGoal-multiselect']//div[@class='multiselect__select']");
	private By clickFitnessActivitiesDD=By.xpath("//div[@id='memberfitnessActivities-multiselect']//div[@class='multiselect__select']");
	private By clickDietPreferenceDD=By.xpath("//div[@id='memberdietPreferences-multiselect']//div[@class='multiselect__select']");
	private By selectDietPreference=By.xpath("//div[@id='memberdietPreferences-multiselect']//li[3]");
	private By enterHealthProblems=By.xpath("//textarea[@id='healthProblem']");
	private By clickBMSaveButton=By.xpath("//button[@class='btn btn-secondary memberBtnFitInfoLoader']");
	
	private By toastBasicinfo=By.xpath("//*[text()[contains(.,'Member Details Updated Successfully!')]]");
	private By toastAddress=By.xpath("//*[text()[contains(.,'Address Updated Successfully!')]]");
	private By toastBodyMeasurement=By.xpath("//*[text()[contains(.,'Body Measurement Details Updated Successfully!')]]");
	
	//Transfer package to a new Member
	private By clickTransfer=By.xpath("//a[@class='btn btn-secondary transferPackageBtn']");
	private By enterTransferEmailId=By.xpath("//div[@id='tab1default']//div//input[@id='memEmail']");
	private By enterTransferPhoneNo=By.xpath("//div[@id='tab1default']//div//input[@id='memMobile']");
	private By enterTransMemName=By.xpath("//div[@id='tab1default']//input[@id='name']");
	private By transRegistrationNum=By.xpath("//div[@class='payment-options']//input[@id='registrationNumber']");
	private By clickEmergencyContact=By.xpath("//label[contains(text(),'Add Emergency Contact?')]");
	private By transEmergencyContactName=By.xpath("//input[@placeholder='Emergency Contact Name']");
	private By transEmergencyContactNo=By.xpath("//input[@placeholder='Emergency Contact Number']");
	private By toastTransfer=By.xpath("//*[text()[contains(.,'Transfered Packages Succesfully!')]]");

	private By clickAssignAnotherPackage=By.xpath("//a[contains(text(),'Assign Another Package')]");
	
	//Clicking on Freeze
	private By clickOnFreeze=By.xpath("//a[contains(text(),'Freeze')]");
	private By clickOnFreezeFrom=By.xpath("//input[@id='freezefrom']");
	private By clickOnFreezeTo=By.xpath("//input[@id='freezeto']");
	private By clickOnFreezePackage=By.xpath("//button[@class='btn btn-secondary freezeLoader']");
	private By toastFreeze=By.xpath("//*[text()[contains(.,'Freeze Membership Request Has Been Processed Successfully!')]]");
	
	//Clicking On Unfreeze
	private By clickOnUnfreeze=By.xpath("//a[@class='btn btn-primary']");
	private By unFreezeFromDate=By.xpath("//form[@id='memberUnFreezeForm']//i[@class='tq-icon calendar date-icon']");
	private By clickOnUnfreezeButton=By.xpath("//button[@class='btn btn-secondary unfreezeLoader']");
	private By toastUnfreeze=By.xpath("//*[text()[contains(.,'Unfreeze Request Has Been Processed Successfully!')]]");
	
	//Clicking on Add Member Follow Up 
	private By clickMemberFollowUp=By.xpath("//div[@class='pull-left']//button[@class='btn btn-secondary'][contains(text(),'Add Follow-Up')]");
	private By callTypeDD=By.xpath("//div[@id='followupCallType-multiselect']//div[@class='multiselect__select']");
	private By selectCallType=By.xpath("//div[@id='followupCallType-multiselect']//li[1]");
	private By assignToDD=By.xpath("//div[@id='followupAssignTo-multiselect']//div[@class='multiselect__select']");
	private By selectAssignTo=By.xpath("//div[@id='followupAssignTo-multiselect']//li[1]");
	private By selectDate=By.xpath("//form[@id='addMemberFollowupForm']//i[@class='tq-icon calendar date-icon']");
	private By actualXpathCalendar = By.xpath("//div[@class='xdsoft_calendar']/table/tbody/tr/td");
	private By clickAddFollowUp=By.xpath("//button[@id='addFollowUpSubmitButton']");
	private By toastFollowup=By.xpath("//*[text()[contains(.,'Member Followup Created Successfully!')]]");
	
	//Upgrade Package
	private By scrollDetailsPage=By.xpath("//div[@class='row member-details border-top']//div[@class='col-sm-12']//p[contains(text(),'Packages')]");
	private By clickUpgrade=By.xpath("//u[contains(text(),'Upgrade')]");
	private By selectUpagradePackageType=By.xpath("//div[@id='packageId-multiselect']//div[@class='multiselect__select']");
	private By upgradePackage=By.xpath("//div[@id='packageId-multiselect']//li[1]");
	private By toastUpgrade=By.xpath("//*[text()[contains(.,'Package Upgraded Successfully')]]");
	
	//Delete Package 
	private By scrollDetailPage=By.xpath("//div[@class='row member-details border-top']//div[@class='col-sm-12']//p[contains(text(),'Packages')]");
	private By clickDelete=By.xpath("//u[contains(text(),'Delete')]");
	private By clickYesButton=By.xpath("//div[@id='memberDeleteConfirmModal']//../div[@class='vertical-center-content']//../button[contains(text(),'YES')]");

	//Deactivate Member
	private By clickOnDeactivate=By.xpath("//u[contains(text(),'Deactivate')]");
	private By yesButton=By.xpath("//div[@id='memberRemoveConfirmModal']//div[@class='vertical-center-content']//button[contains(text(),'YES')]");
	private By toastDeactivate=By.xpath("//*[text()[contains(.,'Member Deactivated Successfully!')]]");
	
	//Reactivate Member
	private By clickOnReactivate=By.xpath("//u[contains(text(),'Reactivate')]");
	private By clickYes=By.xpath("//span[contains(text(),'YES')]");
	private By toastReactive=By.xpath("//*[text()[contains(.,'Member Reactivated Successfully!')]]");
	
	//Mark Attendance
	private By clickMarkAttendance=By.xpath("//button[contains(text(),'Mark Attendance')]");
	private By selectAttendanceDate=By.xpath("//input[@id='attendanceDate']");
	private By inTime=By.xpath("//input[@id='memberInTimeInput']");
	private By selectTime=By.xpath("//div[31]/div[2]/div[1]/div[1]/div[1]");
	private By clickPMDD=By.xpath("//div[@class='modal-body']//div[3]/..//div[@id='memberInTime']//div[@class='input-group-btn']/button[@class='btn btn-default dropdown-toggle']");
	private By selectPM=By.xpath("//div[@class='modal-body']//div[3]/..//div[@id='memberInTime']//div[@class='input-group-btn open']//ul[1]//li[2]//a[1]");
	private By clickOnUpdate=By.xpath("//button[@id='updateButton']");
	private By toastAttendance=By.xpath("//*[text()[contains(.,'User Attendance Marked Successfully')]]");
	
	//Member Delete
	private By listingDelete=By.xpath("//tbody/tr[2]/td[7]/div[1]/i[1]");
	private By listingYes=By.xpath("//div[@id='memberDeleteConfirmModal']//div[@class='modal-dialog modal-sm']//div[3]//button[1]");
	private By toastListDelete=By.xpath("//*[text()[contains(.,'Member Deleted Successfully!')]]");
	
	//Advanced Filters
	private By clickAdvancedFilters=By.xpath("//span[@id='memberSort']");
	private By searchEmail=By.xpath("//div[@class='col-sm-2']//input[@id='memberSearchEmail']");
	private By verifyFilter=By.xpath("//div[@class='align-pagination content-wrapper']//div[1]/table[1]/tbody[1]/tr[1]/td[1]");
	private By clearFilter = By.xpath("//div[@class='main-content']//div[1]/div[1]/div[3]/div[1]/span[1]/i[1]");
	private By verifyClear=By.xpath("//button[contains(text(),'Add A Member')]");
	
	private By selectCardOption=By.xpath("//div[@id='pkgPaymentMode-multiselect']//span[contains(text(),'Card')]");

	private By selectLead = By.xpath("//li[@class='leftNav dashLead']//a");

	private By allMembers = By.xpath("//a[contains(text(),'All Members')]");
	private By invoice = By.xpath("//u[contains(text(),'Send Invoice')]");
	private By view = By.xpath("//u[contains(text(),'View Invoice')]");
	private By button = By.xpath("//button[contains(text(),'CONFIRM')]");
	private By toastInvoice = By
			.xpath("//*[text()[contains(.,'Invoice Mailed Successfully, Please Check Your Inbox!')]]");

	public MemberPage(WebDriver driver) {
		super(driver);
	}

	public void waitforMemberpagetoload() {
		waitForVisibilityOf(memberLinkIcon, 20);
	}

	// Click Member icon
	public void memberLinkIcon() {
		log.info("Clicking Member Icon");
		find(memberLinkIcon).click();
	}

	// Click on Add Member
	public MemberPage clickOnAddMemberButton() {
		log.info("Clicking Add A Member button");
		find(addMemberButton).click();
		return new MemberPage(driver);
	}

	// Enter Email ID
	public String enterEmailId() {
		Random r = new Random();
		String memEmailId = "username" + r.nextInt(1000) + "@gmail.com";

		log.info("Entering Email Id");
		find(enterEmailId).sendKeys(memEmailId);
		return memEmailId;
	}

	// Enter Phone Number
	public MemberPage enterPhoneNo() {
		long randomPhn = (long) (Math.random() * 10000 + 333300000l);
		String phn = Long.toString(randomPhn);

		log.info("Entering Phone No");
		find(enterPhoneNo).sendKeys("977" + phn + 11);
		return new MemberPage(driver);
	}

	// Enter User Name
	public MemberPage enterUserName() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomMemberName = "";
		int length = 5;
		Random rn = new Random();
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for (int i = 0; i < text.length; i++) {
			randomMemberName += text[i];

		}
		log.info("Entering Member Name");
		find(enterName).sendKeys(randomMemberName);
		return new MemberPage(driver);
	}

	// Select Gender
	public MemberPage selectGender() {
		log.info("Selecting Gender Value");
		find(selectGender).click();

		log.info("selecting Gender Type");
		find(clickGenderType).click();
		return new MemberPage(driver);
	}

	public void clickDob() throws InterruptedException {
		log.info("clicking on DOB");
		find(memberDOB).click();
		Thread.sleep(1000);
		int currentDay = LocalDate.now().getDayOfMonth();
		String todayDate = String.valueOf(currentDay);
		List<WebElement> dates = driver.findElements(actualXpath);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase(todayDate)) {

				dates.get(i).click();
				break;
			}

		}
	}

	// Click on Proceed
	public MemberPage clickOnProceed() {
		log.info("clicking on Proceed");
		find(proceedButton).click();
		return new MemberPage(driver);
	}

	// Select Package Type
	public MemberPage selectPackageType() throws InterruptedException {
		log.info("Selecting on Package Type");
		find(clickSelectPackageType).click();
		Thread.sleep(2000);
		log.info("Selecting Membership Package Type");
		find(selectPackageType).click();
		return new MemberPage(driver);
	}

	// Select Package
	public MemberPage selectPackage() throws InterruptedException {
		log.info("Select Package");
		find(clickSelectPackage).click();
		Thread.sleep(4000);
		log.info("Selecting a Package");
		find(selectPackageName).click();
		return new MemberPage(driver);
	}

	// Select Coupon Code
	public MemberPage selectACouponCode() throws InterruptedException {
		log.info("Clicking on DD of Select a coupon code");
		find(clickCouponCodeDD).click();
		Thread.sleep(5000);
		log.info("Selecting any 1 Coupon code");
		find(selectAnyCouponCode).click();
		return new MemberPage(driver);
	}

	// Additional Discount
	public MemberPage additionalDiscount() {
		log.info("Clicking on Assign a Trainer");
		find(additionalDiscount).sendKeys("1");
		return new MemberPage(driver);
	}

	// Assign a Trainer
	public MemberPage clickAssignATrainer() {
		log.info("Clicking on Assign a Trainer");
		find(clickAssignATrainerDD).click();

		log.info("Assigning a Trainer");
		find(selectAssignATrainer).click();
		return new MemberPage(driver);
	}

	// Click Activation Date
	public MemberPage clickActivationDate() throws InterruptedException {
		log.info("clicking on Activation Date calender");
		find(clickActivationDate).click();
		log.info("Clicking on Activation Date");
		// find(selectActivationDate).click();
		return new MemberPage(driver);
	}

	// Click on Save
	public void clickSaveButton() {
		log.info("Clicking on Save Button");
		find(clickSaveButton).click();
	}

	// Click on Submit
	public MemberPage clickOnSubmitButton() {
		log.info("clicking on Submit Button");
		find(clickSubmitButton).click();
		return new MemberPage(driver);
	}

	// Clicking Radio Button YES
	public MemberPage clickOnYesButton() {
		log.info("Clicking On Yes for Pay In Installments");
		find(clickYesRadioButton).click();
		return new MemberPage(driver);
	}

	// Enter Current Amount
	public MemberPage currentAmount() {
		log.info("Entering Amount For Current Amount");
		find(currentAmount).sendKeys("1000");
		return new MemberPage(driver);
	}

	// Select Payment Mode
	public MemberPage selectPartialPaymentModeDD() throws InterruptedException {
		log.info("Clicking on Select Payment Mode Dropdown");
		find(selectPartialPaymentModeDD).click();
		Thread.sleep(5000);
		log.info("Selecting 1 PaymentMode from DD");
		find(select1PartialPaymentMode).click();
		return new MemberPage(driver);
	}

	// Enter Payment Reference Number
	public MemberPage enterPaymentReferenceNumber() {
		log.info("Entering Payment Reference Number");
		find(partialPaymentReferenceNumber).sendKeys("Ae3di2w9ei");
		return new MemberPage(driver);
	}

	// Enter Registration Number
	public MemberPage enterRegistrationNumber() {
		log.info("Entering Registration Number");
		find(enterRegistrationNumber).sendKeys("123456");
		return new MemberPage(driver);
	}

	// Enter Registration Number
	public MemberPage registrationNumber() {
		log.info("Enter Registration Number");
		find(registrationNumber).sendKeys("jhystafdc");
		return new MemberPage(driver);
	}

	// Scrolling Vertically
	public void scroll() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(
				"//div[@class='mCSB_scrollTools mCSB_2_scrollbar mCS-minimal-dark mCSB_scrollTools_vertical']//div[@class='mCSB_dragger']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
	}

	// Click on SUBMIT
	public void submit() {
		log.info("Clicking on SUBMIT button");
		find(clickSubmit).click();
	}

	public MemberPage memberList() {
		log.info("Choose any 1 member from Member List");
		find(memberList).click();
		return new MemberPage(driver);
	}

	public void memberDetailsPage() {
		log.info("verify Member Details Page");
		find(memberDetailsPage).getText();

	}

	public MemberPage clickEditBasicInfo() {
		log.info("Clicking on Edit button of Basic Info");
		find(clickEditBasicInfo).click();
		return new MemberPage(driver);
	}

	public void clickLanguageDD() throws InterruptedException {
		log.info("Select Language");
		find(clickLanguageDD).click();
		Thread.sleep(2000);

	}

	public void selectLanguage() {
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Hindi')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).click().build().perform();
	}

	public void selectLanguage1() {
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'English')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele1).click().build().perform();
	}

	public void selectLanguage2() {
		WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'Bengali')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele2).click().build().perform();
	}

	// Scrolling Vertically
	public void scrollBasicInfoEditPage() throws InterruptedException {
		log.info("Scrolling vertically");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[@id='mCSB_5_dragger_vertical']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Emergency Contact Name
	public String emergencyContactName() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomEmergencyContactName = "";
        int length = 7;
        Random rn = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rn.nextInt(characters.length()));
        }
        for (int i = 0; i < text.length; i++) {
            randomEmergencyContactName += text[i];
        }
        log.info("Entering Emergency contact Name");
        find(emergencyContactName).sendKeys(randomEmergencyContactName);
        return randomEmergencyContactName;
    }
		
	public MemberPage emergencyContactNo() {
        long randomPhn = (long) (Math.random() * 10000 + 333300000l);
        String phn = Long.toString(randomPhn);
        log.info("Entering Emergency contact No");
        find(emergencyContactNo).sendKeys("981" + phn + 11);
        return new MemberPage(driver);
    }
	
	public MemberPage saveButtonEditPage() {
		log.info("Clicking on Save Button");
		find(saveButtonEditPage).click();
		return new MemberPage(driver);
	}

	public MemberPage clickEditAddress() {
		log.info("Clicking on Address Edit Button");
		find(clickEditAddress).click();
		return new MemberPage(driver);
	}

	public MemberPage presentStreetAddress() {
		log.info("Enter Present Street Address");
		find(presentStreetAddress).sendKeys("Marathahalli");
		return new MemberPage(driver);
	}

	public MemberPage enterPincode() {
		log.info("Enter Pincode in Present Address");
		find(enterPincode).sendKeys("560037");
		return new MemberPage(driver);
	}

	public MemberPage clickOnLocalityDD() throws InterruptedException {
		log.info("Click Locality in Present Address");
		find(clickOnLocalityDD).click();
		Thread.sleep(3000);
		log.info("Select 1 Locality in Present Address");
		find(select1Locality).click();
		Thread.sleep(3000);
		log.info("Clicking on Checkbox of Permanent Address");
		find(checkboxPermanentAddress).click();
		return new MemberPage(driver);
	}

	public MemberPage addressSaveButton() {
		log.info("Click on Address Save Button");
		find(clickAddressSaveButton).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return new MemberPage(driver);
	}

	public MemberPage clickEditBodyMeasurements() throws InterruptedException {
		log.info("Click on Edit Body Measurements");
		find(clickEditBodyMeasurements).click();
		Thread.sleep(3000);
		log.info("Click on Height DD");
		find(clickHeightDD).click();
		log.info("Select Any Height");
		find(selectHeightFeet).click();
		log.info("Clicking on Height(Inches) DD");
		find(clickHeightInchesDD).click();
		log.info("Select Height Inches");
		find(selectHeightInches).click();
		log.info("Filling Weight in Kg");
		find(weightInKg).sendKeys("55");
		return new MemberPage(driver);
	}

	public void clickFitnessGoalDD() {
		log.info("Clicking Fitness Goal DD");
		find(clickFitnessGoalDD).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> dropdown_list = driver.findElements(
				By.xpath("//div[@id='memberfitnessGoal-multiselect']//ul[@class='multiselect__content']//li"));
		System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
		for (int i = 0; i < dropdown_list.size(); i++) {
			System.out.println(dropdown_list.get(i).getText());

			if (dropdown_list.get(i).getText().contains("General Fitness")) {
				dropdown_list.get(i).click();
				break;
			}
		}
	}

	public void clickFitnessActivitiesDD() {
		log.info("Clicking Fitness Activities DD");
		find(clickFitnessActivitiesDD).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> dropdown_list = driver.findElements(
				By.xpath("//div[@id='memberfitnessActivities-multiselect']//ul[@class='multiselect__content']//li"));
		System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
		for (int i = 0; i < dropdown_list.size(); i++) {
			System.out.println(dropdown_list.get(i).getText());

			if (dropdown_list.get(i).getText().contains("Yoga")) {
				dropdown_list.get(i).click();
				break;
			}
		}
	}

	public MemberPage clickDietPreferenceDD() throws InterruptedException {
		log.info("Clicking on Diet Preference DD");
		find(clickDietPreferenceDD).click();
		Thread.sleep(3000);
		log.info("Select any Diet Preference");
		find(selectDietPreference).click();
		return new MemberPage(driver);
	}

	public MemberPage healthProblems() {
		log.info("Writing Health Problems");
		find(enterHealthProblems).sendKeys("No");
		return new MemberPage(driver);
	}

	public MemberPage clickBMSaveButton() {
		log.info("Click on BodyMeasurement Save Button");
		find(clickBMSaveButton).click();
		return new MemberPage(driver);
	}

	public void clickAssignAnotherPackage() throws InterruptedException {
		log.info("Clicking on Assign Another Package");
		find(clickAssignAnotherPackage).click();
		Thread.sleep(3000);
		log.info("Click on Package Type");
		find(clickSelectPackageType).click();
		log.info("Select Any Package Type");
		find(selectPackageType).click();
		log.info("Click on Select Package");
		find(clickSelectPackage).click();
		Thread.sleep(3000);
		log.info("Select Any Package Name");
		find(selectPackageName).click();
		log.info("Click on Coupon Code DD");
		find(clickCouponCodeDD).click();
		Thread.sleep(3000);
		log.info("Select Any 1 Coupon Code");
		// find(selectAnyCouponCode).click();
		log.info("Giving Additional Discount");
		find(additionalDiscount).sendKeys("1");
		log.info("Clicking Assign A Trainer DD");
		find(clickAssignATrainerDD).click();
		log.info("Select A Trainer");
		find(selectAssignATrainer).click();
		log.info("Clicking Activation Date");
		find(clickActivationDate).click();
		log.info("Clicking Save Button");
		find(clickSaveButton).click();
		log.info("Clicking Submit Button");
		find(clickSubmitButton).click();
		log.info("Clicking No Radio Button");
		log.info("Click on Select Payment Mode DD");
		find(selectPaymentModeDD).click();
		log.info("Select Any 1 Payment Mode");
		find(select1paymentMode).click();
		log.info("Entering Payment Reference Number");
		find(paymentReferenceNumber).sendKeys("Ae3di2w9ei");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[@id='mCSB_3_dragger_vertical']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		log.info("Writing Notes");
		find(enterNotes).sendKeys("N/A");
		log.info("Clicking on Submit Button");
		find(clickSubmit).click();
	}

	// Transfer Package to a new Member
	public MemberPage clickTransfer() {
		log.info("Clicking on Transfer Button");
		find(clickTransfer).click();
		return new MemberPage(driver);
	}

	public String enterTransferEmailId() {
		Random r = new Random();
		String memTransEmailId = "username" + r.nextInt(1000) + "@gmail.com";

		log.info("Entering Email Id");
		find(enterTransferEmailId).sendKeys(memTransEmailId);
		return memTransEmailId;
	}

	public String enterTransferPhoneNo() {
		String randomTransPhn = RandomStringUtils.randomNumeric(9);
		;
		String phone = 9 + randomTransPhn;
		log.info("Entering Phone No");
		find(enterTransferPhoneNo).sendKeys(phone);
		return phone;
	}

	public String enterTransMemName() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomTransMemberName = "";
		int length = 5;
		Random rn = new Random();
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for (int i = 0; i < text.length; i++) {
			randomTransMemberName += text[i];
		}
		log.info("Entering Tnasfer Member Name");
		find(enterTransMemName).sendKeys(randomTransMemberName);
		return randomTransMemberName;
	}

	public MemberPage selectPaymentModeDD() throws InterruptedException {
		log.info("Clicking on Select Payment Mode Dropdown");
		find(selectPaymentModeDD).click();
		Thread.sleep(3000);
		log.info("Selecting 1 PaymentMode from DD");
		find(select1paymentMode).click();
		return new MemberPage(driver);
	}

	public MemberPage paymentReferenceNumber() {
		log.info("Entering Payment Reference Number");
		find(paymentReferenceNumber).sendKeys("abcdefgh");
		return new MemberPage(driver);
	}

	public MemberPage transRegistrationNum() {
		log.info("Transfer Mem Registration Number");
		find(transRegistrationNum).sendKeys("1234567");
		return new MemberPage(driver);
	}

	public void clickEmergencyContact() {
		log.info("Click on Add Emergency Contact checkbox");
		find(clickEmergencyContact).click();
	}

	public String transEmergencyContactName() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomTEmergencyContactName = "";
		int length = 7;
		Random rn = new Random();
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for (int i = 0; i < text.length; i++) {
			randomTEmergencyContactName += text[i];

		}
		log.info("Entering Emergency contact Name");
		find(transEmergencyContactName).sendKeys(randomTEmergencyContactName);
		return randomTEmergencyContactName;
	}

	public String transEmergencyContactNo() {
		String randomEmergencyPhone = RandomStringUtils.randomNumeric(9);
		;
		String phone = 9 + randomEmergencyPhone;

		log.info("Entering Emergency contact No");
		find(transEmergencyContactNo).sendKeys(phone);
		return phone;
	}

	public MemberPage enterNotes() {
		log.info("Writing Notes");
		find(enterNotes).sendKeys("N/A");
		return new MemberPage(driver);
	}

	// Freeze Package
	public MemberPage clickOnFreeze() {
		log.info("Clicking on Freeze");
		find(clickOnFreeze).click();
		return new MemberPage(driver);
	}

	public void clickOnFreezeFrom() throws InterruptedException {
		log.info("clicking on Freeze From");
		find(clickOnFreezeFrom).click();
		Thread.sleep(1000);
		int currentDay = LocalDate.now().getDayOfMonth();
		String todayDate = String.valueOf(currentDay);
		List<WebElement> dates = driver.findElements(actualXpath);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase(todayDate)) {

				dates.get(i).click();
				break;
			}

		}
	}

	public void clickOnFreezeTo() throws InterruptedException {
		log.info("clicking on Freeze To");
		find(clickOnFreezeTo).click();
		Thread.sleep(1000);
		int currentDay = LocalDate.now().getDayOfMonth();
		String todayDate = String.valueOf(currentDay);
		List<WebElement> dates = driver.findElements(actualXpath);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase(todayDate)) {

				dates.get(i).click();
				break;
			}

		}
	}

	public MemberPage clickOnFreezePackage() {
		log.info("Clicking on Freeze Package Button");
		find(clickOnFreezePackage).click();
		return new MemberPage(driver);
	}

	// Click On Unfreeze
	public MemberPage clickOnUnfreeze() {
		log.info("Clicking On Unfreeze Button");
		find(clickOnUnfreeze).click();
		return new MemberPage(driver);
	}

	public void unFreezeFromDate() throws InterruptedException {
		log.info("clicking on UnFreeze From Date");
		find(unFreezeFromDate).click();
		Thread.sleep(1000);
		int currentDay = LocalDate.now().getDayOfMonth();
		String todayDate = String.valueOf(currentDay);
		List<WebElement> dates = driver.findElements(actualXpath);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase(todayDate)) {

				dates.get(i).click();
				break;
			}

		}
	}

	public void clickOnUnfreezeButton() {
		log.info("Clicking on Unfreeze Button");
		find(clickOnUnfreezeButton).click();
	}

	// Click Add Member Follow-Up
	public void clickMemberFollowUp() {
		log.info("Clicking On Add Member Follow-Up Button");
		find(clickMemberFollowUp).click();
	}

	public MemberPage clickonCallTypeDD() throws InterruptedException {
		log.info("Clicking on Call Type DD");
		find(callTypeDD).click();
		Thread.sleep(3000);
		log.info("Select Call Type");
		find(selectCallType).click();
		return new MemberPage(driver);
	}

	public MemberPage assignToDD() throws InterruptedException {
		log.info("Clicking on Assign To DD");
		find(assignToDD).click();
		Thread.sleep(2000);
		log.info("Select Any Trainer");
		find(selectAssignTo).click();
		return new MemberPage(driver);
	}

	public void selectDate() throws InterruptedException {
		log.info("Clicking Follow Up Date");
		find(selectDate).click();
		Thread.sleep(2000);
		// Get the current date
		int currentDay = LocalDate.now().getDayOfMonth();
		String todayDate = String.valueOf(currentDay);
		List<WebElement> dates = driver.findElements(actualXpathCalendar);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase(todayDate)) {

				dates.get(i).click();
				break;
			}
		}
	}

	public void clickAddFollowUp() {
		log.info("Click on Add Follow-Up Button");
		find(clickAddFollowUp).click();
	}

	// Upgrade Package
	public void waitForDetailsPageToLoad() {
		waitForVisibilityOf(memberDetailsPage, 5);
	}

	public void scrollDetailsPage() {
		log.info("Scroll Down the page");
		WebElement lastElement = driver.findElement(scrollDetailsPage);
		int y = lastElement.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + y + ")");

	}

	public MemberPage selectUpgradePackage() throws InterruptedException {
		log.info("Select Upgrade Package DD");
		find(selectUpagradePackageType).click();
		Thread.sleep(3000);
		log.info("Selecting a Upgrade Package");
		find(upgradePackage).click();
		return new MemberPage(driver);
	}

	public void clickUpgrade() {
		log.info("Clicking on Upgrade Link");
		find(clickUpgrade).click();
	}

	// Delete Package
	public void scrollDetailPage() {
		log.info("Scroll Down the page");
		WebElement lastElement = driver.findElement(scrollDetailPage);
		int y = lastElement.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + y + ")");

	}

	public void clickDelete() throws InterruptedException {
		log.info("Clicking on Delete Link of Package");
		find(clickDelete).click();
		Thread.sleep(5000);
	}

	public void clickYesButton() {
		log.info("clickOnYesButton");
		WebElement member = driver.findElement(clickYesButton);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", member);
	}

	// Deactivate Member
	public void clickOnDeactivate() {
		log.info("click On Deactivate");
		find(clickOnDeactivate).click();
	}

	public void yesButton() {
		log.info("clickOnYesButton");
		WebElement member = driver.findElement(yesButton);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", member);
		}
		
		//Click on Reactivate
		public void clickOnReactivate()
		{
			log.info("Click on Reactivate");
			find(clickOnReactivate).click();
		}
		
		public void clickYes()
		{
			log.info("click On Yes Button");
			WebElement member = driver.findElement(clickYes);
			JavascriptExecutor jser = (JavascriptExecutor) driver;
			jser.executeScript("arguments[0].click()", member);
		}
		
		//Mark Attendance
		public void clickMarkAttendance()
		{
			log.info("click on Mark Attendance Button");
			find(clickMarkAttendance).click();
		}
		
		public void selectAttendanceDate() throws InterruptedException
		{
			log.info("select Attendance Date");
			find(selectAttendanceDate).click();
			Thread.sleep(1000);
			int currentDay = LocalDate.now().getDayOfMonth();
			String todayDate = String.valueOf(currentDay);
			List<WebElement> dates = driver.findElements(actualXpath);
			int total_node = dates.size();
			for (int i = 1; i <= total_node; i++) {
				String date = dates.get(i).getText();
				if (date.equalsIgnoreCase(todayDate)) {

					dates.get(i).click();
					break;
				}

			}
		}
		
		public void clickInTime() throws InterruptedException  {
			 log.info("Clicking IN Time");
			    find(inTime).click();
		        Thread.sleep(3000);
		        log.info("Selecting IN Time");
		        WebElement ele1 = driver.findElement(selectTime);
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].click()", ele1);
		}
		
		public void clickPMDD() throws InterruptedException
		{
		log.info("Clicking on PM DD");	
		find(clickPMDD).click();
		Thread.sleep(2000);
		log.info("Selecting PM from DD");
		find(selectPM).click();
		}
		
		public void clickOnUpdate()
		{
			log.info("Click on Update");
			find(clickOnUpdate).click();
		}
		
		//Click On Listing Delete
		public void listingDelete()
		{
			log.info("Click on Listing Delete Button");
			find(listingDelete).click();
		}
		
		public void listingYes()
		{
			log.info("Clicking on Yes");
			find(listingYes).click();
		}
		
		//Advanced Filters
		public void clickAdvancedFilters()
		{
			log.info("click on Advanced Filters");
			find(clickAdvancedFilters).click();
		}
		

		public void EmailFilter(String memEmailId)
		{
			waitForVisibilityOf(searchEmail, 5);
			log.info("Select Email Text Field");
			find(searchEmail).sendKeys(memEmailId + Keys.ENTER);
		}
		
		public void clearFilter()
		{
			log.info("Clicking on x");
			find(clearFilter).click();	
		}
		
		//Verify Member MailID
		public void waitForDetailPageToLoad() {
			waitForVisibilityOf(MemberEmailID, 9);
		}
		
		public String emailIdGetText()
		{
			return find(MemberEmailID).getText();
		}
		
		public LeadsPage selectLeadModule() {
			log.info("clicking Leads Module");
			find(selectLead).click();
			return new LeadsPage(driver);
		}
		
		 public void selectCard() throws InterruptedException 
		 {
		        find(selectPaymentModeDD).click();
		        Thread.sleep(3000);
		        log.info("Selecting Card Option");
		        find(selectCardOption).click();
		   }
		//verify Member details updated
		public String toastBasicinfo() 
		{
			return find(toastBasicinfo).getText();
		}
				
		//Verify Address Updated
		public String toastAddress()
		{
			return find(toastAddress).getText();
		}
				
		//Verify Address Updated
		public String toastBodyMeasurement()
		{
			return find(toastBodyMeasurement).getText();
		}
		
		//verify Transfered successfully
		public String toastTransfer()
		{
			return find(toastTransfer).getText();
		}
		
		//verify Freezed successfully
		public String toastFreeze()
		{
			return find(toastFreeze).getText();
		}
		
		//verify Unfreezed successfully
		public String toastUnfreeze()
		{
			return find(toastUnfreeze).getText();
		}
		
		//verify Follow up created
		public String toastFollowup()
		{
			return find(toastFollowup).getText();
		}
		
		//Verify Package Upgraded Successfully
		public String toastUpgrade()
		{
			return find(toastUpgrade).getText();
		}
		
		
		public String  addMemberButtonVisible() {
			log.info("Check add a member button is visible");
	        return find(addMemberButton).getText();
		}
		
		//Verify Member Deactivated Successfully
		public String toastDeactivate()
		{
			return find(toastDeactivate).getText();
		}
		
		//Verify Member Reactivated Successfully
		public String toastReactive()
		{
			return find(toastReactive).getText();
		}
		
		public void waitForMemberPageToLoad()
	    {
	        waitForVisibilityOf(allMembers,10);
	    }
		
		//Verify Attendance Marked Successfully
		public String toastAttendance()
		{
			return find(toastAttendance).getText();
		}
		
		//Verify Member Delete Successfully
		public String toastListDelete()
		{
			return find(toastListDelete).getText();
		}
		
		//Verify Filter Result displaying
		public boolean verifyFilter()
		{
		find(verifyFilter);
		return true;
		}
		
		//Verify Filter Cleared
		public String verifyClear()
		{
			return find(verifyClear).getText();
		}
		
		//Member Invoice​​​​​​
	    public void scrollDownTillInvoice()
	    {
		log.info("Scroll Down the page");
		WebElement lastElement = driver.findElement(invoice);
		int y = lastElement.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + y + ")");
	    }

	public boolean isSendInvoiceLinkPresent() {
		log.info("Checking Send Invoice Link is present");
		find(invoice);
		return true;
	}

	public boolean isViewInvoiceLinkPresent() {
		log.info("Checking View Invoice Link is present");
		find(view);
		return true;
	}
	
	public void clickSendInvoiceLink() throws InterruptedException {
		log.info("Click Send InvoiceLink");
		find(invoice).click();
		Thread.sleep(3000);
		WebElement lastElement = driver.findElement(button);
		int y = lastElement.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + y + ")");

	}

	public void clickConfirmButton() {
		log.info("Click Confirm Button");
		find(button).click();
	}

	public String invoiceToaster() {
		return find(toastInvoice).getText();
	}
}
