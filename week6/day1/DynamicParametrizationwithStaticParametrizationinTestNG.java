package homeassignment.week6.day1;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DynamicParametrizationwithStaticParametrizationinTestNG extends BaseClass {
	
	
	@DataProvider(name="fetchdata")
	public String[][] sendData() {
		
		String[][] data = new String[2][2];//String[][] data = new String[noofrows][noofcolumns]
		data[0][0] = "88";
		data[0][1] = "TCS";
		data[1][0] = "99";
		data[1][1] = "IBM";
		
		 //     0            1
		//{{"88","TCS"},{"99","IBM"}}
	    //    0    1      0     1   
		return data;
	}
	
	    @Test(dataProvider="fetchdata")
        public void RunEditLead1(String phno,String companyName) throws InterruptedException {
	    	
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		
}
}
