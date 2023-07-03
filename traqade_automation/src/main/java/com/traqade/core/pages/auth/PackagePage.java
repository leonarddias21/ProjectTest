package com.traqade.core.pages.auth;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.traqade.core.BasePageObject;

public class PackagePage extends BasePageObject {
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
	private By addPackage = By.xpath("//button[@class='el-button primary-gradient el-button--primary el-button--small']//span[contains(text(),'Add Package')]");
	private By verifyPackagePage = By.xpath("//a[contains(text(),'Packages')]");
	private By packageType = By.xpath("//input[@placeholder='Select Package Type']");
	private By packageOption = By.xpath("//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[1]/span");
	private By packageName = By.xpath("//input[@placeholder='Enter Package Name']");
	private By price=By.xpath("//input[@placeholder='Enter Package price']");
	private By presentDate = By.xpath("//div[@class='el-picker-panel__content el-date-range-picker__content is-left']//tr[@class='el-date-table__row']//td[@class='available today']");
	private By maxDiscount=By.xpath("//input[@placeholder='Enter Discount Amount']");
	private By duration = By.xpath("//input[@placeholder='Select Package Duration']");
	private By activities = By.xpath("//input[@placeholder='Select Activities']");
	private By activitiesType1 = By.xpath("//span[contains(text(),'Aerobics')]");
	private By activitiesType2 = By.xpath("//span[contains(text(),'Dance Classes')]");
	private By validFrom = By.xpath("//input[@placeholder='From']");
	private By freezable = By.xpath("//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]");
	private By freezableOption = By.xpath("//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[1]/span[1]");
	private By freezableDays = By.xpath("//input[@placeholder='Enter freezable days']");
	private By freezableNo = By.xpath("//input[@placeholder='Enter Freezable Numbers']");
	private By transferable = By.xpath("//div[@class='el-dialog__wrapper']//div[5]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]");
	private By transferableOption = By.xpath("//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[1]/span");
	private By description = By.xpath("//textarea[@placeholder='Enter Package Description']");
	private By addPackageSubmit= By.xpath("//button[@class='el-button primary-gradient el-button--primary']//span[contains(text(),'Add Package')]");
	
