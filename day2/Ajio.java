package homeassignment.week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		
		driver.findElement(By.className("ic-search")).click();
		
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-Men')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		String text = driver.findElement(By.xpath("//strong[text()='1,180']")).getText();
		System.out.println(text);
		
		List<WebElement> listofbrands = driver.findElements(By.className("brand"));
		System.out.println(listofbrands);
		
		int size = listofbrands.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			System.out.println(listofbrands.get(i).getText());
		}
		
		List<WebElement> listofnamesofbags = driver.findElements(By.className("nameCls"));
		int size1 = listofnamesofbags.size();
		
		for(int i=0;i<size1;i++) {
			System.out.println(listofnamesofbags.get(i).getText());
		}
		

	}

}
