package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinition.BaseClass;

public class HooksImplementation extends BaseClass {

	@Before
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
}
    @After
	public void postCondition() {
		driver.close();
}
}
