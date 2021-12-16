package com.actitime.businessLib;

import com.actitime.GenericLib.Driver;
import com.actitime.pageObjRepository.Login;

public class BusinessLib {
	
	public void loginAct(String userName,String password,Login lg){
		lg.getuserNameEdt().sendKeys(userName);
		lg.getpasswordEdt().sendKeys(password);
		
		
	}
	
	

}

	
		
