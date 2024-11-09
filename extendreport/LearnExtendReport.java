package extendreport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {

	public static void main(String[] args) throws IOException {
		// Steps-6
		
		//Step1: Setup the path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");

	    //Step2:generate report - Create object for ExtentReports
		ExtentReports extent=new ExtentReports();
		
		//Step3: attach the data with the file
		extent.attachReporter(reporter);
		
		//Step4:Create the testcase and assign test details
		ExtentTest test = extent.createTest("Login", "Login with valid credentials");
	     test.assignAuthor("Vineeth");
	     test.assignCategory("Regression");
	
	    
	    //Step5:add step level status
	     test.pass("Username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/google.png").build());
	      
	     test.pass("Password entered successfully");
	     
	     test.pass("Login button clicked successfully");
	    
	     
	     //Step6: 
	     extent.flush();
	     
	     System.out.println("Done");
	     
	     
	    
	     
	
	}

}


