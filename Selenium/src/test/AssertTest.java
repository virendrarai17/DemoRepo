package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class AssertTest {
	 WebDriver driver=new FirefoxDriver();
  
  @BeforeMethod
  public void beforeConfigMethod() {
	 
	  driver.get("http://google.com");
  }
  @Test
  public void Login() {
	WebElement wb=  driver.findElement(By.xpath("//input[@value='Google Search']"));
	String strn=wb.getAttribute("value");
	System.out.println(strn);
	//Assert.assertEquals(strn, "Google Search");
	Assert.assertEquals(strn, "Google Searc", "String not matches test failed");
	  
  }

}
