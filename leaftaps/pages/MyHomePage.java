package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethods{

	@When("Click on the Accounts link")
	public MyTeamsAccountsPage Clickaccounts() {
		click(locateElement(Locators.XPATH, "//a[text()='Accounts']"));
		reportStep("Accounts clicked successfully", "pass");
		return new MyTeamsAccountsPage();
	}
	
	
}
