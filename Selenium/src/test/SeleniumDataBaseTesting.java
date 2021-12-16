package test;

import java.sql.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SeleniumDataBaseTesting {
	private Connection connection;
	
  @Test
  public void f() {
	  System.out.println("connecting");
  }
  @BeforeClass
  public void setUP() {
	  String dataBaseURL="jdbc:oracle:127.0.0.1:8080//apex/";
	  String userName="system";
	  String passWord="manager";
	  connection=null;
	  try{
		  Class.forName("oracle.jdbc.driver.oracleDriver");
		  System.out.println("connecting database");
		  Connection con=DriverManager.getConnection(dataBaseURL, userName, passWord);
		  if(connection !=null){
			  System.out.println("Connecting DB");
		  }}catch (SQLException ex) {
			ex.printStackTrace();
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
			
		  }
			  
	  }
  

  @AfterClass
  public void afterClass() {
  }

}
