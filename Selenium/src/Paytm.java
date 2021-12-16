import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Paytm {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		//Alert alt=driver.switchTo().alert();
		//alt.dismiss();
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//WebElement cross=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='close-icon close']")));
		//cross.click();
		WebElement wb=driver.findElement(By.xpath("//div[@class='top-menu unit']//following-sibling::ul/li[2]/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Fastrack")).click();
		driver.findElement(By.className("fit-width")).click();
		driver.findElement(By.name("pincode")).sendKeys("560017");

	}

}
