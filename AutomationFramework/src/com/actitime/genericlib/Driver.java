package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public static WebDriver driver;
	
	public static WebDriver getDriver(){
		driver= new FirefoxDriver();
		return driver;
		
	}
	

}
