package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class BaseClass{

	public ChromeDriver driver;
	
	public String fileName;
	
	@BeforeMethod
	public void preConditions() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	//@DataProvider(name="fetchData")
	//public String[][] setData() throws IOException {
		
		//return ReadExcel.readData(fileName);
	//}
	
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	
}
