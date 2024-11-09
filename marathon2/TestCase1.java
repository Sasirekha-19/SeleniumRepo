package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("wzrk-cancel")).click();
		
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(brands).perform();
		
		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		
		act.moveToElement(watches).perform();
		
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		WebElement dropdown = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		
		Select obj = new Select(dropdown);
		
		obj.selectByVisibleText("New Arrivals");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("CheckBox__base")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> allwatchesprice = driver.findElements(By.className("ProductDescription__priceHolder"));
		
		int countofwatchesprice = allwatchesprice.size();
		System.out.println(countofwatchesprice);
		
		for(int i=0;i<countofwatchesprice-1;i++)
		{
			System.out.println(allwatchesprice.get(i).getText());
		}
		
		driver.findElement(By.className("ProductModule__dummyDiv")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		WebElement itemincart = driver.findElement(By.className("DesktopHeader__cartCount"));
		System.out.println(itemincart.getText());
		
		driver.switchTo().window(windows.get(0));
		
		String firstwatchpriceinwindow0 = allwatchesprice.get(0).getText();
		
		driver.switchTo().window(windows.get(1));
		
		String firstwatchpriceinwindow1 = driver.findElement(By.xpath("//h3[text()='MRP:  ₹3995']")).getText();
		String replaceAll = firstwatchpriceinwindow1.replaceAll("[^0-9]","");
		System.out.println(replaceAll);
	
		
		if(firstwatchpriceinwindow0.contains(replaceAll)) {
			System.out.println("price for first watch in window 0 & window 1 are similar");
			}
		else {
			System.out.println("price for first watch in window 0 & window 1 are not similar");
		}
		
		

	}

}
