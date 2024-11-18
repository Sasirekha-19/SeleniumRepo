package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SellerHomePage extends ProjectSpecificMethods {

	public AccountsPage ClickAccounts() {
		
		click(Locators.XPATH, "//a[@title='Accounts']");
		reportStep("accounts tab clicked successfully", "pass");
		return new AccountsPage();
	}
}
