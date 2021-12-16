import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Capture all the links from UI or Edit box
public class Run4 {

	public static void main(String[] args) {
		//Login
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1:90/login.do;jsessionid=643a1ds6i46c7");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Capture all the links from UI
		List <WebElement> lst=driver.findElements(By.tagName("a"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(lst.size());
		for(int i=0; i<lst.size();i++){
			System.out.println(lst.get(i).getText());
		}

	}

}
