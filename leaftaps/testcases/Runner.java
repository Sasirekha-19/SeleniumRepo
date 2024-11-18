package com.leaftaps.testcases;

import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/main/java/feature", glue="com.leaftaps.pages", monochrome=true, publish=true)
public class Runner extends ProjectSpecificMethods {

	
}
