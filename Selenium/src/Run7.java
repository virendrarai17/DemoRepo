import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

//Enable fireBug while launch the Firefox browser using Firefox profile
public class Run7 {

	public static void main(String[] args) throws IOException {
		String fireBugPath="C://Users//vicky-pc//Downloads//firebug-2.0.12-fx.xpi";
		FirefoxProfile profile=new FirefoxProfile();
		profile.addExtension(new File(fireBugPath));
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("https://gmail.com");
		
	}

}
