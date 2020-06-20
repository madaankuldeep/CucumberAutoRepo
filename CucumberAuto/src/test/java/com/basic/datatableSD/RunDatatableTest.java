package com.basic.datatableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    monochrome=true,
		    dryRun=false,
			features= {"src/test/resources/com/basic/datatableFF"},
			glue={"com/basic/datatableSD"},
			plugin={"pretty","html:target/cucumber-htmlreport",
					"json:target/cucumber-report3.json",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentreport3.html"
			}
		
		)

public class RunDatatableTest {
	
}
