package com.basic.hooksSD;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



@SuppressWarnings("deprecation")
public class hooksSD {

	WebDriver driver=null;
	
	@Before(order=1)
	public void beforesetup1() throws InterruptedException
	{
		System.out.println("In  before1");	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Loading...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	//	driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	@Before(order=2)
	public void beforesetup2()
	{
		System.out.println("In  before2");	
	}
	@Given("^User needs to be on the facebook login page$")
	public void User_needs_to_be_on_the_facebook_login_page()
	{
		
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
		Assert.assertEquals(firstName, userNameActual);
	//	Assert.assertEquals(userNameActual,firstName);
	}
	@Then("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank()
	{
		String mobilefieldActual=driver.findElement(By.xpath("//input[@id='u_0_r']")).getAttribute("value");
		Assert.assertEquals("",mobilefieldActual);

//		junit.framework.Assert.assertEquals("", mobilefieldActual);
	//	Assert.assertEquals(mobilefieldActual,"");
	}
//	@Then("^close browser$")
//	public void close_browser()
///	{
	//	driver.quit();
		//driver=null;
//	}
	@After(order=2)
	public void tear_down1()
	{
		System.out.println("In  after1");	
		driver.quit();
		driver=null;
	}
	@After(order=1)
	public void tear_down2()
	{
		System.out.println("In  after2");	

	}
}

