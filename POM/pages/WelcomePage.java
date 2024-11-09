package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {

	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
    public WelcomePage verifyLogin() {
    	
		String text = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if(text.contains("Wel")) {
			System.out.println("Login is Verified");
		}
		else {
			System.out.println("Login is not verified");
		}
		return this;
	}
	
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
