package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditPage extends ProjectSpecificMethods {

	String phno;
	
	public EditPage SelectType() {
		
		click(locateElement(Locators.XPATH, "//button[@aria-label='Type']"));
		click(locateElement(Locators.XPATH, "//lightning-base-combobox-item[@data-value='Technology Partner']"));
		reportStep("Selected Type as Technology Partner successfully", "pass");
		return this;
	}
	
    public EditPage SelectIndustry() {
		
		click(locateElement(Locators.XPATH, "//button[@aria-label='Industry']"));
		click(locateElement(Locators.XPATH, "//lightning-base-combobox-item[@data-value='Healthcare']"));
		reportStep("Selected Industry as Healthcare successfully", "pass");
		return this;
	}
    
    public EditPage Enterbillingstreet(String billingstreet) {
    	
    	clearAndType(locateElement(Locators.XPATH, "//label[text()='Billing Street']/following::textarea"), billingstreet);
    	reportStep("Billing street entered successfully", "pass");
    	return this;
    }
    
    public EditPage Entershippingstreet(String shippingstreet) {
    	
    	clearAndType(locateElement(Locators.XPATH, "//label[text()='Shipping Street']/following::textarea"), shippingstreet);
    	reportStep("shipping street entered successfully", "pass");
    	return this;
    }
    
     public EditPage SelectCustomerPriority() {
		
		click(locateElement(Locators.XPATH, "//button[@aria-label='Customer Priority']"));
		click(locateElement(Locators.XPATH, "//lightning-base-combobox-item[@data-value='Low']"));
		reportStep("Selected Low as a Customer Priority", "pass");
		return this;
	}
    
     public EditPage SelectSLA() {
 		
 		click(locateElement(Locators.XPATH, "//button[@aria-label='SLA']"));
 		click(locateElement(Locators.XPATH, "//lightning-base-combobox-item[@data-value='Silver']"));
 		reportStep("Selected Silver as a SLA", "pass");
 		return this;
 	}
     
     public EditPage SelectActive() {
  		
  		click(locateElement(Locators.XPATH, "//button[@aria-label='Active']"));
  		click(locateElement(Locators.XPATH, "//lightning-base-combobox-item[@data-value='No']"));
  		reportStep("Selected No as Active", "pass");
  		return this;
  	}
    
     public EditPage Enterphoneno() {
    	 
    	 int randomNum1 = (int)(Math.random()*999999);
         int randomNum2 = (int)(Math.random()*999999);
         phno = ""+randomNum1+randomNum2;
         phno = phno.substring(0,10);
         clearAndType(locateElement(Locators.XPATH, "//input[@name='Phone']"), phno);
         reportStep("Phone number entered successfully","pass");
         return this;
     }
     
     public AccountsPage SelectUpsellOpportunity() {
   		
   		click(locateElement(Locators.XPATH, "//button[@aria-label='Upsell Opportunity']"));
   		click(locateElement(Locators.XPATH, "//lightning-base-combobox-item[@data-value='No']"));
   		reportStep("Selected No as Upsell Opportunity", "pass");
   		return new AccountsPage();
   	}
     
    public void Verifyphoneno() {
    	
    	verifyExactText(locateElement(Locators.XPATH, "//table/tbody/tr[1]/td[4]"),phno);
    	reportStep("phone number verified successfully", "pass");
    }
    
    
    
}
