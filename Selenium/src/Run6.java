import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

// Working with chrome and IE driver Using WedDriver
public class Run6 {

	public static void main(String[] args) throws IOException {
		String fireBugPath="C://Users//vicky-pc//AppData//Roaming//Mozilla//Firefox//Profiles//3hm2j75w.default//extensions";
	    System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		
	}
}

