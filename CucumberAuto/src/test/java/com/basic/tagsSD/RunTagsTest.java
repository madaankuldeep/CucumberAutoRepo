package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		    dryRun=false,
		    //tags= {"@Important"}, All scenarios of feature files
		    //tags= {"@Smoke"}, oNly smoke tags
		    //tags= {"@Smoke","@Regression"}, // This is AND condition and as we know we have 2 it will run twice
			tags= {"@Smoke,@Regression"}, // This is OR condition and all the scenarios with Smoke or Regression will be run    
			features= {"src/test/resources/com/basic/tagsFF"},
			glue={"com/basic/tagsSD"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report10.json",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport10.html"
			}
		
		)

public class RunTagsTest {
	
}
