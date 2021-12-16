package com.actitime.pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverCommonlib;

public class EnterTimeTrack extends WebDriverCommonlib {
	//Navigate to task page
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement TaskImg;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reportImg;
	
	
	public void navigateToTaskPage(){
		TaskImg.click();
		waitForPageToLoad();
	}

}
