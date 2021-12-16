package com.ocm22.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebookTest {

	
	@Test 
	public void login(){
		System.out.println("Login Facebook");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		
	}
}
