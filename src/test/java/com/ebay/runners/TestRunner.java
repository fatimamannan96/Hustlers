package com.ebay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		features="Feature",
		glue = "com.ebay.stepdef",
		plugin = "pretty"
		
		     )

public class TestRunner extends AbstractTestNGCucumberTests{

}
