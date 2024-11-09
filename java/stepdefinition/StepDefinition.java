package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@When("Enter the username as {string}")
	public void enter_the_username_as_demo_csr(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@When("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	    
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("It should navigated to the next page")
	public void it_should_navigated_to_the_next_page() {
	    
		String valid = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if (valid.contains("Welcome")) {
			System.out.println("It was navigated to the next page");
		}
		else {
			System.out.println("Not Navigated");
		}

	}
	
	@Then("It should throw the error message")
	public void it_should_throw_the_error_message() {
		System.out.println("It should throw the error message");
	}
	

	
}
