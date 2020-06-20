package com.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		    dryRun=false,
			features= {"src/test/resources/com/basic/hooksFF"},
			glue={"com/basic/hooksSD"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report5.json",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport5.html"
			}
		
		)

public class RunHooksTest {
	
}
