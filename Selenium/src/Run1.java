import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// Create Customer and verified customer in Actitime
public class Run1 {

	public static void main(String[] args) {
		String userName="admin";
		String password="manager";
		String customerName="Rajaxe";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1:90/login.do");
		//login
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		//create customer
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(customerName);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText(customerName)).click();
		//Verify customer
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String str=driver.findElement(By.xpath("//span[text()='"+customerName+"']")).getText();
		System.out.println(str);
		if(customerName.equals(str)){
			System.out.println("Customer created successfully and verified");
		}
		else{
			System.out.println("Test case failed");
		}
		

	}

}
