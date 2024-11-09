package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {
	
	
	@When("Enter the companyname as (.*)$")
	public CreateLeadPage EntercName(String cName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
}

	@When("Enter the firstname as (.*)$")
	public CreateLeadPage EnterfName(String fName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
}
 
	@When("Enter the lastname as (.*)$")
    public CreateLeadPage EnterlName(String lName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
    	return this;
}
	@When("Click on the CreateLeadButton")
    public ViewLeadPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
    	return new ViewLeadPage();
    }
		
}


	