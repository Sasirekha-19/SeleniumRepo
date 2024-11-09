package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/java/feature/CucumberDynamicParametrization.feature", glue="steps", monochrome=true, publish=true)
public class CucumberDynamicParametrization extends AbstractTestNGCucumberTests{

}