	//Filter Xpath
	private By filter = By.xpath("//button[contains(@class,'el-button btn-icon el-button--default')]");
	private By checkPackageName= By.xpath("//div[@class='tq-filter__container']//div[1]//div[1]//label[1]//span[1]//span[1]");
	private By inputPackageName = By.xpath("//body[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
	private By applyFilter = By.xpath("//span[contains(text(),'Apply Filter')]");
	private By clearAll = By.xpath("//span[contains(text(),'Clear All')]");
	private By checkPackageType = By.xpath("//div[@class='form__body']//div[2]//div[1]//label[1]//span[1]//span[1]");
	private By packageTypeFilter = By.xpath("//input[@placeholder='Select package type']");
	private By packageOptionFilter = By.xpath("//div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[1]/li[1]/span[1]");
	private By checkTransferableFilter = By.xpath("//div[3]//div[1]//label[1]//span[1]//span[1]");
	private By transferableTypeFilter = By.xpath("//div[3]//div[2]//div[1]//div[1]//div[1]//input[1]");
	private By transferType = By.xpath("//div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[1]/li[1]/span[1]");
	private By checkFreezableBox = By.xpath("//div[4]//div[1]//label[1]//span[1]//span[1]");
	private By FreezableTypeFilter= By.xpath("//div[4]//div[2]//div[1]//div[1]//div[1]//input[1]");
	private By freezableType = By.xpath("//div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[1]/li[1]/span[1]");
	private By checkfreezableDays = By.xpath("//div[5]//div[1]//label[1]//span[1]//span[1]");
	private By freezableDaysNo= By.xpath("//div[5]//div[2]//div[1]//div[1]//input[1]");
	private By checkPackageDuration = By.xpath("//div[6]//div[1]//label[1]//span[1]//span[1]");
	private By packageDurationNo=By.xpath("//div[@class='el-col el-col-12']//input[@placeholder='Enter a value']");
	private By closeFilter = By.xpath("//div[contains(@class,'header__close-button')]");
	
	private By rnmPackageName = By.xpath("//tr[1]//td[2]//div[1]");
	private By deactivate = By.xpath("//span[contains(text(),'Deactivate')]");
	private By deactivateOption = By.xpath("//div[3]//span[1]//button[2]");
	private By inactivePackage = By.xpath("//div[@id='tab-0']");
	private By activate = By.xpath("//span[contains(text(),'Activate')]");
	private By activePackage = By.xpath("//div[@id='tab-1']");
	private By editPackage = By.xpath("//u[contains(text(),'Edit')]");
	private By close = By.xpath("//i[@class='el-input__icon el-range__close-icon']");
	private By updatePackage= By.xpath("//span[contains(text(),'Update Package')]");
	private By freezableNew = By.xpath("//div[@class='el-dialog__wrapper']//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]");
	private By freeze = By.xpath("//body[@class='el-popup-parent--hidden']/div[@class='el-select-dropdown el-popper']/div[@class='el-scrollbar']/div[@class='el-select-dropdown__wrap el-scrollbar__wrap']/ul[@class='el-scrollbar__view el-select-dropdown__list']/li[2]/span");
	private By scroll2 = By.xpath("//label[contains(text(),'Transferable')]");
	private By delete = By.xpath("//u[contains(text(),'Delete')]");
	
	//Assert Xpath for Filter
	private By verifyPackageType = By.xpath("//tr[1]//td[4]//div[1]");
	private By verifyTransferType = By.xpath("//tr[1]//td[6]//div[1]//span[1]");
	private By verifyFreezableType = By.xpath("//tr[1]//td[6]//div[1]//span[2]");
	private By verifyPackageName = By.xpath("//tr[1]//td[2]//div[1]");
	private By verifyPackageUpdate = By.xpath("//div[@class='el-notification__content']/p[contains(text(),'Package Validity Updated Successfully!')]");
	private By deleteOption = By.xpath("//div[@class='el-dialog__wrapper']//div[3]//span[1]//button[2]");
	
	
	public PackagePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String packagePageGetText(){
		return find(verifyPackagePage).getText();
	}
	public void clickAddPackage()
	{
		log.info("Clicking Add Package Button");
		find(addPackage).click();
	}

	public void clickPackageType(){
		log.info("Clicking the Package Type");
		find(packageType).click();
	}
	
	public void waitForMembershipTypeToLoad(){
		waitForVisibilityOf(packageOption,10);
	}
	
	public void selectMembershipType(){
		log.info("Selecting Package Type");
		find(packageOption).click();
	}
	
	
	
	public String enterPackageName(){
		String characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomPackageName ="";
		int length= 8;
		Random rn = new Random();
		char[] text  = new char[length];
		for (int i =0; i<length; i++){
		text[i] = characters.charAt(rn.nextInt(characters.length()));
		}
		for(int i = 0;i<text.length;i++){
		randomPackageName += text[i];
		}
		log.info("Entering Staff Name");
		find(packageName).sendKeys(randomPackageName);
		return randomPackageName;
		}
	
	public void enterMemberPrice(){
		log.info("Entering price amount");
		find(price).sendKeys("10000");
	}
	
	public void enterDiscount(){
		log.info("Entering Discount Price");
		find(maxDiscount).sendKeys("1000");
	}
	
	public void enterDuration(){
		log.info("Entering duration Periord");
		find(duration).sendKeys("6");
	}

	public void clickActivities(){
		log.info("Clicking the Activities Field");
		find(activities).click();
	}
	
	public void selectActivitiesOptions(){
		WebElement ele = driver.findElement(activitiesType1);
		WebElement ele1 = driver.findElement(activitiesType2);
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).click().moveToElement(ele1).click().build().perform();
	}
	
	public void scrollPackagePopUp() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Valid Period')]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		}
	
	
	public void clickValidFrom() throws InterruptedException{
	    log.info("Clicking the From Date in Calendar");
		find(validFrom).click();
		Thread.sleep(3000);
		log.info("Selecting the available date in Calendar");
		find(presentDate).click();
	 }
	
	public void clickValidTo() throws InterruptedException{
		log.info("Selecting the available date in Calendar");
		List<WebElement>al = driver.findElements(By.xpath("//div[@class='el-picker-panel__content el-date-range-picker__content is-right']//tr[@class='el-date-table__row']//td[@class='available']"));
		for(int i=0;i<al.size();i++){
			String value =al.get(i).getText();
			if(value.equalsIgnoreCase("5"))
				{
					al.get(i).click();
					break;
				}
				}
		 }
	
