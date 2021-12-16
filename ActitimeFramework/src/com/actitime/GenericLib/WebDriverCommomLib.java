package com.actitime.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class WebDriverCommomLib {
	
	public void waitForPageLoad(){
	Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public boolean verifyText(String wbXpath, String expText){
		boolean flag= false;
		String actText=Driver.driver.findElement(By.xpath(wbXpath)).getText();
		if(expText.equals(actText)){
			flag=true;
			System.out.println(expText+" is verified" );
		}else{
			System.out.println("Not verified");
		}return flag;
		
	}

}
