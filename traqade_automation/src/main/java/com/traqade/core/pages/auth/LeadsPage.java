package com.traqade.core.pages.auth;

import java.time.LocalDate;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class LeadsPage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	private By addLead = By.id("openAddLead");

	private By enterEmail = By.id("leadEmail");
	private By enterMobile = By.id("leadMobile");
	private By enterName = By.xpath("//form[@id='leadForm']//input[@placeholder='Enter Name']");

	private By selectGenderDropDown = By
			.xpath("//div[@id='leadGender-multiselect']//div[@class='multiselect__select']");
	private By selectGender = By.xpath("//div[@id='leadGender-multiselect']//span[contains(text(),'Male')]");

	private By assignDropDown = By.xpath("//div[@id='assignTo-multiselect']");
	private By assignTo = By.xpath("//div[@id='assignTo-multiselect']//ul[@class='multiselect__content']/li[1]");
	private By saveButton = By.xpath("//button[contains(@class,'AddLeadSubmit')]");

	private By getLeadEmail = By.xpath("//a[text()[contains(.,'@gmail.com')]]");
	private By followUp = By.xpath("//button[contains(text(),'Follow up')]");
	private By followUpDate = By.xpath("//input[@placeholder='Enter Follow Up Date']");
	private By selectFollowUpTime = By.xpath("//input[@placeholder='Enter Trial Date']");

	private By addNote = By.xpath("//form[@id='leadFolowUpForm']//textarea[@placeholder='Please Enter Note, If Any']");
	private By saveChangesButton = By.xpath("//button[@class='btn btn-secondary leadBtnFollowupLoader']");
	private By leadFollowUpFrom = By.xpath("//h4[contains(text(),'Follow Up Details - Lead')]");
	private By actualXpathCalendar = By.xpath("//div[@class='xdsoft_calendar']/table/tbody/tr/td");

	private By notesText = By.xpath("//p[contains(text(),'Test Lead Activity')]");
	private By trialText = By.xpath("//p[contains(text(),'Trial Date set to')]");
	private By followUpText = By.xpath("//p[contains(text(),'Followup Date set to')]");

	private By addIcon = By.xpath("//i[@class='tq-icon plus-white-md']");
	private By quickAddLink = By.xpath("//a[@class='sendLinkToLead']");
	private By quickEmailAddress = By
			.xpath("//div[@class='tq-form-group form-group']//input[@placeholder='Enter Email']");
	private By quickPhoneNumber = By.xpath("//div[@class='tq-form-group']//input[@placeholder='Enter Phone Number']");
	public By quickSendLinkButton = By.xpath("//button[contains(text(),'Send Link')]");
	private By closeButton = By.xpath("//div[@id='leadGenerator']//button[@class='close'][contains(text(),'×')]");
	private By sendButtonLink = By.xpath("//button[@type='submit']");

	private By emailValidation = By.xpath("//label[@id='leadInvitationEmail-error']");
	private By phoneValidation = By.xpath("//label[@id='leadInvitationMobile-error']");
	private By leadInvitationMessage = By
			.xpath("//*[text()[contains(.,'Lead Invitation Request Sent Successfully!')]]");

	private By leadModule = By.xpath("//i[@class='tq-icon leads']");
	private By advancedFilters = By.xpath("//a[contains(text(),'Advanced Filters')]");
	private By searchEmail = By.xpath("//div[@class='col-sm-2']//input[@placeholder='Enter Email']");
	private By lineWrapper = By.xpath("//tbody//label");
	private By deleteLead = By.xpath("//i[@class='tq-icon delete']");
	private By alertYesButton = By
			.xpath("//button[@class='btn btn-secondary fw-600 text-uppercase deleteLeadBtnLoader']");
	private By leadToasterDelete = By.xpath("//*[text()[contains(.,'Lead Deleted Successfully!')]]");
	private By convertToMember=By.xpath("//button[contains(text(),'Convert to Member')]");
	private By leadConverted=By.xpath("//div[contains(text(),'Lead Converted')]");

	public LeadsPage(WebDriver driver) {
		super(driver);
	}

	public void waitForLeadPageToLoad() {
		waitForVisibilityOf(addLead, 5);
	}

	public void waitForLeadFormPageToOpen() {
		waitForVisibilityOf(saveButton, 5);
	}

	public void clickAddLeadButton() {
		log.info("Click Add Lead Button");
		find(addLead).click();
	}

	public String inputEmail() {
		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String emailID = "test" + userName + "@gmail.com";
		log.info("Entering Email");
		find(enterEmail).sendKeys(emailID);
		return emailID;
	}

	public void inputMobileNo() {
		String randomNumbers = RandomStringUtils.randomNumeric(9);
		String phNo = 7 + randomNumbers;
		log.info("Entering Mobile No");
		find(enterMobile).sendKeys(phNo);
	}

	public void inputName() {
		log.info("Entering Name");
		find(enterName).sendKeys("Lead");
	}

	public void waitForGenderDropToLoad() {
		waitForVisibilityOf(selectGenderDropDown, 5);
	}

	public void clickGenderDropDown() {
		log.info("Clicking Gender Drop Down");
		find(selectGenderDropDown).click();
	}

	public void selectGender() {
		log.info("Select Gender");
		find(selectGender).click();
	}

	public void clickAssignDropDown() {
		log.info("Clicking Assign Drop Down");
		find(assignDropDown).click();
	}

	public void selectAssignTo() {
		log.info("Select Assign To");
		find(assignTo).click();
	}

	public void clickSaveButton() {
		log.info("Clicking Save Button");
		find(saveButton).click();
	}

	public String emailIdGetText() {
		return find(getLeadEmail).getText();
	}

	public void clickFollowUpButton() {
		log.info("Clicking Follow Up Button");
		find(followUp).click();
	}

	public void waitForLeadFollowupFormToOpen() {
		waitForVisibilityOf(leadFollowUpFrom, 5);
	}

	public void selectFollowUpTime() throws InterruptedException {

		log.info("selectFollowUpTime");
		find(selectFollowUpTime).click();
		Thread.sleep(3000);
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

	public void selectAddNote() {
		log.info("Adding Notes ");
		find(addNote).sendKeys("Test Lead Activity");

	}

	public void clickSaveChangesButton() {
		log.info("Clicking Save Button");
		find(saveChangesButton).click();
	}

	public void dateSelect() throws InterruptedException {
		log.info("Clicking Follow Up Date");
		find(followUpDate).click();
		Thread.sleep(3000);
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

	public boolean isActivityTextDisplayed() {
		log.info("Activity Text is displayed");
		find(notesText);
		return true;
	}

	public boolean isTrialTextDisplayed() {
		log.info("Checking Trial Text displayed");
		find(trialText);
		return true;
	}

	public boolean isFollowUpTextDisplayed() {
		log.info("Checking Follow up Text displayed");
		find(followUpText);
		return true;
	}

	public void clickOnAddIcon() {
		log.info("Clicking Add Icon");
		find(addIcon).click();
	}

	public void clickOnQuickAddLink() {
		log.info("Clicking Quick Add Link");
		find(quickAddLink).click();
	}

	public void clickOnSendLinkButton() {
		log.info("Clicking Send Link Button");
		find(quickSendLinkButton).click();
	}

	public String emailValidationError() {
		return find(emailValidation).getText();
	}

	public String phoneValidationError() {
		return find(phoneValidation).getText();
	}

	public String inputQuickEmail() {
		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String emailID = "test" + userName + "@gmail.com";
		log.info("Entering Quick Email Address");
		find(quickEmailAddress).sendKeys(emailID);
		return emailID;
	}

	public void inputQuickMobileNo() {
		String randomNumbers = RandomStringUtils.randomNumeric(9);
		String phNo = 7 + randomNumbers;
		log.info("Entering Mobile No");
		find(quickPhoneNumber).sendKeys(phNo);
	}

	public String validationGetText() {
		return find(leadInvitationMessage).getText();
	}

	public void clickOnCloseButton() {
		log.info("Clicking Close Button");
		find(closeButton).click();
	}

	public void clickOnSendButton() {
		log.info("Clicking Send Button Link");
		find(sendButtonLink).click();
	}

	public void clickLeadModule() {
		log.info("clicking Leads Module");
		find(leadModule).click();

	}

	public void clickAdvancedFilters() {
		waitForVisibilityOf(advancedFilters, 9);
		log.info("clicking Advanced Filters");
		find(advancedFilters).click();

	}

	public void inputEmailId(String emailID) throws InterruptedException {
		waitForVisibilityOf(searchEmail, 9);
		log.info("Select Email Id Text Field");
		find(searchEmail).sendKeys(emailID);
		Thread.sleep(3000);
		find(searchEmail).sendKeys(Keys.ENTER);

	}

	public void selectLeadDelete() throws InterruptedException {
		log.info("Select the Checkbox");
		find(lineWrapper).click();
		Thread.sleep(5000);
		log.info("Clicking Delete Link");
		find(deleteLead).click();
	}

	public void clickYesButton() {
		log.info("Clicking Yes Buton");
		find(alertYesButton).click();

	}

	public String toasterDelete() {
		return find(leadToasterDelete).getText();
	}
	
	public MemberPage clickConvertToMemberButton() {
		log.info("clicking Convert To Member Button");
		find(convertToMember).click();
		return new MemberPage(driver);
	}
	
	public String leadConverted() {
		return find(leadConverted).getText();
	}
}
