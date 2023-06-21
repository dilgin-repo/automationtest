package com.moneycorp.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://www.moneycorp.com/en-gb/";
	public static WebDriver driver;
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+"//Drivers//chromedriver.exe"));
		
		driver =new ChromeDriver();
		
		if(driver.getTitle().equals("Moneycorp"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
