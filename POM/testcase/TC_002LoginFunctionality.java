package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;


public class TC_002LoginFunctionality extends BaseClass{

    //@BeforeTest
	//public void setValues() {
		//fileName = "LoginData";
	//}

	//@Test(dataProvider="fetchData")
	//public void runLogin(String username, String password) {
	@Test
	public void runLogin() {
	    LoginPage lc = new LoginPage(driver);
		System.out.println("driver reference id:" +driver);
		lc.EnterUsername()
		.EnterPassword()
		.clickLoginButton()
		.verifyLogin();
}
}