package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		    //dryRun=false,
			features= {"src/test/resources/com/basic/FirstFeatureFileFF"},
			glue={"com/basic/FirstFeatureFile"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report4.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport4.html"
			}
		
		)

public class RunMyFirstFeatureTest {
	
}
