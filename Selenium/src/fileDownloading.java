import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class fileDownloading {

	public static void main(String[] args) {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.folderlist", 0);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		profile.setPreference("browser.download.lastDir", "C:\\Users\\vicky-pc\\Desktop");
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[@href='http://selenium-release.storage.googleapis.com/3.0-beta3/selenium-dotnet-3.0.0-beta3.zip']")).click();
		System.out.println("File downloaded");

	}

}
