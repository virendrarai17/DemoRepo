import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
// Window handles in IRCTC Website using getWindow method
public class Run3 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.co.in/");
		// Mouse over operation
		WebElement wb=driver.findElement(By.linkText("Hotels"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.linkText("Hotels & Lounge")).click();
		//Window Handling
		Set<String> set=driver.getWindowHandles();
		Iterator <String> it=set.iterator();
		String parentWinow=it.next();
		String childWindow=it.next();
		//Move to child Window and perform
		driver.switchTo().window(childWindow);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> set2=driver.getWindowHandles();
		Iterator<String> it2=set2.iterator();
		String firstWin=it2.next();
		String secondWin=it2.next();
		String thirdWin=it2.next();
		driver.switchTo().window(thirdWin);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("origin")).sendKeys("Bangalore");
		driver.close();
		driver.quit();
			}
}
