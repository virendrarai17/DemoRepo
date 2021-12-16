import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.findElement(By.partialLinkText("in")).click();
}
}
