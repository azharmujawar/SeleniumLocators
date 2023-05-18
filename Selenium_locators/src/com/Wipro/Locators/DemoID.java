package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utility.Helper;

public class DemoID {
	
	
	WebDriver driver;
	
	@Test
	public void testName()
	{
		
		
		driver=Helper.startBrowser("GC");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		driver.findElement(By.id("log_email")).sendKeys("azharmujawar1234@gmail.com");
		driver.findElement(By.name("log_password")).sendKeys("Wipro123");
		
		WebElement ele=driver.findElement(By.name("log_submit"));
		ele.click();
		
		
		//driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		
	}
	
	@AfterTest
	
	public void tearDown()
	
	{
		//driver.quit();
	}

}
