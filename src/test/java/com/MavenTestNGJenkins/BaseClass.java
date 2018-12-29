package com.MavenTestNGJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setup() 
	{
	
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void failTest()
	{
		Assert.assertEquals(12, 13);
	}
	
}
