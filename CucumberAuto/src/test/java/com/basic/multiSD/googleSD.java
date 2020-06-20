package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class googleSD {
	
	WebDriver driver=null;
	
	@Given("^User needs to be on the google page$")
	public void User_needs_to_be_on_the_google_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@When("")
	public void User_enter_search_string() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		Thread.sleep(1000);

	}

}
