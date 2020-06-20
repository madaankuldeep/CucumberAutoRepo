package com.basic.FirstFeatureFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {

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
	
	@When("^User enter first name$")
	public void User_enter_first_name()
	{
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("David");
		
	}
	
	@Then("^User check user first name field is present$")
	public void User_check_user_first_name_field_is_present()
	{
		String userNameActual=driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
		Assert.assertEquals(userNameActual,"David");
	}
}
