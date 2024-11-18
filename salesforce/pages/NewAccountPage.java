package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewAccountPage extends ProjectSpecificMethods {

	public NewAccountPage Enteraccountname(String accountname) {
		
		type(locateElement(Locators.XPATH, "//label[text()='Account Name']/following::input"), accountname);
		reportStep("account name entered successfully","pass");
		return this;
		
	}
	
	public NewAccountPage selectownership() {
		
		click(locateElement(Locators.XPATH, "//button[@aria-label='Ownership']"));
		click(locateElement(Locators.XPATH, "//span[text()='Public']"));
		reportStep("Selected ownership as public successfully", "pass");
		return this;
	}
	
	public AccountPage clicksavebutton() {
		
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
		reportStep("save button clicked successfully", "pass");
		return new AccountPage();
	}
	
}
