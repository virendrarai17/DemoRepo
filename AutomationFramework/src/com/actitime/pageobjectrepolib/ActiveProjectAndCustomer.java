package com.actitime.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommonlib;

public class ActiveProjectAndCustomer extends WebDriverCommonlib{
	
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	
	@FindBy(xpath="//select[@name='selectedCustomer']")
	private WebElement selectCustlist;
	
	@FindBy(xpath="//input[contains(@value,'Show')]")
	private WebElement showBtn;
	
	//@FindBy(xpath="Customer has been successfully deleted")
	//private WebElement verifyCustomerDelete;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement verifyCustomerCreated;
	
	
	
	public WebElement getcreateCustomerBtn(){
		return createNewCustomerButton;
	}
	
	public WebElement getCustomerSelect(){
		return selectCustlist;
	}
	public WebElement getShowBtn(){
		return showBtn;
	}
	public void navigateToCreateNewCustomerpage(){
		createNewCustomerButton.click();	
	}
	
	//public WebElement verifyCustomerDelete(){
		//return verifyCustomerDelete;}
	public WebElement getverifyCustomerCreated(){
		return verifyCustomerCreated;
	}
	
}
