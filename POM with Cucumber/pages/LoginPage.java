package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	
	@When("Enter the username as {string}")
	public LoginPage EnterUsername(String username) {
		getDriver().findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	@When("Enter the password as {string}")
    public LoginPage EnterPassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
    	return this;
	}
    
	@When("Click on the login button")
    public WelcomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
    	return new WelcomePage();//indirectly creating object for WelcomePage class
   	}
}
