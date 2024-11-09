package homeassignment.week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String price = driver.findElement(By.xpath("//span[text()='24,599']")).getText();
		System.out.println("price of the first product:"+ price);
		
		WebElement mouseovertoelement = driver.findElement(By.xpath("//i[contains(@class,'a-icon-popover')]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mouseovertoelement).perform();
		
		String Noofcustomerratings = driver.findElement(By.xpath("//span[text()='7 global ratings']")).getText();
		System.out.println("Number of customer ratings for the first dispalyed product:"+ Noofcustomerratings);
		
		driver.findElement(By.xpath("//span[contains(text(),'(Refurbished) OnePlus 9 Pro 5G')]")).click();
		
		Set<String> window = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(window);
		
		driver.switchTo().window(windows.get(1));
		
		//Take Screenshot of the entire page - Add Source
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//Add Destination
		File destination = new File("./Snaps.product.png");
		
		//Combine source and destination
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(5000);
		
		String cartsubtotal = driver.findElement(By.id("attach-accessory-cart-total-string")).getText();
		System.out.println(cartsubtotal);
		
		if(cartsubtotal.contains("(1 item)")) {
			System.out.println("cart subtotal is correct");
		}
		else {
			System.out.println("cart subtotal is not correct");
		}
		

	}

}
