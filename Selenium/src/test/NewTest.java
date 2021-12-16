package test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.log4testng.Logger;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  Reporter.log("n="+n+" s="+s);
  
  }
  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
}
