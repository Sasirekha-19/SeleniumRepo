package homeassignment.week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParameterizationUsingTestNG {
	
    @Parameters({"url","username","password"})
	@Test
	public void staticparamerization(String url,String username,String password) throws InterruptedException {
		
		//To Disable browser notifications
		ChromeOptions obj = new ChromeOptions();
		
		obj.addArguments("--disable-notifications");
		
		//Launch the Browser
	    ChromeDriver driver = new ChromeDriver(obj);
		
	    //Load the url
		driver.get(url);
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login to salesforce
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("Login")).click();
		
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//Click View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		//Click Legal Entities from App Launcher
		WebElement scrolltoelement = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(scrolltoelement).perform();
		                         
		scrolltoelement.click();
		
		//Click on the Dropdown icon in the legal Entities tab 
		//driver.findElement(By.xpath("(//a[contains(@class,'slds-context-bar__label-action')]/following::a)[30]")).click();
		
		//Enter salesforce in search field
		//driver.findElement(By.xpath("//button[contains(@class,'slds-truncate')]")).sendKeys("salesforce");
		
		
		
	}
	
}
