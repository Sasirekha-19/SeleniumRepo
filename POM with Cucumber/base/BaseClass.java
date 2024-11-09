package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests {

	//public ChromeDriver driver;
	
	public String fileName;
	
	//ThreadLocal
	private static final ThreadLocal<ChromeDriver> Cdriver = new ThreadLocal<ChromeDriver>();
	
	public void serDriver() {
		Cdriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
		return Cdriver.get();
	}
	
	@BeforeMethod
	public void preConditions() {
		serDriver();
	    //driver= new ChromeDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@DataProvider(name="fetchData")
	public String[][] setData() throws IOException {
		
		return ReadExcel.readData(fileName);
	}
	
	@AfterMethod
	public void postConditions() {
		getDriver().close();
	}
	
}
