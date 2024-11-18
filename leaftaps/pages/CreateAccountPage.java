package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.When;

public class CreateAccountPage extends ProjectSpecificMethods {

	@When("Enter the Account Name as (.*)$")
	public CreateAccountPage Enteraccountname(String accountname) {
		clearAndType(locateElement("accountName"), accountname);
		reportStep("Account name entered successfully", "pass");
		return this;
	}
	
	@When("Enter the Description as (.*)$")
	public CreateAccountPage Enterdescription(String description) {
		clearAndType(locateElement(Locators.NAME, "description"), description);
		reportStep("Description entered successfully", "pass");
		return this;
	}
	
	@When("Select Computer Software as a Industry")
	public CreateAccountPage selectindustry() {
		selectDropDownUsingText(locateElement(Locators.NAME, "industryEnumId"), "Computer Software");
		reportStep("Selected Computer Software as a industry successfully", "pass");
		return this;
	}
	
	@When("Select S-Corporation as a Ownership")
	public CreateAccountPage selectownership() {
		selectDropDownUsingText(locateElement(Locators.NAME, "ownershipEnumId"), "S-Corporation");
		reportStep("Selected S-Corporation as a ownership successfully", "pass");
		return this;
	}
	
	@When("Select Employee as a Source")
	public CreateAccountPage selectsource() {
		selectDropDownUsingValue(locateElement("dataSourceId"), "LEAD_EMPLOYEE");
		reportStep("Selected Employee as a source successfully", "pass");
		return this;
	}
	
	@When("Select eCommerce Site Internal Campaign as a Marketing Campaign")
	public CreateAccountPage selectmarketingcampaign() {
		selectDropDownUsingIndex(locateElement("marketingCampaignId"), 6);
		reportStep("Selected eCommerce Site Internal Campaign as a marketingcampaign successfully", "pass");
		return this;
	}
	
	@When("Select Texas as a State")
	public CreateAccountPage selectstate() {
		selectDropDownUsingValue(locateElement("generalStateProvinceGeoId"), "TX");
		reportStep("Selected Texas as a state successfully", "pass");
		return this;
	}
	
	@When("Click on the create account button")
	public AccountDetailsPage Clickcreateaccoutbutton() {
		click(locateElement(Locators.CLASS_NAME, "smallSubmit"));
		reportStep("create account button clicked successfully", "pass");
		return new AccountDetailsPage();
	}
	
	
}
