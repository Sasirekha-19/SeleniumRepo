package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC_001CreateAccountFunctionality extends ProjectSpecificMethods {


	@BeforeTest
	public void setValues() {
		testcaseName="CreateAccount";
		testDescription="Verfiy that the account is created";
		authors="Rekha";
		category="Regression";
		excelFileName="CreateAccount";
		
	}
	@Test(dataProvider="fetchData")
	public void runcreateaccount(String username, String password,String accountname,String description) {
		
		LoginPage lc = new LoginPage();
		lc.Enterusername(username)
		.Enterpassword(password)
		.Clickloginbutton()
		.Verifylogin()
		.Clickcrmsfa()
		.Clickaccounts()
		.Clickcreateaccount()
		.Enteraccountname(accountname)
		.Enterdescription(description)
		.selectindustry()
		.selectownership()
		.selectsource()
		.selectmarketingcampaign()
		.selectstate()
		.Clickcreateaccoutbutton()
		.Verifyaccountname();
	}
	
}
