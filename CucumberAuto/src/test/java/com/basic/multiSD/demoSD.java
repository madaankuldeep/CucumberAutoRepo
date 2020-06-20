package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class demoSD {
	WebDriver driver=null;
	
	@Given("^User need to be on the login page$")
	public void User_need_to_be_on_the_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.paypal.com/us/signin");
	}
	@When("^User enter email id$")
	public void User_enter_email_id() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.com");
		Thread.sleep(1000);

	}
}
