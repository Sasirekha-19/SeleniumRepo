package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods{
	
	public HomePage verifyTitlePage(String title) {
		// TODO Auto-generated method stub
		title="Home|Salesforce";
		verifyTitle(title);

		return this;

	}
	public HomePage clickOnAppLauncher() {

		click(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("Title page is verified", "pass");

		return this;
	}
	public HomePage clickOnViewAll() {

		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("Title page is verified", "pass");

		return this;
		
	}
	
	
	

}
