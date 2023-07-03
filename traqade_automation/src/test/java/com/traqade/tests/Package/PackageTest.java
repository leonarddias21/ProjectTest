package com.traqade.tests.Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.traqade.core.pages.auth.AuthorizeCenterPage;
import com.traqade.core.pages.auth.DashboardPage;
import com.traqade.core.pages.auth.PackagePage;
import com.traqade.tests.auth.AuthTest;

public class PackageTest extends AuthTest {

	@Test(priority = 1)
	public void packageTest() throws InterruptedException {
		
		  AuthorizeCenterPage authorizeCenterPage = getAuthorizationCenterPage();
	      delay(5000);
		  DashboardPage dashBoardPage = authorizeCenterPage.clickSelectButton();
		  delay(5000);
		  dashBoardPage.waitForDashboardPageToLoad();
		  dashBoardPage.clickNotifyIcon();
		  PackagePage packagePage = dashBoardPage.clickPackageIcon();
		  delay(3000);
		  
		  //Verifying If landed in the Package Listing Page
		  String packageTitle = packagePage.packagePageGetText();
		  Assert.assertEquals(packageTitle,packagePage.packagePageGetText(),"Package Page title matched");
		 
		  //Add Package Section
		  packagePage.clickAddPackage();
		  packagePage.clickPackageType();
		  packagePage.waitForMembershipTypeToLoad();
		  packagePage.selectMembershipType();
		  String packageName=packagePage.enterPackageName();
		  packagePage.enterMemberPrice();
		  packagePage.enterDiscount();
		  packagePage.enterDuration();
		  packagePage.scrollPackagePopUp();
		  delay(2000);
		  packagePage.clickActivities();
		  packagePage.selectActivitiesOptions();
		  packagePage.clickValidFrom();
		  delay(2000);
		  packagePage.clickValidTo();
		  delay(2000);
		  packagePage.clickFreezable();
		  delay(2000);
		  packagePage.selectFreezableOption();
		  packagePage.enterFreezableDays();
		  packagePage.enterFreezableNo();
		  packagePage.scrollPackagePopUpSec();
		  packagePage.clickTransferable();
		  delay(2000);
		  packagePage.clickTransferableOption();
		  packagePage.enterDescription();
		  packagePage.clickSubmit();
		  delay(3000);
		  
		  //Verifying If the Package is added or not 
		  Assert.assertEquals(packagePage.addPackageGetText(), "Package Created Successfully!","Package Add toast is mismatch");
		  delay(3000);
		  
		  //Filter Part
		  packagePage.clickFilter();
		  delay(3000);
		  packagePage.clickCheckPackageName();
		  String packagename=packagePage.enterPackageName(packageName);
		  packagePage.clickApplyFilter();
		  delay(2000);
		  
		  //Assert Method for Package Name
		  Assert.assertEquals(packagename,packagePage.verifyPackageName(),"Package Name is a mismatch");
		  delay(2000);
		  
		  packagePage.clickClearFilter();
		  delay(2000);
		  packagePage.checkPackageType();
		  packagePage.clickPkgTypeFilter();
		  delay(2000);
		  packagePage.selectMembershipFilter();
		  packagePage.clickApplyFilter();
		  delay(3000);
		  
		  //Assert method for Package Type
		  Assert.assertEquals(packagePage.verifyGetTextPackageTye(),"Membership","MemberShip Type Name is  found!");
		  delay(2000);
		  
		  packagePage.clickClearFilter();
		  delay(2000);
		  packagePage.checkTransferable();
		  packagePage.clickTransferableDropdown();
		  delay(2000);
		  packagePage.selectTransferableOption();
		  packagePage.clickApplyFilter();
		  delay(3000);
		  
		  //Assert method for transferable type 
		  Assert.assertEquals(packagePage.verifyTranferTypeGetText(),"Yes","Tranfer Type is a mismatch!");
		  delay(2000);
		  
		  packagePage.clickClearFilter();
		  delay(2000);
		  packagePage.clickcheckFreezableFilter();
		  delay(2000);
		  packagePage.clickFreezableDropdown();
		  delay(2000); 
		  packagePage.selectFreezableOptions();
		  packagePage.clickApplyFilter();
		  delay(2000);
		  
		  //Assert method for freezable Type
		  Assert.assertEquals(packagePage.verifyFreezableTypeGetText(),"Yes","Freezable Type is a mismatch!");
		  delay(2000);
		  
		  packagePage.clickClearFilter();
		  delay(2000);
		  packagePage.clickcheckFreezabledaysFilter();
		  packagePage.enterFreezableDayNo();
		  packagePage.clickApplyFilter();
		  delay(2000);
		  
		  //Assert method for freezable day No
		  Assert.assertEquals(packagename,packagePage.verifyPackageName(),"Package Name for mentioned freezable duration not found!");
		  delay(2000);
		  
		  packagePage.clickClearFilter();
		  delay(2000); 
		  packagePage.clickcheckPackageDuration();
		  packagePage.enterPackageDuration();
		  packagePage.clickApplyFilter();
		  delay(2000);
		  
		  //Assert package duration
		  Assert.assertEquals(packagename,packagePage.verifyPackageName(),"Package Name for mentioned package duration not found!");
		  delay(2000);
		  packagePage.clickClearFilter();
		  delay(2000);
		  packagePage.clickcloseFilter();
		  delay(2000);
		  
		  //Remember to remove static method for packages
		  packagePage.clickRnmPackageName();
		  delay(2000);
		  packagePage.clickDeactivate();
		  delay(2000);
		  packagePage.clickDeactivateOption();
		  delay(2000);
		  
		  //Assert Method for verifying the toast message
		  
		  dashBoardPage.clickPackageIcon();
		  delay(2000);
		  packagePage.clickInactivePackage();
		  delay(2000);
		  
		  //Verifying If the Inactive Package is present in the Inactive List
		  Assert.assertEquals(packageName,packagePage.verifyPackageName(),"Package in Inactive Status is not found!");
		  delay(2000);
		  
		  packagePage.clickRnmPackageName();
		  delay(2000);
		  packagePage.clickActivate();
		  delay(2000);
		  packagePage.clickDeactivateOption();
		  delay(2000);
		  
		  //Assert Method for verifying the toast message
		  dashBoardPage.clickPackageIcon();
		  delay(2000);
		  packagePage.clickActivePackage();
		  delay(2000);
		  
		  //Verifying If the Active Package is present in the Active List
		  Assert.assertEquals(packageName,packagePage.verifyPackageName(),"Package in Active Status is not found!");
		  delay(2000);
		  
		  //Edit Package
		  packagePage.clickRnmPackageName();
		  delay(2000);
		  packagePage.clickEdit();
		  delay(2000);
		  packagePage.enterMaxDiscount();
		  delay(2000);
		  packagePage.scrollPackagePopUp();
		  packagePage.clickCloseIcon();
		  packagePage.clickUpdateValidFrom();
		  packagePage.clickUpdateValidTo();
		  packagePage.clickUpdateFreezable();
		  packagePage.waitForFreezableToLoad();
		  packagePage.selectFreezable();
		  packagePage.scrollPackagePopUpSec2();
		  delay(2000);
		  packagePage.clickUpdateButton();
		  delay(3000);
		  
		  //Verifying whether the Package is Updated or not 
		  Assert.assertEquals(packagePage.verifyPackageUpdateGetText(), "Package Validity Updated Successfully!","Package Update toast is mismatch");
		  delay(3000);
		  
		  packagePage.clickDelete();
		  delay(2000);
		  packagePage.selectDeleteOption();
		  delay(3000); 
		}

	}