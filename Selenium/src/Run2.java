 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Capture the backend attribute from UI
public class Run2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String expectedText="Enter your email";
		driver.get("http://www.gmail.com");
		String actualText=driver.findElement(By.name("Email")).getAttribute("placeholder");
		if(expectedText.equals(actualText)){
			System.out.println("Test case pass");
			}
		else{
			System.out.println("Testcase failed");
		}
		
	}

}
