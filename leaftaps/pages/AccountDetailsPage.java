package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;

public class AccountDetailsPage extends ProjectSpecificMethods {

	@Then("Account should be created in the given name")
	public void Verifyaccountname() {
		verifyPartialText(locateElement(Locators.XPATH, "//span[text()='Account Name']/following::span"), "t12");
		reportStep("Account name verified successfully", "pass");
}
}