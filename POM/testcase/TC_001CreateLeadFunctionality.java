package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLeadFunctionality extends BaseClass{
	
   //@BeforeTest
   //public void setValues() {
		//fileName = "CreateLeadData";
	//}
	
	//@Test(dataProvider="fetchData")
	//public void runCreateLead(String username, String password, String cName, String fName, String lName) {
	@Test
	public void runCreateLead() {
	    LoginPage lc = new LoginPage(driver);
		System.out.println("driver reference id:" +driver);
		lc.EnterUsername()
		.EnterPassword()
		.clickLoginButton()
		.verifyLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.EntercName()
		.EnterfName()
		.EnterlName()
		.clickCreateLeadButton()
		.verifyfirstName();
	}
}
	
