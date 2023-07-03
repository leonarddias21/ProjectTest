package com.traqade.core.pages.auth;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.traqade.core.BasePageObject;

public class TasksPage extends BasePageObject {
	
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
	private By filterLeads = By.xpath("//div[@id='task-lead']//div//div[@class='multiselect__tags']");
	private By staffName = By.xpath("//div[@class='multiselect__content-wrapper']/ul[1]/li[1]/span[@class='multiselect__option multiselect__option--highlight']/span");
	private By memberTab = By.xpath("//a[contains(text(),'Members')]");
	private By staffFilter = By.xpath("//div[@class='col-sm-6 d-flex justify-content-end no-pad']/form/div[1]/div[1]/div[1]/div[2]");
	private By selectStaff = By.xpath("//div[@class='multiselect__content-wrapper']/ul/li/span[@class='multiselect__option multiselect__option--highlight']/span");
	private By filterCallType = By.xpath("//div[@class='col-sm-6 d-flex justify-content-end no-pad']/form/div[2]/div[1]/div[1]/div[2]");
	private By callTypeOption = By.xpath("//div[@class='tq-form-group']//span[contains(text(),'Welcome')]");
	private By addFollowUpButton = By.xpath("//div[@class='col-sm-9']//button[@class='btn btn-secondary'][contains(text(),'Add Follow-Up')]");
	private By callType = By.xpath("//span[contains(text(),'Select call type')]");
	private By callTypeOptionNew = By.xpath("//div[@class='multiselect-container']//span[contains(text(),'Welcome')]");
	private By assignTo = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[2]/span[1]");
	private By assignToOption = By.xpath("//div[@class='multiselect-container']//div[@class='multiselect__content-wrapper']/ul[1]/li[1]/span[@class='multiselect__option multiselect__option--highlight']/span");
	private By selectMember = By.xpath("//span[contains(text(),'Type to search')]");
	private By dateTime = By.xpath("//form[@id='addMemberFollowupForm']//input[@id='dob']");
	private By memberList = By.xpath("//span[contains(text(),'Testautomate10')]");
	private By actualXpathCalendar = By.xpath("//div[@class='xdsoft_calendar']/table/tbody/tr/td");
	private By notes = By.xpath("//textarea[@placeholder='Enter other reason']");
	private By addButton = By.xpath("//button[@id='addFollowUpSubmitButton']");
	private By reschedule = By.xpath("//tbody//tr//td/a//u[contains(text(),'Reschedule')]");
	private By reason = By.xpath("//span[contains(text(),'Select reason')]");
	private By reasonOption = By.xpath("//span[contains(text(),'Successful')]");
	private By dateTime1 = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[2]/form[1]/div[5]/i[1]");
	private By nextMonth = By.xpath("//body/div[10]/div[1]/div[1]/button[3]");
	private By buttonReschedule = By.xpath("//button[@id='rescheduleFollowUpSubmitButton']");
	private By rescheduleTab = By.xpath("//a[contains(text(),'Rescheduled')]");
	private By leadTab = By.xpath("//a[contains(text(),'Leads')]");
	private By tasksIcon = By.xpath("//p[contains(text(),'Tasks')]");
	private By openMember = By.xpath("//a[contains(text(),'Open')]");
	private By closeType = By.xpath("//tbody/tr/td/a[2]/u");
	private By closeReason =By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[2]/span[1]");
	private By reasonType = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[3]/ul[1]/li[1]");
	private By closeButton = By.xpath("//button[@id='closeFollowUpSubmitButton']");
	private By closeList = By.xpath("//a[contains(text(),'Closed')]");
	private By scrollPage = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[2]");
	private By allFollowUpTab = By.xpath("//a[contains(text(),'All Follow-ups')]");
	private By leads = By.xpath("//a[contains(@href,'leads')]");
	
	//Assert Xpath
	private By verifyTaskPage = By.xpath("//li[contains(text(),'Task Management')]");
	private By verifyAddedFollowUp = By.xpath("//p[contains(text(),'Testautomate10')]");
	private By verifyRescheduledMember = By.xpath("//tbody[1]/tr[1]/td[contains(text(),'Rescheduled')]");
	private By verifyCallType = By.xpath("//td[contains(text(),'Welcome')]");
	private By verifyClosedMember = By.xpath("//td[contains(text(),'Closed')]");
	private By verifyLeadName = By.xpath("//div[@class='user-details']//p[contains(text(),'Lead')]");
	
	public TasksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String tasksPageGetText(){
		return find(verifyTaskPage).getText();
	}
	
	public void clickLeadFilter(){
		log.info("Clicking the Lead Filter");
		find(filterLeads).click();
	}
	
	public void selectStaff(){
		log.info("Selecting Staff from the dropdown");
		find(staffName).click();
	}
	
	public void clickMemberTab(){
		log.info("Clicking the Member Tab");
		find(memberTab).click();
	}
	
	public void clickLeadTab(){
		log.info("Clicking the Lead Tab");
		find(leadTab).click();
	}
	
	public void clickMemberFilter(){
		log.info("Clicking the Staff from the dropdown");
		find(staffFilter).click();
	}
	
	public void selectStaff1(){
		log.info("Select Staff from the drop down");
		List<WebElement> ele=driver.findElements(selectStaff);
		for(int i =0;i<ele.size();i++)
		{
			int x = ele.get(i).getLocation().getX();
			if(x!=0)
				{
				ele.get(i).click();
				break;
				}
			}
	}
	
