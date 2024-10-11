package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

   public static void main(String[] args) {
		
   ChromeDriver driver = new ChromeDriver();
		
	driver.get("https://leafground.com/checkbox.xhtml");
		
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box')]")).click();
		
	driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::div)[13]")).click();
		
	String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
	System.out.println(text);
		
	if(text.contains("Check")) {
		System.out.println("expected message is displayed");
	}
	else {
		System.out.println("expected message is not displayed");
	}
		
	driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')]/div)[8]")).click();
		
	driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[15]")).click();
		
	String text1 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
	System.out.println(text1);
	
	if(text1.contains("= 1")) {
		System.out.println("State = 1 option is chosen");
	}
	else {
		System.out.println("State = 1 option is not chosen");
	}
	
	driver.findElement(By.className("ui-toggleswitch-slider")).click();
	
	String text2 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
	System.out.println(text2);
	
	if(text2.contains("Check")) {
		System.out.println("expected message is displayed");
		}
	else {
		System.out.println("expected message is not displayed");
	}
	
	System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox')])[3]")).isSelected());
		}

}
