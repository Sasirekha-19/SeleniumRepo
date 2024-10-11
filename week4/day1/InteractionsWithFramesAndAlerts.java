package homeassignment.week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithFramesAndAlerts {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[contains(text(),'Harry')]")).getText();
		System.out.println(text);
		
		if(text.contains("Harry")) {
			System.out.println("the action is performed correctly and the text is verified");
		}
		else {
			System.out.println("the action is not performed and the text is not verified");
		}
		
	}

}
