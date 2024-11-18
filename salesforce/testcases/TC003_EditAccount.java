package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC003_EditAccount extends ProjectSpecificMethods {

	@BeforeTest
	public void setVlaues() {
		testcaseName="Edit Account";
		testDescription="Verify whether the exisiting account is edited or not";
		authors="Rekha";
		category="Regression";
		excelFileName="EditAccount";
	}
	
	@Test(dataProvider = "fetchData")
	public void runeditaccount(String uName, String pass, String aName, String billingstreet, String shippingstreet) 
	{
		LoginPage lc = new LoginPage();
		lc.enterUserName(uName)
		.enterPassword(pass)
		.clickOnLogin()
		.clickOnAppLauncher()
		.clickOnViewAll()
		.ClickSales()
		.ClickAccounts()
		.Searchusingaccountname(aName)
		.SelectEditinFirstResultingDropdown()
		.SelectType()
		.SelectIndustry()
		.Enterbillingstreet(billingstreet)
		.Entershippingstreet(shippingstreet)
		.SelectCustomerPriority()
		.SelectSLA()
		.SelectActive()
		.Enterphoneno()
		.Verifyphoneno();
		
	}
}
