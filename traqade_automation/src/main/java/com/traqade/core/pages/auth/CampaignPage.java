package com.traqade.core.pages.auth;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class CampaignPage extends BasePageObject {

	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
	private By addCampaign = By.xpath("//button[contains(text(),'Create New Campaign')]");
	private By campName = By.xpath("//input[@id='campaignName']");
	private By descField = By.xpath("//div[2]/textarea[1]");
	private By nextButton = By.xpath("//a[contains(text(),'Next')]");
	private By lists = By.xpath("//tbody/tr[1]/td[1]/div[1]/label[1]");
	private By nextPage = By.xpath("//a[contains(text(),'Next')]");
	private By createEmail = By.xpath("//button[contains(text(),'Create Email Template')]");
	private By hoverOn = By.xpath("//div[@class='main-wrapper']//div/div[@class='campaign-wrapper']//..//div[@class='panel-body']//..//div[@id='chooseEmailTemplate']//..//div[@class='modal-body']/ul/li[2]");
	private By selectEmail = By.xpath("//div[@class='main-wrapper']//div/div[@class='campaign-wrapper']//..//div[@class='panel-body']//..//div[@id='chooseEmailTemplate']//..//div[@class='modal-body']/ul/li[2]//div[@class='display-table']/div/a[2]/i");
	private By inputEmailName = By.xpath("//input[@id='templateName']");
	private By submitButton = By.xpath("//div[@class='main-wrapper']/div[2]/div[2]/div[1]/div[1]/div[3]/button[1]");
	private By hoverSms = By.xpath("//div[@class='main-wrapper']//div/div[@class='campaign-wrapper']//..//div[@class='panel-body']//..//div[@id='chooseSmsTemplate']//..//div[@class='modal-body']/ul/li[2]");
	private By selectSms = By.xpath("//div[@class='main-wrapper']//div/div[@class='campaign-wrapper']//..//div[@class='panel-body']//..//div[@id='chooseSmsTemplate']//..//div[@class='panel-body']//..//div[@id='chooseSmsTemplate']//..//div[@class='modal-body']/ul/li[2]/div/div[2]/div/a/i");
	private By inputSmsName = By.xpath("//input[@id='smsName']");
	private By submitSMS = By.xpath("//div[@class='main-wrapper']/div[2]/div[5]/div/div/div[3]/button[1]");
	private By selectSMS = By.xpath("//button[contains(text(),'Create SMS Template')]");
	private By selectRndEmail = By.xpath("//div[@class='main-wrapper']//div/div[@class='campaign-wrapper']//..//div[@class='panel-body']/div[1]/div[1]/div[1]/div[contains(@class, 'emailTemplateDiv')]");
	private By selectRndSMS =By.xpath("//div[@class='main-wrapper']//div/div[@class='campaign-wrapper']//..//div[@class='panel-body']/div[1]/div[1]/div[1]/div[contains(@class, 'smsTemplateDiv')]");
	private By sendNow = By.xpath("//div[@class='col-sm-5 send-schedule-form']//..//div/button[@class='btn btn-secondary btn-block scheduleNow']/i");
	private By filter = By.xpath("//div[@class='main-wrapper']//..//div[@class='col-md-6']/button[1]");
	private By createFrom = By.xpath("//input[@id='createdAtStart']");
	private By createTo = By.xpath("//input[@id='createdAtEnd']");
	private By actualXpathCalendar = By.xpath("//div[@class='xdsoft_calendar']/table/tbody/tr/td");
	private By actualXpathCalendar2 = By.xpath("//div[@class='xdsoft_calendar']/table[1]/tbody[1]/tr[5]/td");
	private By modeField = By.xpath("//div[@class='main-wrapper']//..//div[@class='filters']//..//div[@class='multiselect__tags']/input[@name='type']");
	private By modeType = By.xpath("//span[contains(text(),'EMAIL')]");
	private By created =By.xpath("//div[@class='main-wrapper']//..//div[@class='filters']//..//div[@class='multiselect__tags']/input[@name='createdBy']");
	private By createdName = By.xpath("//div[@class='main-wrapper']//..//div[@class='filters']//..//div[@class='multiselect__content-wrapper']/ul/li[1]/span[1]");
	private By statusField = By.xpath("//div[@class='main-wrapper']//..//div[@class='filters']//..//div[@class='multiselect__tags']/input[@name='status']");
	private By statusOption = By.xpath("//div[@class='main-wrapper']//..//div[@class='filters']//..//div[@class='multiselect__content-wrapper']/ul/li[2]/span[contains(text(),Running)]");
	private By clear = By.xpath("//div[@class='closeFilter']/span/i");
	private By scheduleFrom = By.xpath("//input[@id='scheduledAtStart']");
	private By scheduleTo = By.xpath("//input[@id='scheduledAtEnd']");
	private By searchName = By.xpath("//input[@id='campaignsearchname']");
	private By campScroll= By.xpath("//div[contains(text(),'Note: As per TRAI regulations, all promotional SMS')]");
	private By testEmail = By.xpath("//div[@class='tq-form-group form-group']/input[@type='email']");
	private By testPhone = By.xpath("//div[@class='tq-form-group form-group']/input[@name='phone']");
	private By sendButton = By.xpath("//button[@class='btn btn-default sendTestCampaign']");
	private By scheduleLater = By.xpath("//button[contains(text(),'Schedule for later')]");
	private By scheduleInTime = By.xpath("//div[@class='tq-form-group form-group']/input[@placeholder='Pick a date']");
	private By scheduleButton = By.xpath("//div[@class='main-wrapper']//..//div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]");
	private By newStatus = By.xpath("//div[@class='main-wrapper']//..//div[@class='filters']//..//div[@class='multiselect__content-wrapper']/ul/li[3]/span[contains(text(),Success)]");
	private By deleteCamp = By.xpath("//div[@class='main-wrapper']//..//tbody/tr[1]/td[9]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]");
	private By deleteOption = By.xpath("//button[contains(text(),'Yes')]");
	private By moreIcon=By.xpath("//p[contains(text(),'More')]");
	private By campaignIcon = By.xpath("//p[contains(text(),'Campaigns')]");
	private By existList =By.xpath("//a[contains(text(),'Existing Lists')]");
	private By existListPage = By.xpath("//li[contains(text(),'Existing Lists')]");
	private By createNewList = By.xpath("//a[contains(text(),'Create New List')]");
	private By listName = By.xpath("//div[@class='modal-header']//..//div[@class='form-group tq-form-group']/input[@class='form-control input-md required customName']");
	private By description = By.xpath("//textarea[@id='userListDescription']");
	private By memberStatus = By.xpath("//input[@id='member-isActive']");
	private By memberType = By.xpath("//span[contains(text(),'Active')]");
	private By additionalFilters = By.xpath("//a[contains(text(),'Additional Filters')]");
	private By scrollPop = By.xpath("//label[contains(text(),'Package Expiry Date')]");
	private By genderField = By.xpath("//div[@class='main-wrapper']//..//div[@class='multiselect__tags']/span[contains(text(),'Select Gender')]");
	private By genderType = By.xpath("//span[contains(text(),'Male')]");
	private By packageMember = By.xpath("//div[@class='multiselect__tags']/input[@id='membershipPackage']");
	private By packageMemberList = By.xpath("//div[@class='main-wrapper']//..//div[@class='multiselect__content-wrapper']/ul[1]/li[1]/span");
	private By save = By.xpath("//button[@id='user-list-add']");
	private By createdList = By.xpath("//div[@class='main-wrapper']//..//div[@class='multiselect']/div[2]/input[@id='groupListCreatedBy']");
	private By createdListOption = By.xpath("//div[@class='main-wrapper']//..//div[@class='multiselect__content-wrapper']/ul[1]/li[1]/span[1]");
	private By editHover = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table/tbody/tr[1]/td[6]");
	private By editIcon = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table/tbody/tr[1]/td/div/div/ul/li[2]/a/i");
	private By groupField = By.xpath("//div[@class='form-group tq-form-group']//..//div[@class='multiselect__tags']/input[@id='userGroup']");
	private By groupName = By.xpath("//div[@class='main-wrapper']//..//div[@class='multiselect__content-wrapper']/ul/li[2]/span[1]/span[1]");
	private By statusUpdate = By.xpath("//div[@class='form-group tq-form-group']//..//div[@class='multiselect__tags']/input[@name='status']");
	private By statusOptionList=By.xpath("//span[contains(text(),'Inactive')]");
	private By updateButton = By.xpath("//span[contains(text(),'Update')]");
	private By listFilter = By.xpath("//div[@class='main-wrapper']//..//div[@class='col-md-9']/button/i");
	private By listNameFilter = By.xpath("//div[@class='main-wrapper']//..//div[@class='filters']//..//div[@class='form-group tq-form-group']/input[@placeholder='Enter Name']");
	private By groupTypeFilter = By.xpath("//div[@class='main-wrapper']//..//div[@class='multiselect']/div[2]/input[@id='userType']");
	private By groupTypeOption = By.xpath("//div[@class='main-wrapper']//..//div[@class='multiselect__content-wrapper']/ul[@class='multiselect__content']/li[1]/span[1]");
	private By closeFilter = By.xpath("//div[@class='main-wrapper']//..//div[@id='campaignUserFilter']/div[1]/span/i");
	private By deleteIcon = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table/tbody/tr[1]/td/div/div/ul/li[3]/a/i");
	private By deleteListOption = By.xpath("//button[contains(text(),'Yes')]");
	
	//Assert Xpath
	private By verifyCampPage = By.xpath("//li[contains(text(),'Campaign Management')]");
	private By verifyCampStatus = By.xpath("//p[contains(text(),'Scheduled')]");
	private By verifyNewCampStatus = By.xpath("//p[contains(text(),'Success')]");
	private By verifycampName = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table[1]/tbody[1]/tr[1]/td[1]");
	private By verifyMode =By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table[1]/tbody[1]/tr[1]/td[6]/p/span[contains(text(),'Email')]");
	private By verifyCreatedBy =By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table[1]/tbody[1]/tr[1]/td[7]");
	private By verifyStatus = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table[1]/tbody[1]/tr[1]/td[8]/p[contains(text(),'Running')]");
	private By verifyDeleteCamp = By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']/div[contains(text(),'Campaign Deleted Successfully')]");
	private By verifyTestToast = By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']/div[contains(text(),'Test Email & Sms Sent Successfully')]");
	private By verifyExistList = By.xpath("//p[contains(text(),'All Members')]");
	private By verifyNewList = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table/tbody/tr[1]/td[1]/div[1]/p[1]");
	private By verifyCreatedByList = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table/tbody/tr[1]/td[5]");
	private By verifyToastListUpdated = By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']/div[contains(text(),'User List Updated Successfully')]");
	private By verifyGroupType = By.xpath("//div[@class='main-wrapper']//..//div[@class='align-pagination content-wrapper']/div/table/tbody/tr[1]/td[contains(text(),'Member')]");
	private By verifyDeleteOption = By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']/div[contains(text(),'User List Deleted Successfully')]");
	
	
	public CampaignPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String campaignPageGetText(){
		return find(verifyCampPage).getText();
		}

	public void clickAddCampaign(){
		log.info("Clicking the Create Campaign Button");
		find(addCampaign).click();
		}
	
	public String enterCampaignName(){
		String characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomCampName ="";
		int length= 5;
		Random rn = new Random();
		char[] text  = new char[length];
		for (int i =0; i<length; i++){
		text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for(int i = 0;i<text.length;i++){
		randomCampName += text[i];
		}
		log.info("Entering Campaign Name");
		find(campName).sendKeys(randomCampName);
		return randomCampName;
		}
	
	public void enterDescription(){
		log.info("Entering the description");
		find(descField).sendKeys("Entering Description in the Field!");
		}
	
	public void clickNext(){
		log.info("Clicking the Next Button");
		find(nextButton).click();
		}
	
	public void selectLists(){
		log.info("Clicking the All Member's List");
		find(lists).click();
		}
	
	public void clickNextPage(){
		log.info("Clicking the Next Button");
		find(nextPage).click();
		}
	
	public void clickCreateEmailTemp(){
		log.info("Clicking the Create Email Template");
		find(createEmail).click();
		}
	
	public void selectEmailTemp(){
        log.info("Hovering on the Email Template");
        WebElement hover=driver.findElement(hoverOn);
        log.info("Selecting the Email Template");
        WebElement selectTemp =driver.findElement(selectEmail);
        Actions ac = new Actions(driver);
        ac.moveToElement(hover).click().moveToElement(selectTemp).click().build().perform();      
    	}
	
	public String enterTemplateName(){
		String characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomTempName ="";
		int length= 5;
		Random rn = new Random();
		char[] text  = new char[length];
		for (int i =0; i<length; i++){
		text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for(int i = 0;i<text.length;i++){
		randomTempName += text[i];
		}
		log.info("Entering Campaign Name");
		find(inputEmailName).sendKeys(randomTempName);
		return randomTempName;
		}

	public void clickSubmit(){
		log.info("Clicking the Submit Button");
		WebElement submit = driver.findElement(submitButton);
		Actions ac = new Actions(driver);
        ac.moveToElement(submit).click().build().perform();
		}
	
	public void selectRndEmailTemp( ){
		log.info("Selecting the Email Template");
	    find(selectRndEmail).click();
		}
	
	public void clickCreateSMSTemp(){
		log.info("Clicking the Create SMS Template");
		find(selectSMS).click();
		}
	
	public void selectSMSTemp(){
        log.info("Hovering on the Email Template");
        WebElement hover=driver.findElement(hoverSms);
        log.info("Selecting the Email Template");
        WebElement selectTemp =driver.findElement(selectSms);
        Actions ac = new Actions(driver);
        ac.moveToElement(hover).click().moveToElement(selectTemp).click().build().perform();      
    	}
	
	public String enterSmsName(){
		String characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomTempName ="";
		int length= 5;
		Random rn = new Random();
		char[] text  = new char[length];
		for (int i =0; i<length; i++){
		text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for(int i = 0;i<text.length;i++){
		randomTempName += text[i];
		}
		log.info("Entering SMS Template Name");
		find(inputSmsName).sendKeys(randomTempName);
		return randomTempName;
		}
	
	public void clickSmsSubmit(){
		log.info("Clicking the Submit Button");
		WebElement submit = driver.findElement(submitSMS);
		Actions ac = new Actions(driver);
        ac.moveToElement(submit).click().build().perform();
		}
	
	public void selectRndSMSTemp( ){
		log.info("Selecting the Email Template");
	    find(selectRndSMS).click();
		}
	
	public void clickSendNow(){
		log.info("Clicking Send Now Button");
		find(sendNow).click();
		}
	
	public String campaignStatusGetText(){
		return find(verifyCampStatus).getText();
		}
	
	//Campaign Filter
	public void clickFilter(){
		log.info("Clicking the Campaign Filter");
		find(filter).click();
		}
	
	 public void inputCampNameFilter( String randomCampName ) throws InterruptedException{
     	log.info("Entering Staff Name to Filter");
     	find(searchName).sendKeys(randomCampName + Keys.ENTER);
     	Thread.sleep(2000);
     	}
	 
	 public String campaignNmGetText() {
		return find(verifycampName).getText();
		}
	
	public void clickCreatedFrom() throws InterruptedException{
		log.info("Clicking the Created From Field");
		find(createFrom).click();
		Thread.sleep(2000);
		log.info("Selecting the Date");
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
	
	
	public void clickCloseFilter(){
		log.info("Clicking the close Icon");
		find(clear).click();
	}
	
	public void clickCreatedTo() throws InterruptedException{
		log.info("Clicking the Created From field");
		find(createTo).click();
		Thread.sleep(2000);
		log.info("Selecting the Date");
		List<WebElement> dates = driver.findElements(actualXpathCalendar2);
		int total_node = dates.size();
		for (int i = 0; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("30")) {

				dates.get(i).click();
				break;
			}
		}
	}
	
	public void clickScheduleFrom() throws InterruptedException{
		log.info("Clicking the Schedule From Field");
		find(scheduleFrom).click();
		Thread.sleep(2000);
		log.info("Selecting the Date");
		List<WebElement> dates = driver.findElements(actualXpathCalendar);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("1")) {

				dates.get(i).click();
				break;
			}

		}
	}
	
	public void clickScheduleTo() throws InterruptedException{
		log.info("Clicking the Schedule From Field");
		find(scheduleTo).click();
		Thread.sleep(2000);
		log.info("Selecting the Date");
		List<WebElement> dates = driver.findElements(actualXpathCalendar2);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("30")) {

				dates.get(i).click();
				break;
			}

		}
	}
	
	public void clickMode() throws InterruptedException{
		log.info("Clicking the Mode Field");
		WebElement mode = driver.findElement(modeField);
		WebElement email = driver.findElement(modeType);
		Actions ac = new Actions(driver);
        ac.moveToElement(mode).click().moveToElement(email).click().build().perform();
        Thread.sleep(2000);     
	}
	
	public String campaignModeGetText() {
		return find(verifyMode).getText();
	}
	
	public String clickCreatedBy() throws InterruptedException{
		log.info("Clicking the Mode Field");
		WebElement create = driver.findElement(created);
		Actions ac = new Actions(driver);
        ac.moveToElement(create).click().build().perform();
        Thread.sleep(2000);
        log.info("Selecting The Name from the drop down");
        List<WebElement> name=driver.findElements(createdName);
		String createdName ="";
		for(int i =0;i<name.size();i++)
		{
			int x = name.get(i).getLocation().getX();
			if(x!=0)
				{
					name.get(i).click();
					createdName += name.get(i).getText();
					break;
				}
			}
		return createdName;
	}
	
	public String createdByGetText(){
		return find(verifyCreatedBy).getText();
	}
	
	public String clickStatus() throws InterruptedException{
		log.info("Clicking the Status Field");
		WebElement status = driver.findElement(statusField);
		Actions ac = new Actions(driver);
        ac.moveToElement(status).click().build().perform();
        Thread.sleep(2000);
        log.info("Selecting The Name from the drop down");
        List<WebElement> statusType=driver.findElements(statusOption);
		String statusName ="";
		for(int i =0;i<statusType.size();i++)
		{
			int x = statusType.get(i).getLocation().getX();
			if(x!=0)
				{
				statusType.get(i).click();
				statusName += statusType.get(i).getText();
					break;
				}
			}
			return statusName ;
	}
	
	public String statusGetText(){
		return find(verifyStatus).getText();
		}
	
	public void clickCampaignName(){
		log.info("Clicking the Campaign Created");
		find(verifycampName).click();
		}
	
	public void scrollCampDetails() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(campScroll);
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	
	public void inputTestEmail(){
		log.info("Entering sample email ID");
		find(testEmail).sendKeys("test23@gmail.com");
		}
	
	public void inputTestPhone(){
		log.info("Entering the sample Phone No");
		find(testPhone).sendKeys("9739809411");
		}
	
	public void clickSend(){
		log.info("Clicking the Send Button");
		find(sendButton).click();
		}
	
	public String testEmailGetText(){
		return find(verifyTestToast).getText();
		}
	
	
	public void clickCampaignIcon(){
        log.info("Hovering on More");
        WebElement ele=driver.findElement(moreIcon);
        log.info("Clicking Campaign Module");
        WebElement ele1 =driver.findElement(campaignIcon);
        Actions ac = new Actions(driver);
        ac.moveToElement(ele).click().moveToElement(ele1).click().build().perform();    
    }

	
	public void clickScheduleLater(){
		log.info("Clicking the Schedule Later Button");
		find(scheduleLater).click();
	}
	
	public void selectSchedule() throws InterruptedException{
		log.info("Clicking the Created From Field");
		WebElement ele = driver.findElement(scheduleInTime);
		Actions ac = new Actions(driver);
        ac.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		}
	
	public void selectScheduleDate() throws InterruptedException{
		log.info("Selecting the future Date");
		List<WebElement> dates = driver.findElements(actualXpathCalendar);
		int total_node = dates.size();
		for (int i = 1; i <= total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("1")) {

				dates.get(i).click();
				break;
				}

			}
		}
	
	public void clickScheduleButton(){
		log.info("Clicking Schedule Button");
		WebElement ele= driver.findElement(scheduleButton);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", ele);
		}
	
	public String clickStatusOption() throws InterruptedException{
		log.info("Clicking the Status Field");
		WebElement status = driver.findElement(statusField);
		Actions ac = new Actions(driver);
        ac.moveToElement(status).click().build().perform();
        Thread.sleep(2000);
        log.info("Selecting The Name from the drop down");
        List<WebElement> statusType=driver.findElements(newStatus);
		String statusName ="";
		for(int i =0;i<statusType.size();i++)
		{
			int x = statusType.get(i).getLocation().getX();
			if(x!=0)
				{
				statusType.get(i).click();
				statusName += statusType.get(i).getText();
					break;
				}
			}
		return statusName ;
		}
	
	public String campaignNewStatusGetText(){
		return find(verifyNewCampStatus).getText();
		}
	
	public void clickDeleteCampagin(){
		log.info("Clicking the delete Icon");
		WebElement delete = driver.findElement(deleteCamp);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", delete);
		}
	
	public void clickDeleteOption(){
		WebElement option = driver.findElement(deleteOption);
		Actions ac = new Actions(driver);
		ac.moveToElement(option).click().build().perform();
		}
	
	public String campaignDeleteGetText(){
		return find(verifyDeleteCamp).getText();
		}
	
	public void clickExistList(){
		log.info("Clicking the Existing List Section");
		find(existList).click();
		}
	
	public void waitForExistingListPageToLoad() {
		waitForVisibilityOf(existListPage, 15);
		}
	
	public String campaignExistListGetText(){
		return find(verifyExistList).getText();
		}
	
	public void clickCreateNewList(){
		log.info("Clicking the Create New List Button");
		find(createNewList).click();
		}
	
	public String enterListName(){
		String characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomListsName ="";
		int length= 5;
		Random rn = new Random();
		char[] text  = new char[length];
		for (int i =0; i<length; i++){
		text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for(int i = 0;i<text.length;i++){
			randomListsName += text[i];
		}
		log.info("Entering New Lists Name");
		find(listName).sendKeys(randomListsName);
		return randomListsName;
		}
	
	public void enterListDescription(){
		log.info("Entering the Desscription for the List Name");
		find(description).sendKeys("Loreum Ipsum");
		}
	
	public void clickMembershipStatus(){
		log.info("Clicking the Member status field");
		WebElement memStatus = driver.findElement(memberStatus);
		WebElement ele2 = driver.findElement(memberType);
		Actions ac = new Actions(driver);
        ac.moveToElement(memStatus).click().moveToElement(ele2).click().build().perform();
		}
	
	public void clickAdditionalFilters(){
		log.info("Clicking the additional filters");
		find(additionalFilters).click();
		}
	
	/*public void clickStartDate(){
	log.info("Clicking the From date Field");	
	find(By.xpath("//input[@id='membershipCreatedStartDate']")).click();
	log.info("Selecting the Date");
	List<WebElement> dates = driver.findElements(By.xpath("//div[@class='xdsoft_calendar']/table/tbody/tr[1]/td"));
	int total_node = dates.size();
	for (int i = 1; i <= total_node; i++) {
		String date = dates.get(i).getText();
		if (date.equalsIgnoreCase("5")) {

			dates.get(i).click();
			break;
		}
	}
	}*/
	
	public void scrollTempPopUp() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(scrollPop);
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	
	public void selectGender(){
		log.info("Clicking the Gender Field");
		WebElement gender = driver.findElement(genderField);
		WebElement Male = driver.findElement(genderType);
		Actions ac = new Actions(driver);
		ac.moveToElement(gender).click().moveToElement(Male).click().build().perform();
		}
	
	public String selectMembershipPackage() throws InterruptedException{
		log.info("Clicking the MemberShip Package Field");
		WebElement memType = driver.findElement(packageMember);
		Actions ac = new Actions(driver);
        ac.moveToElement(memType).click().build().perform();
		Thread.sleep(2000);
        List<WebElement> memName=driver.findElements(packageMemberList);
		String packName ="";
		for(int i =0;i<memName.size();i++)
		{
			int x = memName.get(i).getLocation().getX();
			if(x!=0)
				{
				memName.get(i).click();
				packName += memName.get(i).getText();
					break;
				}
			}
			return packName ;
		}
	
	public void clickSaveButton(){
		log.info("Clicking the Save Button");
		find(save).click();
		}
	
	public String campaignExistingListGetText(){
		return find(verifyNewList).getText();
		}
	
	public void clickListFilter(){
		log.info("Clicking the Filter");
		find(listFilter).click();
		}
	
	public void inputListNameFilter( String randomListsName ) throws InterruptedException{
	     log.info("Entering New List Name to Filter");
	     find(listNameFilter).sendKeys(randomListsName + Keys.ENTER);
	     }
	
	public void clickGroupType(){
		log.info("Clicking the Group Type Field");
		WebElement groupType = driver.findElement(groupTypeFilter);
		WebElement mem = driver.findElement(groupTypeOption);
		Actions ac = new Actions(driver);
        ac.moveToElement(groupType).click().moveToElement(mem).click().build().perform();
		}
	
	public String groupTypeGetText(){
		return find(verifyGroupType).getText();
		}
	
	
	public void clickClearFilter(){
		log.info("Clicking the Close Icon");
		find(closeFilter).click();
		}
	
	public void clickCreatedFromList() throws InterruptedException{
		log.info("Clicking the Created From Field");
		find(By.xpath("//input[@id='userListCreatedAtStart']")).click();
		Thread.sleep(2000);
		log.info("Selecting the Date");
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
	
	public void clickCreatedToList() throws InterruptedException{
		log.info("Clicking the Created To Field");
		find(By.xpath("//input[@id='userListCreatedAtEnd']")).click();
		Thread.sleep(2000);
		log.info("Selecting the Date");
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
	
	public String clickCreatedByList() throws InterruptedException{
		log.info("Clicking the Created By Field");
		WebElement ele= driver.findElement(createdList);
		Actions ac = new Actions(driver);
        ac.moveToElement(ele).click().build().perform();
        Thread.sleep(2000);
		List<WebElement> createByName=driver.findElements(createdListOption);
		String createName ="";
		for(int i =0;i<createByName.size();i++)
		{
			int x = createByName.get(i).getLocation().getX();
			if(x!=0)
				{
				createByName.get(i).click();
				createName += createByName.get(i).getText();
					break;
				}
			}
		return createName ;
		}
	
	public String createdByListGetText(){
		return find(verifyCreatedByList).getText();
		}
	
	public void clickEditList() throws InterruptedException{
		log.info("Clicking the Edit Icon");
		WebElement ele = driver.findElement(editHover);
		WebElement edit =driver.findElement(editIcon);
		Actions ac = new Actions(driver);
        ac.moveToElement(ele).click().moveToElement(edit).click().build().perform();       
		}
	
	public String clickUserGroup() throws InterruptedException{
	log.info("Clicking the Group Field");
	WebElement group = driver.findElement(groupField);
	Actions ac = new Actions(driver);
	ac.moveToElement(group).click().build().perform();
	Thread.sleep(2000);
	log.info("Selecting the Staff group from drop down");
	List<WebElement> groupByName=driver.findElements(groupName);
	String groupName ="";
	for(int i =0;i<groupByName.size();i++)
	{
		int x = groupByName.get(i).getLocation().getX();
		if(x!=0)
			{
			groupByName.get(i).click();
			groupName += groupByName.get(i).getText();
				break;
			}
		}
		return groupName ;
	}
	
	public void clickStaffStatus(){
		log.info("Clicking the Status Field");
		WebElement status = driver.findElement(statusUpdate);
		WebElement statusType = driver.findElement(statusOptionList);
		Actions ac = new Actions(driver);
		ac.moveToElement(status).click().moveToElement(statusType).click().build().perform();	
		}
	
	public void clickUpdate(){
		log.info("Clicking the Update Button ");
		find(updateButton).click();
		}
	
	public String listUpdateGetText(){
		return find(verifyToastListUpdated).getText();
		}
	
	public void clickDeleteList(){
		log.info("Clicking the Delete Icon");
		WebElement hover = driver.findElement(editHover);
		WebElement delete = driver.findElement(deleteIcon);
		Actions ac = new Actions(driver);
		ac.moveToElement(hover).click().moveToElement(delete).click().build().perform();
		}
	
	public void clickDeleteListOption(){
		log.info("Clicking the Delete Option");
		find(deleteListOption).click();
		}
	
	public String listDeleteGetText(){
		return find(verifyDeleteOption).getText();
		}

}	


