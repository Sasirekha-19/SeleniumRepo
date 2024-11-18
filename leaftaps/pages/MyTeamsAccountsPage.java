package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.When;

public class MyTeamsAccountsPage extends ProjectSpecificMethods {

	@When("Click on the Create Account link")
	public CreateAccountPage Clickcreateaccount() {
		
		click(locateElement(Locators.LINK_TEXT, "Create Account"));
		reportStep("create account clicked successfully", "pass");
		return new CreateAccountPage();
	}
}
