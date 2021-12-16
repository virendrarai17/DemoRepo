import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// Capture all the links from UI using by.tagName
public class Run5 {

	public static void main(String[] args) {
		String userName="admin";
		String password="manager";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.id("gs_htif0")).sendKeys("sachin Tendulakar");
		driver.findElement(By.name("btnG")).click();
		
		List <WebElement> lst=driver.findElements(By.tagName("a"));
		System.out.println(lst.size());
		System.out.println(lst);
		

	}

}
