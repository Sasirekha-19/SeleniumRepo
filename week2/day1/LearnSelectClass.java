package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {
 public static void main(String[] args) throws InterruptedException {
	
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.get("http://leaftaps.com/opentaps/");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 
	 WebElement element = driver.findElement(By.className("decorativeSubmit"));
	 element.click();
	 
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 
	 driver.findElement(By.partialLinkText("Leads")).click();
	 
	 driver.findElement(By.partialLinkText("Create")).click();
	 
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasirekha");
	 
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
	 
	 WebElement element2 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 element2.click();
	 
	 Select dd = new Select(element2);
	 
	 dd.selectByIndex(4);
	 
	 WebElement element3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 element3.click();
	 
	 Select dd1 = new Select(element3);
	 
	 dd1.selectByVisibleText("Automobile");
	 
	 WebElement element4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 element4.click();
	 
	 Select dd2 = new Select(element4);
	 
	 dd2.selectByValue("OWN_CCORP");
	 
	 driver.findElement(By.name("submitButton")).click();
	 
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 
	if(title.contains("opentaps CRM"))
		 
	 {
	 System.out.println("Title is Verified");
	 }
	else
	{
		System.out.println("Title is not Verified");
			
		}
	Thread.sleep(5000);
	driver.close();
	 
}
}