	public void clickFreezable(){
		log.info("Clicking the freezable Field ");
		find(freezable).click();	
	}
	
	public void selectFreezableOption()
	{
		List<WebElement> ele=driver.findElements(transferableOption);
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
	
	public void enterFreezableDays(){
		log.info("Entering the no of freezable days");
		find(freezableDays).sendKeys("5");
	}
	
	public void enterFreezableNo(){
		log.info("Entering the no of freezable times");
		find(freezableNo).sendKeys("5");
	}
	
	public void scrollPackagePopUpSec() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Description')]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		}
	
	
	public void clickTransferable(){
		log.info("Clicking the transferable drop down");
		find(transferable).click();
	}
	
	public void clickTransferableOption() throws InterruptedException{
		log.info("Selecting Transferable Option");
		List<WebElement> ele=driver.findElements(freezableOption);
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
	
	public void enterDescription(){
		log.info("Entering Description");
		find(description).sendKeys("Entering description for Package");	
	}
	
	public void clickSubmit(){
		log.info("Clicking Add Packge Button");
		find(addPackageSubmit).click();
	}

	public String addPackageGetText(){
		return find(By.xpath("//div[@class='el-notification__content']//p[contains(text(), 'Package Created Successfully!')]")).getText();
		
	}
	
	public void clickFilter(){
		log.info("Clicking Filter Icon");
		find(filter).click();
	}

	public void clickCheckPackageName(){
		log.info("Clicking Package Name check Box");
		find(checkPackageName).click();
	}
	
	public String enterPackageName(String randomPackageName){
		log.info("Entering package Name");
		find(inputPackageName).sendKeys(randomPackageName);
		return randomPackageName;
	}
	
	
	public void clickApplyFilter(){
		log.info("Clicking Apply Filter Button");
		find(applyFilter).click();
	}
	
	public String verifyPackageName(){
		return find(verifyPackageName).getText();
	}
	
	public void clickClearFilter(){
		log.info("Clicking Clear Filter");
		find(clearAll).click();
	}
	
	public void checkPackageType(){
		log.info("Clicking the Package Type Check Box");
		find(checkPackageType).click();
	}
	
	public void clickPkgTypeFilter(){
		log.info("Clicking package type drop down");
		find(packageTypeFilter).click();
	}
	
	public void selectMembershipFilter() throws InterruptedException{
		log.info("Selecting Membership Type from dropdown");
		List<WebElement> ele = driver.findElements(packageOptionFilter);
		for(int i =0;i<ele.size();i++)
		{
			String x = ele.get(i).getText();
			if(x.equalsIgnoreCase("Membership"))	
			{
				ele.get(i).click();
				break;
			}
		}
	}
	
	
	//Verify Package Type
	public String verifyGetTextPackageTye(){
		return find (verifyPackageType).getText();
	}
	
	
	
	
	public void checkTransferable(){
		log.info("Clicking the transferable check box");
		find(checkTransferableFilter).click();
	}
	
	public void clickTransferableDropdown()
	{
		log.info("Clicking tranferable drop down");
		find(transferableTypeFilter).click();
	}
	
	public  void selectTransferableOption(){
		log.info("Selecting the transferable option from drop down");
		List<WebElement> ele = driver.findElements(transferType);
		for(int i =0;i<ele.size();i++)
		{
			String x = ele.get(i).getText();
			if(x.equalsIgnoreCase("Yes"))
			{
			ele.get(i).click();
			break;
			}
		}
	}
	
	//verify transfer type
	public String verifyTranferTypeGetText(){
		return find(verifyTransferType).getText();
	}
	
	
	public void clickcheckFreezableFilter(){
		log.info("Clicking Tranferable Check Box");
		find(checkFreezableBox).click();
	}
	
	public void clickFreezableDropdown(){
		log.info("Clicking the freezable dropdown");
		find(FreezableTypeFilter).click();
	}
	public void waitForFreezableOptionsToLoad(){
		waitForVisibilityOf(freezableType,10);
	}

	public void selectFreezableOptions(){
		log.info("Selecting freezable option from dropdown");
		List<WebElement> ele=driver.findElements(freezableType);
		for(int i =0;i<ele.size();i++)
		{
		String x = ele.get(i).getText();
		if(x.equalsIgnoreCase("Yes"))
		{
		ele.get(i).click();
		break;
		}
	}
		}
	
	
	//Verify Freezable Type
	public String verifyFreezableTypeGetText(){
		return find( verifyFreezableType).getText();
	}
	
	
	
	
	public void clickcheckFreezabledaysFilter(){
		log.info("Clicking freezable days check box");
		find(checkfreezableDays).click();
	}
	
	public void enterFreezableDayNo(){
		log.info("Entering days into the text Field");
		find(freezableDaysNo).sendKeys("5");
			
	}
	
	public void clickcheckPackageDuration(){
		log.info("Clicking the Package duration check box");
		find(checkPackageDuration).click();
	}
	
	public void enterPackageDuration(){
		log.info("Entering Package duration days");
		find(packageDurationNo).sendKeys("6");
	}
	
	public void	clickcloseFilter(){
		log.info("Clicking Close Filter");
		find(closeFilter).click();
	}
	
	public void clickRnmPackageName(){
		log.info("Clicking the Random generated Package Name");
		find(rnmPackageName).click();
	}
	
	public void clickDeactivate(){
		log.info("Clicking deactivate Package");
		find(deactivate).click();
	}
	
	public void clickDeactivateOption(){
		log.info("Clicking the deactivate Option");
		find(deactivateOption).click();
	}
	
	public void clickInactivePackage(){
		log.info("Clicking the Inactive Tab");
		find(inactivePackage).click();
	}
	
	public void clickActivate(){
		log.info("Clicking the Activate Package Icon");
		find(activate).click();
	}
	
	public void clickActivePackage(){
		log.info("Cliking the Active Tab");
		find(activePackage).click();
	}
	
	public void clickEdit(){
		log.info("Clicking the Edit Icon");
		find(editPackage).click();
	}
	
	public void enterMaxDiscount(){
		log.info("Entering new Discount");
		find(maxDiscount).clear();
		find(maxDiscount).sendKeys("1500");	
	}
	
	public void clickUpdateValidFrom() throws InterruptedException{
	log.info("Clicking the From Date in Calendar");
	find(validFrom).click();
	Thread.sleep(2000);
	log.info("Selecting the available date in Calendar");
	List<WebElement>al = driver.findElements(By.xpath("//div[@class='el-picker-panel__content el-date-range-picker__content is-left']//tr[@class='el-date-table__row']//td[@class='available']"));
	for(int i=0;i<al.size();i++){
		String value =al.get(i).getText();
		if(value.equalsIgnoreCase("10"))
			{
				al.get(i).click();
				break;
			}
		}
	 }
	
	public void clickUpdateValidTo(){
		log.info("Selecting the available date in Calendar");
		List<WebElement>al = driver.findElements(By.xpath("//div[@class='el-picker-panel__content el-date-range-picker__content is-right']//tr[@class='el-date-table__row']//td[@class='available']"));
		for(int i=0;i<al.size();i++){
			String value =al.get(i).getText();
			if(value.equalsIgnoreCase("10"))
				{
					al.get(i).click();
					break;
				}
				}
		 }
	
	
	
	public void clickCloseIcon(){
		find(close).click();
	}
	
	
	public void scrollPackagePopUpSec2() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(scroll2);
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		}
	
	public void clickUpdateFreezable(){
		log.info("Selecting Freezable Field");
		find(freezableNew).click();
	}
	
	public void waitForFreezableToLoad(){
		waitForVisibilityOf(freeze,10);
	}
	
	public void selectFreezable(){
		log.info("Selecting the second transferable Option");
		find(freeze).click();
	}
	
	public void clickUpdateButton(){
		log.info("Selecting the Update Button");
		find(updatePackage).click();
	}
	
	public String	verifyPackageUpdateGetText(){
		return find(verifyPackageUpdate).getText();
	}
	
	public void clickDelete(){
		log.info("Clicking the Delete Icon");
		find(delete).click();	
	}
	
	public void selectDeleteOption(){
		log.info("Selecting the delete Option");
		find(deleteOption).click();
	}
}
