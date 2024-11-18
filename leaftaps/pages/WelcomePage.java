package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethods{

	@Then("It should navigate to the next page")
	public WelcomePage Verifylogin() {
		
		verifyExactText(locateElement(Locators.XPATH,"//h2[text()='Welcome ']"), "Welcome ");
		reportStep("Login is verified","pass");
		return this;
		//String text = getElementText(locateElement(Locators.XPATH,"//h2[text()='Welcome ']"));
		//if(text.contains(text)) {
			//System.out.println("Login is verified");
		//}
		//else {
			//System.out.println("Login is not verified");
		//}
	}
	
	@Then("It should throw the error message")
	public void it_should_throw_the_error_message() {
		
		verifyDisplayed(locateElement(Locators.XPATH, "V//p[text()='The Following Errors Occurred:']"));
		reportStep("The error mssage as displayed", "pass");
		 
	}
	
	@When("Click on the CRM/SFA link")
	public MyHomePage Clickcrmsfa() {
	
		click(locateElement(Locators.LINK_TEXT,"CRM/SFA"));
		reportStep("crmsfa link clicked successfully", "pass");
		return new MyHomePage();
	}
}
