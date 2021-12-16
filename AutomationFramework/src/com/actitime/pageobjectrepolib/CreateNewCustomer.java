package com.actitime.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommonlib;

public class CreateNewCustomer extends WebDriverCommonlib {
	
	@FindBy(name="name")
	private WebElement customerNameEdt;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement submitButton;
	
	public void createCustomer(String customerName){
		customerNameEdt.sendKeys(customerName);
		submitButton.click();
	}

}
