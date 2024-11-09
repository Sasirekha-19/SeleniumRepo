package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {

	
	@Then("It should navigate to the next page")
    public WelcomePage verifyLogin() {
    	
		String text = getDriver().findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if(text.contains("Wel")) {
			System.out.println("Login is Verified");
		}
		else {
			System.out.println("Login is not verified");
		}
		return this;
	}
	
	@When("Click on the Crmsfa link")
	public MyHomePage clickCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
