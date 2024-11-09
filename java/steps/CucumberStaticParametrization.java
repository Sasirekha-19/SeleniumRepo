package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStaticParametrization extends BaseClass {

	@When("Click the App Launcher Icon")
	public void click_the_app_launcher_icon() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
	}

	@When("Click Accounts")
	public void click_accounts() throws InterruptedException {
		WebElement clickaccounts = driver.findElement(By.xpath("//p[text()='Accounts']"));
		Actions act = new Actions(driver);
		act.click(clickaccounts).perform();
	}

	@When("Search for the account using unique account name")
	public void search_for_the_account_using_unique_account_name() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Sasirekha"+Keys.ENTER);
	}

	@When("Click the dropdown icon next to the account and select Edit")
	public void click_the_dropdown_icon_next_to_the_account_and_select_edit() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(@class,'slds-icon-utility-down')]/span")).click();
	    driver.findElement(By.xpath("//li[@class='uiMenuItem']/a")).click();	
	}

	@When("Set Type to Technology Partner")
	public void set_type_to_technology_partner() {
	    driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
	    driver.findElement(By.xpath("(//span[text()='Technology Partner'])[2]")).click();
	}

	@When("Set Industry to Healthcare")
	public void set_industry_to_healthcare() {
	    driver.findElement(By.xpath("//span[text()='Healthcare']")).click();
	    driver.findElement(By.xpath("(//span[text()='Healthcare'])[2]")).click();
	}

	@When("Enter the Billing Address as {string}")
	public void enter_the_billing_address_as(String billingaddr) {
	    WebElement billingaddress = driver.findElement(By.xpath("//textarea[@class='slds-textarea']"));
	    billingaddress.clear();
	    billingaddress.sendKeys(billingaddr);
	}

	@When("Enter the Shipping Address as {string}")
	public void enter_the_shipping_address_as(String shippingaddr) {
	    WebElement shippingaddress = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
	    shippingaddress.clear();
	    shippingaddress.sendKeys(shippingaddr);
	}

	@When("Set Customer Priority to Low")
	public void set_customer_priority_to_low() {
	    driver.findElement(By.xpath("(//button[contains(@class,'slds-input_faux')])[5]")).click();
	    driver.findElement(By.xpath("//span[text()='Low']")).click();
	}

	@When("Set SLA to Silver")
	public void set_sla_to_silver() {
	    driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox__form-element')])[7]")).click();
	    driver.findElement(By.xpath("(//span[text()='Silver'])[2]")).click();
	}

	@When("Set Active to NO")
	public void set_active_to_no() {
	    driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox__form-element')])[9]")).click();
	    driver.findElement(By.xpath("(//span[text()='No'])[3]")).click();
	}

	@When("Enter a unique number in the Phone field {string}")
	public void enter_a_unique_number_in_the_phone_field(String phono) {
	    WebElement phoneno = driver.findElement(By.xpath("//input[@name='Phone']"));
	    phoneno.clear();
	    phoneno.sendKeys(phono);
	}

	@When("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
	    driver.findElement(By.xpath("(//div[contains(@class,'slds-combobox__form-element')])[8]")).click();
	}

	@When("Click Save")
	public void click_save() {
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	@Then("Account should be displayed with the given phone number")
	public void account_should_be_displayed_with_phone_number() {
	    String phno = driver.findElement(By.xpath("//span[text()='8888888888']")).getText();
	    if(phno.contains("8888")) {
	    	System.out.println("account displayed with the given phone number");
	    }
	    else {
	    	System.out.println("account not displayed with the given phone number");
	    }
	}

}
