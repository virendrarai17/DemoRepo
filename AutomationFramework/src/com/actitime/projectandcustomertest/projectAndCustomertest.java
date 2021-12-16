package com.actitime.projectandcustomertest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.genericlib.Constants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.ExcelLib;
import com.actitime.genericlib.WebDriverCommonlib;
import com.actitime.pageobjectrepolib.ActiveProjectAndCustomer;
import com.actitime.pageobjectrepolib.CreateNewCustomer;
import com.actitime.pageobjectrepolib.EditCustomer;
import com.actitime.pageobjectrepolib.EnterTimeTrack;
import com.actitime.pageobjectrepolib.Login;
import com.actitime.pageobjectrepolib.OpenTask;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class projectAndCustomertest {
	//Object Declaration
	WebDriver driver;
	ExcelLib elib;
	WebDriverCommonlib wLib;
	Login loginPage;
	EnterTimeTrack timeTrackPage;
	OpenTask openTask;
	ActiveProjectAndCustomer activeProjectCustomerPage;
	CreateNewCustomer createCustomerPage;
	EditCustomer edidCustomerpage;
	
	//Object initialization
	@BeforeClass
	public void configBeforeClassMtd(){
		driver= Driver.getDriver();
		elib= new ExcelLib();
		loginPage= PageFactory.initElements(Driver.driver, Login.class);
		timeTrackPage = PageFactory.initElements(Driver.driver,EnterTimeTrack.class);
		openTask= PageFactory.initElements(Driver.driver, OpenTask.class);
		activeProjectCustomerPage= PageFactory.initElements(Driver.driver, ActiveProjectAndCustomer.class);
		createCustomerPage= PageFactory.initElements(Driver.driver, CreateNewCustomer.class);
		wLib= PageFactory.initElements(Driver.driver, WebDriverCommonlib.class);	
		edidCustomerpage=PageFactory.initElements(Driver.driver, EditCustomer.class);
	}
	@BeforeMethod
	public void configBeforeMtd(){
		loginPage.login(Constants.userName,Constants.passWord);
		
	}
	
	@Test
	public void createCustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
		// Get the data from workBook
		String customerName=elib.getExcelData("Sheet1", 0, 0);
		//Navigate to TaskPage
		timeTrackPage.navigateToTaskPage();
		// Navigate to project and customerLink
		openTask.navigatedToProjectAndCustomerPage();
		// Navigate to createCustomer page
		activeProjectCustomerPage.navigateToCreateNewCustomerpage();
		// Customer creating
		createCustomerPage.createCustomer(customerName);
		//verify customer
		
		
		
		
		
		
		//WebElement wb=activeProjectCustomerPage.getCustomerSelect();
		//wLib.select(wb, customerName);
		//activeProjectCustomerPage.getShowBtn().click();
		//wLib.waitForPageToLoad();
		//driver.findElement(By.linkText(customerName)).click();
		//Navigate to edit customer info page and delete the customer
		//edidCustomerpage.deleteCustomerBtn().click();
		//edidCustomerpage.confirmDeleteCustomer().click();
		//activeProjectCustomerPage.verifyCustomerDelete();
		
		
	}
	
	

}
