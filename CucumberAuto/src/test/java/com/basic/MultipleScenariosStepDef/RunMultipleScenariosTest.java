package com.basic.MultipleScenariosStepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		    //dryRun=false,
			features= {"src/test/resources/com/basic/MultipleScenariosFF"},
			glue={"com/basic/MultipleScenariosStepDef"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report6.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport6.html"
			}
		
		)

public class RunMultipleScenariosTest {
	
}
