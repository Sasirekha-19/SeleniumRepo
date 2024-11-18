package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AccountsPage extends ProjectSpecificMethods {

	public NewAccountPage ClickNewbutton() {
		
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='New']"));
		reportStep("new button clicked successfully", "pass");
		return new NewAccountPage();
	}
	
	public AccountsPage Searchusingaccountname(String aName) {
		
		typeAndEnter(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...']"), aName);
		reportStep("Results has shown based on the searched account name","pass");
		return this;
	}
	
	public EditPage SelectEditinFirstResultingDropdown() {
		
		click(locateElement(Locators.XPATH, "//a[contains(@class,'rowActionsPlaceHolder')]"));
		click(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		reportStep("Edit selected in the first dropdown successfully","pass");
		return new EditPage();
		
	}
	
}
