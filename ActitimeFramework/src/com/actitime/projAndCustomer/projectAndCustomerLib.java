package com.actitime.projAndCustomer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.examples.BusinessPlan;
import org.testng.annotations.Test;

import com.actitime.GenericLib.Driver;
import com.actitime.GenericLib.ExcelLib;
import com.actitime.businessLib.BusinessLib;
import com.actitime.pageObjRepository.Login;

public class projectAndCustomerLib {
	
	@Test
	public void createCustomerTest() throws Exception{
		ExcelLib elib=new ExcelLib();
		String username=elib.getExcelData("Sheet1", 0, 0);
		String password=elib.getExcelData("Sheet1", 0, 1);
		Driver.driver.get("vicky:90/login.do");
		BusinessLib bLib=new BusinessLib();
		Login lg=new Login();
		bLib.loginAct(username, password, lg);
		
		
	}

}
