package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.sukgu.Shadow;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://dev242606.service-now.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		driver.findElement(By.id("user_password")).sendKeys("v^S8PbUx1J^k");
		
		driver.findElement(By.id("sysverb_login")).click();
		
		Thread.sleep(3000);
		
		//To refresh webpage if the webpage is blank
		driver.navigate().refresh();
		
		Shadow obj = new Shadow(driver);
		
		obj.findElementByXPath("//div[text()='All']").click();
		
		Thread.sleep(2000);
		
		obj.findElementByXPath("//span[text()='Service Catalog']").click();
		
		//driver.findElement(By.xpath("(//div[@class='drag_section'])[8]/table/tbody/tr/td[4]/a")).click();
		
		
		//driver.findElement(By.xpath("//span[contains(text(),'Cell phones')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
