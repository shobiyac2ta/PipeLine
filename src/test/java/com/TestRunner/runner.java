package com.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com/Stepdefenitions","com.Hooks"},
                  plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags= {"@tc006"})

public class runner  extends AbstractTestNGCucumberTests  {

	
	
}
