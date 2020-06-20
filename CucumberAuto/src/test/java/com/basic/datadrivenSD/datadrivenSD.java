package com.basic.datadrivenSD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class datadrivenSD {

	WebDriver driver;
	
	@Given("^User needs to be on the facebook login page$")
	public void User_needs_to_be_on_the_facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Loading...");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		
	}	
	@When("^User enter \"([^\"]*)\" first name$")
	public void User_enter_first_name(String firstName) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys(firstName);
		Thread.sleep(1000);
			
	}
	@And("^User enter \"([^\"]*)\" surname$")
	public void User_enter_surname(String surName) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys(surName);
		Thread.sleep(1000);
		
	}
	@Then("^User check user \"([^\"]*)\" first name field is present$")
	public void User_check_user_first_name_field_is_present(String firstName)
	{
		String userNameActual=driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
		Assert.assertEquals(userNameActual,firstName);
	}
	@Then("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank()
	{
		String mobilefieldActual=driver.findElement(By.xpath("//input[@id='u_0_r']")).getAttribute("value");
		Assert.assertEquals(mobilefieldActual,"");
	}
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver=null;
	}
}

