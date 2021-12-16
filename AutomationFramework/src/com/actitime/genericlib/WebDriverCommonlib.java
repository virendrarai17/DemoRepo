package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonlib {
	
	public void waitForPageToLoad(){
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void select(WebElement selWb, String value){
		Select sel=new Select(selWb);
		sel.selectByVisibleText(value);
	}
	public void select(WebElement selWb, int index){
		Select sel=new Select(selWb);
		sel.selectByIndex(index);
	}
	public void acceptAlert(){
		Alert alt=Driver.driver.switchTo().alert();
		alt.accept();
	}
	public void cancelAlert(){
	Alert alt=Driver.driver.switchTo().alert();
	alt.dismiss();
	}
	public void waitForElementPresent(String wb){
		WebDriverWait wait=new WebDriverWait(Driver.driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wb)));
	}
}
