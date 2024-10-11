package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		
    ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.leafground.com/alert.xhtml");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	
	Alert alert = driver.switchTo().alert();
	
	alert.sendKeys("Sasirekha");
	
	alert.accept();
	
	String text1 = driver.findElement(By.id("confirm_result")).getText();
	System.out.println(text1);
	
	if(text1.contains("Sasi"))
	{
		System.out.println("text is verified");
	}
	else {
		System.out.println("text is not verified");
	}
}
}
