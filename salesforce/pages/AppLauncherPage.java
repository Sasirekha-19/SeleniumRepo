package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods {

	public SellerHomePage ClickSales() {
		
		click(locateElement(Locators.XPATH, "//p[text()='Sales']/ancestor::a"));
		reportStep("Sales link is clicked", "pass");
		return new SellerHomePage();
	}

}
