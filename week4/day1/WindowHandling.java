package homeassignment.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("//td[contains(@class,'dijitComboBoxInput')]/following::img")).click();
		
		//To Handle Multiple Windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//Convert set into list
		
		List<String> Windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(Windows.get(1));
		
		driver.findElement(By.linkText("DemoCustomer")).click();
		
		driver.switchTo().window(Windows.get(0));
		
		driver.findElement(By.xpath("(//td[contains(@class,'dijitComboBoxInput')]/following::img)[2]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
		
		List<String> Windows1 = new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(Windows1.get(1));
		
		driver.findElement(By.linkText("DemoLBCust")).click();
		
		driver.switchTo().window(Windows1.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(240000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Merge")) {
			System.out.println("title is verified");
		}
		else {
			System.out.println("title is not verified");
		}
		
	}

}
