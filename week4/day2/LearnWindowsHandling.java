package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowsHandling {

	public static void main(String[] args) {
		
		ChromeOptions obj=new ChromeOptions();
		
		obj.addArguments("--disable-notifications");
		
        ChromeDriver driver = new ChromeDriver(obj);
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[contains(@class,'circleone')]")).click();

		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		//convert set into list
				List<String> Windows=new ArrayList<String>(allWindows);
         
				//switch to child window
			    driver.switchTo().window(Windows.get(1));
				
				String cTitle = driver.getTitle();
				System.out.println(cTitle);
				
				//switch driver focus to parent window
				driver.switchTo().window(Windows.get(0));
				
				//close the parent window alone
				driver.close();
				
			//driver.close() - close only the current window/tab
			//driver.quit() - close all the opened window/tab

	}

}
