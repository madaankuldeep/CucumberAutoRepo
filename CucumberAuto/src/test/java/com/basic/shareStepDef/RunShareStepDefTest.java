package com.basic.shareStepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		    dryRun=false,
			features= {"src/test/resources/com/basic/shareFF"},
			glue={"com/basic/shareStepDef"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report9.json",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport9.html"
			}
		
		)

public class RunShareStepDefTest {
	
}
