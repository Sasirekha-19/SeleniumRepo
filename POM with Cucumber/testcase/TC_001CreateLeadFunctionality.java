package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLeadFunctionality extends BaseClass{
	
	@BeforeTest
	public void setValues() {
	fileName = "CreateLeadData";
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String username, String password, String cName, String fName, String lName) {
		LoginPage lc = new LoginPage();
		System.out.println("driver reference id:" +getDriver());
		lc.EnterUsername(username)
		.EnterPassword(password)
		.clickLoginButton()
		.verifyLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.EntercName(cName)
		.EnterfName(fName)
		.EnterlName(lName)
		.clickCreateLeadButton()
		.verifyfirstName();
	}
}
	
