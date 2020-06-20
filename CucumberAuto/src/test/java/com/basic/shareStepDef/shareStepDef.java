package com.basic.shareStepDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


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

