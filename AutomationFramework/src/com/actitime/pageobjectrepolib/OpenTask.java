package com.actitime.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommonlib;

public class OpenTask extends WebDriverCommonlib{
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustomerLink;
	
	
	public void navigatedToProjectAndCustomerPage(){
		projectAndCustomerLink.click();
		waitForPageToLoad();
		
		
	}
	
	
}
