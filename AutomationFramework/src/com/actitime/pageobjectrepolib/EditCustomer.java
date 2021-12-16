package com.actitime.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomer {
	
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement deleteCustomerBtn;
	
	public WebElement deleteCustomerBtn(){
		return deleteCustomerBtn;
	}
	
	@FindBy(id="deleteButton")
	private WebElement confirmDeleteCustomer;
	
	public WebElement confirmDeleteCustomer(){
		return confirmDeleteCustomer;
	}
}
