package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;


public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public LoginPage EnterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		return this;
	}
	
    public LoginPage EnterPassword() {
    	driver.findElement(By.id("password")).sendKeys("crmsfa");
    	return this;
	}
    
    public WelcomePage clickLoginButton() {
    	driver.findElement(By.className("decorativeSubmit")).click();
    	return new WelcomePage(driver);//indirectly creating object for WelcomePage class
   	}
}
