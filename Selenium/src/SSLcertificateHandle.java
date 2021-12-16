import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class SSLcertificateHandle {
	// Secure Socket layer certificate handle
	public static void main(String[] args) {
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("https://cacert.org/");
		
		

	}

}
