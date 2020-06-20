package com.basic.shareStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShareClass {

	WebDriver driver;
	@Before
	public WebDriver setup() {
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	@After
	public void Teardown()
	{
		driver.quit();
		driver=null;
	}
}
