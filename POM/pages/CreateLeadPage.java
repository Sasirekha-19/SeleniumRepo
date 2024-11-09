package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage EntercName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
}

	public CreateLeadPage EnterfName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
}
 
    public CreateLeadPage EnterlName() {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
    	return this;
}
    
    public ViewLeadPage clickCreateLeadButton() {
    	driver.findElement(By.name("submitButton")).click();
    	return new ViewLeadPage(driver);
    }
		
}


	