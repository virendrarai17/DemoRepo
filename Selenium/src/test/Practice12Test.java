package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class Practice12Test {
  @Test
  public void screenShot() throws IOException {
    
    Reporter.log("Screenshot captured");
    Reporter.log("screenshot", true);
    
    
    
  }
  

}
