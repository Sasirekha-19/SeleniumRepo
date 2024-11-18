package concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TryCatch {

	public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Leaf@123");
        driver.findElement(By.id("Login")).click();
        try {
        driver.findElement(By.xpath("//div[@class='slds-icon-waff']")).click();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        try {
        driver.findElement(By.xpath("//button[text()='View Al']")).click();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        driver.close();
	}
}
