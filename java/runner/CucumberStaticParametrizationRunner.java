package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/java/feature/CucumberStaticParametrization.feature", glue="steps", monochrome=true, publish=true)
public class CucumberStaticParametrizationRunner extends AbstractTestNGCucumberTests {

}
