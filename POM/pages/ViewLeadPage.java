package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public void verifyfirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.contains("Ha")) {
			System.out.println("Lead is created");
		}
		else {
			System.out.println("Lead is not created");
		}

	}
}
