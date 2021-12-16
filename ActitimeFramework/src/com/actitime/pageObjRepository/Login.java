package com.actitime.pageObjRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(name="username")
	private WebElement userNameEdt;
 
	public WebElement getuserNameEdt(){
		return userNameEdt;
	}
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	public WebElement getpasswordEdt(){ 
		return passwordEdt;
	}
	
	public void login(){
		
		
	}
	 
	

}
