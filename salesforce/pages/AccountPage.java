package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AccountPage extends ProjectSpecificMethods {

	public void verifyaccountname() {
		
		verifyPartialText(locateElement(Locators.XPATH, "//span[@class='toastMessage slds-text-heading--small forceActionsText']"), "Test");
	    reportStep("account name is verified successfully", "pass");
	}
	
}
