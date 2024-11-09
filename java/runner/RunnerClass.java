package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

//@CucumberOptions(features= "src/main/java/feature/Login.feature", glue="stepdefinition")
//@CucumberOptions(features= "src/main/java/feature/Login.feature", glue={"stepdefinition", "hooks"})
//public class RunnerClass extends AbstractTestNGCucumberTests{

	//}

@CucumberOptions(features= "src/main/java/feature/Login.feature", glue="stepdefinition")
public class RunnerClass extends BaseClass{

	}