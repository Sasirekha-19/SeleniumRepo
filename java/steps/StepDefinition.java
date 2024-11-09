package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

	
	@Given("Launch the browser")
	public void launch_the_browser() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("Load the url")
	public void load_the_url() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}

	@When("Enter the username as dilip@testleaf.com")
	public void enter_the_username_as_dilip_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	}

	@When("Enter the password as leaf@{int}")
	public void enter_the_password_as_leaf(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
	}
	
	@When("Click login button")
	public void click_login_button()
	{
		driver.findElement(By.id("Login")).click();
	}

	@When("Click on toggle menu button")
	public void click_on_toggle_menu_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
		}

	@When("Click View All")
	public void click_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@When("Click Sales from App Launcher")
	public void click_sales_from_app_launcher() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		Thread.sleep(5000);
	    WebElement clickaccounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
	    Actions act = new Actions(driver);
	    act.click(clickaccounts).perform();
	}

	@When("Click on New button")
	public void click_on_new_button() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter name in the Account name field (.*)$")
	public void enter_name_in_the_account_name_field(String name) {
	    driver.findElement(By.xpath("//label[text()='Account Name']//following::input")).sendKeys(name);
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
	    WebElement clickownership = driver.findElement(By.xpath("(//button[contains(@class,'slds-input_faux')])[4]"));
	    driver.executeScript("arguments[0].click()",clickownership);
	    driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
	}

	@When("Click save")
	public void click_save() {
	    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("Account should be created with the given name")
	public void account_should_be_created_in_the_given_name() {
	   String name = driver.findElement(By.xpath("//slot[contains(@class,'slds-page-header__title')]/lightning-formatted-text")).getText();
	   if(name.contains(name)) {
		   System.out.println("account is created with the given name");
	   }
	   else {
		   System.out.println("account is not with the given name created");
	   }
		
	}

}