	public void clickFilterBy(){
		log.info("Clicking the Filter By Call Type");
		find(filterCallType).click();
	}
	
	public void selectFilterByCallType(){
		log.info("Selecting the call Type Option");
		find(callTypeOption).click();
	}
	
	public void clickAddFollowUp(){
		log.info(" Clickin the add follow Up Button");
		find(addFollowUpButton).click();
	}
	
	
	public void clickselectMember() throws InterruptedException{
		log.info("Entering  the Member Name to search");
		WebElement ele1= driver.findElement(selectMember);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele1).click().sendKeys("Testautomate10").build().perform();
		Thread.sleep(7000);
		log.info("Selecting the Member Name");
		WebElement member = driver.findElement(memberList);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", member);
		Thread.sleep(2000);	

	}
	
	
	public void clickCallType(){
	log.info("Clicking the call type Field");
	find(callType).click();
	}
	
	public void waitCallTypeToLoad(){
		waitForVisibilityOf(callTypeOptionNew,10);
		}
	
	public void selectCallTypeOption(){
		log.info("Selecting Welcome from Drop down");
		find(callTypeOptionNew).click();
	}
	
	public void clickAssignTo() throws InterruptedException{
		log.info("Clicking the Assign To drop down");
		WebElement ele= driver.findElement(assignTo);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='multiselect__option multiselect__option--highlight']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
	}
	
	
	public void selectAssignToOption(){
		log.info("Selecting Assigne from Drop down");
		//find(assignToOption).click();
		List<WebElement> ele=driver.findElements(assignToOption);
		for(int i =0;i<ele.size();i++)
		{
			int x = ele.get(i).getLocation().getX();
			if(x!=0)
				{
				ele.get(i).click();
				break;
				}
			}
	
	}
	
	public void clickDateTime() throws InterruptedException{
		log.info("Selecting the Date & Time Field");
		find(dateTime).click();
		Thread.sleep(3000);
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
	
	public void enterNote(){
		log.info("Entering the Note Description");
		find(notes).sendKeys("Entering Notes for Testing!");
	}
	
	public void clickAddFollowUpButton(){
		log.info("Clicking the Add Follow Up Button");
		find(addButton).click();
	}
	
	public String memberAddedGetText(){
		return find(verifyAddedFollowUp).getText();
	}
	
	public void clickReschedule(){
		log.info("Clicking the Reschedule Option");
		find(reschedule).click();
	}
	
	public void clickReason(){
		log.info("Clicking the Reason Field");
		find(reason).click();
	}
	
	public void waitReasonOptionToLoad(){
		waitForVisibilityOf(reasonOption,10);
		}
	
	public void selectreasonOption(){
		log.info("Selecting from the drop down");
		find(reasonOption).click();
	}
	
	public void clickDateTime1() throws InterruptedException{
		log.info("Clicking the Date & Time");
		WebElement datetime = driver.findElement(dateTime1);
		JavascriptExecutor jser = (JavascriptExecutor) driver;
		jser.executeScript("arguments[0].click()", datetime);
		Thread.sleep(2000);
		log.info("Clicking Next Month");
		find(nextMonth).click();
		Thread.sleep(2000);
		log.info("Selecting the date");
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
	
	public void clickRescheduleButton(){
		log.info("Clicking the reschedule button");
		find(buttonReschedule).click();
	}
	
	public void scrollTasksPage() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(scrollPage);
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		}
	
	public void clickRescheduleTab(){
		log.info("Clicking the reschedule Tab");
		find(rescheduleTab).click();
	}
	
	public String memberRescheduledGetText(){
		return find(verifyRescheduledMember).getText();
	}
	
	
	public String callTypeGetText(){
		return find(verifyCallType).getText();
	}
	
	public void clickTaskIcon(){
		log.info("Clicking the tasks Icon");
		find(tasksIcon).click();
	}
	
	public void clickOpenTab(){
		log.info("Clicking the Open tab section");
		find(openMember).click();		
	}
	
	public void clickCloseOption(){
		log.info(" Clcicking the close Option");
		find(closeType).click();
	}
	
	public void clickReason2(){
		log.info("Clicking the Reason Field");
		find(closeReason).click();
	}
	
	public void clickReasonOption1(){
	List<WebElement> ele=driver.findElements(reasonType);
	for(int i =0;i<ele.size();i++)
	{
		int x = ele.get(i).getLocation().getX();
		if(x!=0)
			{
			ele.get(i).click();
			break;
			}
		}

	}
	
	public void clickCloseButton(){
		log.info("Clicking the Close Follow Up Button");
		find(closeButton).click();
	}
	
	public void clickCloseTab(){
		log.info("Clicking close Tab");
		find(closeList).click();	
	}
	
	public String closeMemberGetText(){
		return find(verifyClosedMember).getText();
	}
	
	public void clickAllFollowUps(){
		log.info("Clicking the All Follow Ups Tab");
		find(allFollowUpTab).click();
	}
	
	public LeadsPage clickLeadIcon(){
		log.info("Clicking the Lead Module");
		find(leads).click();
		return new LeadsPage(driver);
		
	}
	
	public String leadNameGetText(){
		return find(verifyLeadName).getText();
	}
	
}
