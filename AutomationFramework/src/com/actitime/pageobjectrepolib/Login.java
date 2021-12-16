package com.actitime.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.Constants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.WebDriverCommonlib;

public class Login extends WebDriverCommonlib {
	
	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="pwd")
	private WebElement passWordEdt;
	

	@FindBy(id="loginButton")
	private WebElement lgButton;
	
	public void login(String userName, String passWord){
		Driver.driver.get(Constants.Url);
		userNameEdt.sendKeys(userName);
		passWordEdt.sendKeys(passWord);
		lgButton.click();
		waitForPageToLoad();
		
		
		
	}
}