package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateAccount extends ProjectSpecificMethods{

	@BeforeTest
	public void setVlaues() {
		testcaseName="Create Account";
		testDescription="Verify that the account is created";
		authors="Sasi";
		category="Sanity";
		excelFileName="CreateAccount";
	}
	
	@Test(dataProvider = "fetchData")
	public void runcreateaccount(String uName,String pass,String accountname) {
		
		LoginPage lo = new LoginPage();
		lo.enterUserName(uName)
		.enterPassword(pass)
		.clickOnLogin()
		.clickOnAppLauncher()
		.clickOnViewAll()
		.ClickSales()
		.ClickAccounts()
		.ClickNewbutton()
		.Enteraccountname(accountname)
		.selectownership()
		.clicksavebutton()
		.verifyaccountname();
		
		
	}
}
