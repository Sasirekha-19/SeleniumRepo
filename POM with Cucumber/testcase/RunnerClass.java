package testcase;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/main/java/feature", glue="pages", monochrome=true, publish=true)
public class RunnerClass extends BaseClass {

}
