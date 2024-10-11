package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	
    driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
    
    driver.findElement(By.id("pass")).sendKeys("Tuna@32");
    
    WebElement login = driver.findElement(By.name("login"));
    login.click();
    
    Thread.sleep(5000);
    
    driver.close();
    
	}
}
    
    
    
    
    
    
    
    
	
	
	
	

