package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_Easemytrip {
	
	WebDriver driver;
	
	@Test
	public void testName()
	{
		
		
		driver=Helper.startBrowser("GC");
		driver.navigate().to("https://www.easemytrip.com/flights.html");
		driver.findElement(By.xpath("//div[@class='emt_nav']//a[normalize-space()='Holidays']")).click();
		
		
		
		
		//1. Click on Holiday link and Verify Text
		
		String expectedText="Turn Your Dream Holiday Into A Reality";
		
	  WebElement holidayText=driver.findElement(By.xpath("//*[text()='Turn Your Dream Holiday Into A Reality']"));
	  
	  String actualText=holidayText.getText();
	  
	Assert.assertEquals(actualText, expectedText);
	
	//2. Click on Hotel link and Verify Text
	
	
	String expectedText1="Same hotel, Cheapest price. Guaranteed!";
	
	WebElement hotelText=driver.findElement(By.linkText("Same hotel, Cheapest price. Guaranteed!"));
	
	driver.findElement(By.xpath("//a[@class='active_n']")).click();
	
	//Assert.assertEquals(actualText1, expectedText1);
	
		
	}

}
