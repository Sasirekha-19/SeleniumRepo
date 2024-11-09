package homeassignment.week5.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ProjectSpecificMethod {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions obj = new ChromeOptions();
	
	obj.addArguments("--disable-notifications");
	
    ChromeDriver driver = new ChromeDriver(obj);
	
	driver.get("https://login.salesforce.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	
	driver.findElement(By.id("password")).sendKeys("leaf@2024");
	
	driver.findElement(By.id("Login")).click();
	
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	
	WebElement scrolltoelement = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	
	//driver.executeScript("arguments[0].click();",scrolltoelement);
	
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	
	act.scrollToElement(scrolltoelement).perform();
	                         
	scrolltoelement.click();
	
	//driver.findElement(By.xpath("(//a[contains(@class,'slds-button_reset')])[14]")).click();
	
	//driver.findElement(By.xpath("(//div[contains(@class,'slds-context-bar__label-action')]//a)[14]")).click();
	
	//driver.findElement(By.xpath("(//one-app-nav-bar-menu-button[contains(@class,'slds-dropdown-trigger_click')])[14]")).click();
	
	//driver.findElement(By.xpath("(//a[contains(@class,'slds-context-bar__label-action')]/following::a)[30]")).click();
	//driver.findElement(By.xpath("//a[@title='Legal Entities']/following::a[1]")).click();
	//driver.findElement(By.xpath("//span[text()='Legal Entities']//following::a[@class='slds-button slds-button_reset']//span[@part='boundary']")).click();
	//Thread.sleep(2000);
	
	
	
	
	}
	
	
}
