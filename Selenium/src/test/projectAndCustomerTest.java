package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class projectAndCustomerTest {
	WebDriver driver=new FirefoxDriver();
	String userName="admin";
	String passWord="manager";
	String custName="Aan";
	@BeforeClass 
  public void ConfigbeforeClass() {
		
		driver.get("http://127.0.0.1:90/login.do;jsessionid=3750dwbt53npj");
	   }
  @BeforeMethod
  public void ConfigbeforeMethod() {
	  //login to App
	  driver.findElement(By.name("username")).sendKeys(userName);
	  driver.findElement(By.name("pwd")).sendKeys(passWord);
	  driver.findElement(By.id("loginButton")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	  driver.findElement(By.linkText("Projects & Customers")).click();
  }
  @Test
  public void createCustomerTest(){
	  driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	  driver.findElement(By.name("name")).sendKeys(custName);
	  driver.findElement(By.name("createCustomerSubmit")).click();
	    
  }
  @Test
  public void verifyCustomerTest(){
	  driver.findElement(By.linkText(custName)).click();
	 String Swb= driver.findElement(By.xpath("//span[text()='"+custName+"']")).getText();
	 System.out.println("Customer verfied successfully"+Swb);
	 
  }
  @AfterMethod
  public void logOutTest(){
	  driver.findElement(By.linkText("Logout")).click();
	  
	  
  }

  
  
}
