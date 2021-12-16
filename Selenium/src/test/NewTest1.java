package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest1 {
  @Test(groups={"smokeTest"})
  public void f() {
	  System.out.println("Test case Run");
	  
  }
  @BeforeMethod(groups="smokeTest")
  public void beforeMethod() {
	  System.out.println("Before test case run beforemethod excution");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after test case run aftermethod excute");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before test case run or method run first beforeClass run");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("at the end after class");
  }

}
