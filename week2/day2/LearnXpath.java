package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
	//launch empty browser
		
	ChromeDriver driver= new ChromeDriver();
	
    //Maximize the browser window
	
	driver.manage().window().maximize();
	
	//load the url
	
	driver.get("https://www.facebook.com");
	
	//locating webelments using basic xpath;
	
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
    
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321 ");
    
    driver.findElement(By.xpath("//button[contains(@name,'log')]")).click();
    
  //webDriver methods
  		//get title of the current web page
    
    String title = driver.getTitle();
    System.out.println(title);
    
    //or
    // driver.getTitle();
    // System.out.println(driver.getTitle());
    
    //verifying title from our side
    if(title.contains("Facebook"))
    {
    System.out.println("Title is Verified");
   }
    else
    {
    	System.out.println("Title is not verified");
    }
}
}