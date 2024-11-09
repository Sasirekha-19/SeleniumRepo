package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseClass {
	
	

	@Then("Lead should be created")
	public void verifyfirstName() {
		String text = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.contains("Ha")) {
			System.out.println("Lead is created");
		}
		else {
			System.out.println("Lead is not created");
		}

	}
}
