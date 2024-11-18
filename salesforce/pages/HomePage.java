package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage  extends ProjectSpecificMethods{
	
	//public HomePage verifyTitlePage() throws InterruptedException {
		
		//Thread.sleep(2000);
		//verifyTitle("Home|Salesforce");
		//reportStep("Login is verified successfully", "pass");

		//return this;

	//}
	public HomePage clickOnAppLauncher() {

		click(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("App Launcher button clicked successfully", "pass");

		return this;
	}
	public AppLauncherPage clickOnViewAll() {

		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("View All linked successfully", "pass");

		return new AppLauncherPage();
		
	}
	
	
	

}
