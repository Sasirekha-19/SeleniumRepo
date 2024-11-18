package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {

	@When("Enter the username as {string}")
	public LoginPage Enterusername(String username) {
		
		clearAndType((locateElement("username")), username);
		reportStep(username+ "Username entered successfully", "pass");	
		return this;
	}

	@And("Enter the password as {string}")
	public LoginPage Enterpassword(String password) {
		clearAndType(locateElement(Locators.XPATH,"//input[@id='password']"), password);
		reportStep(password+ "password entered successfully", "pass");
		return this;

	}
	
	@And("Click on the login button")
	public WelcomePage Clickloginbutton() {
		click(locateElement(Locators.CLASS_NAME,"decorativeSubmit"));
		reportStep("Login button clicked successfully", "pass");
		return new WelcomePage();

	}
}
