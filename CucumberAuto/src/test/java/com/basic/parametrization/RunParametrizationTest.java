package com.basic.parametrization;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		    dryRun=false,
			features= {"src/test/resources/com/basic/parametrizationFF"},
			glue={"com/basic/parametrization"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report8.json",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport8.html"
			}
		
		)

public class RunParametrizationTest {
	
}
