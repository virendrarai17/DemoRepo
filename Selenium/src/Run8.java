import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.log4testng.Logger;

// ScreenShot captured using EventFiringWebDriver 
public class Run8 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1:90/login.do;jsessionid=aiawdbh6br9u");
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
	File srcFile=edriver.getScreenshotAs(OutputType.FILE);
	File dstFile= new File("C:\\Users\\vicky-pc\\workspaceLuna\\Selenium\\src\\screenShot\\actiScreen.png");
	FileUtils.copyFile(srcFile, dstFile);
	
	System.out.println("Screen shot captured");

	}
	
	

}
