package com.basic.shareStepDef;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;



public class shareStepDef {

	WebDriver driver;
	
	public shareStepDef(ShareClass share)
	{
		driver = share.setup();
	}
	
	@Given("^User needs to be on the facebook login page$")
	public void User_needs_to_be_on_the_facebook_login_page()
	{
		
		driver.get("https://www.facebook.com/");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		
	}	

	@After
	public void tear_down1()
	{
		System.out.println("In  after");	
		driver.quit();
		driver=null;
	}
}

