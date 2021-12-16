import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class OrangeHRPractice {
	
	public static void main(String[] args) {
		String userName="Admin";
		String passWord="admin";
	WebDriver driver=new FirefoxDriver();
	driver.get("http://enterprise.demo.orangehrmlive.com");
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
    driver.findElement(By.id("txtPassword")).sendKeys(passWord);
    driver.findElement(By.id("btnLogin")).click(); 
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.id("menu_admin_UserManagement")).click();
    Actions act=new Actions(driver);
    WebElement wb=driver.findElement(By.linkText("Users"));
    act.moveToElement(wb).perform();
    driver.findElement(By.id("btnAdd")).click();
		

	}

}
