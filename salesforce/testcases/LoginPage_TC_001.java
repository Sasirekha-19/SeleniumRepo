package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class LoginPage_TC_001  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		testcaseName="Login Functionality of Salesforce Application";
		testDescription="Login with valid data";
		authors="Vinith";
		category="Smoke";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void login(String uName,String passWord)  {
		
		LoginPage lp=new LoginPage();
		lp.enterUserName(uName)
		.enterPassword(passWord)
		.clickOnLogin();
	}

}
