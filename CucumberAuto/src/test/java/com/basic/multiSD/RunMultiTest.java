package com.basic.multiSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		   // dryRun=true,
			features= {"src/test/resources/com/basic/multiFF"},
			glue={"com/basic/multiSD"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report7.json",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport7.html"
			}
		
		)

public class RunMultiTest {
	
}
