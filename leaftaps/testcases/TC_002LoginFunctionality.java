package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC_002LoginFunctionality extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName="VerifyLogin";
		testDescription="VerfiyLogin functionality with positive data";
		authors="Sasi";
		category="smoke";
		excelFileName="Login";
		
	}
	@Test(dataProvider="fetchData")
	public void runlogin(String username,String password ) {
		LoginPage lc = new LoginPage();
		lc.Enterusername(username)
		.Enterpassword(password)
		.Clickloginbutton()
		.Verifylogin();
		
	
	}
	
}

