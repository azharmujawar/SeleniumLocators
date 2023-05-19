package com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Helper;

public class LinkTextandPartialLink {
	
	WebDriver driver;
	
	
	@Test
	public void linkText() throws InterruptedException
	{
		WebDriver driver=Helper.startBrowser("gc");
		
		driver.get("https://auth.hollandandbarrett.com/u/login?");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("azaruddin.mujawar@wipro.com");
		driver.findElement(By.id("password")).sendKeys("Shoukat@123");
		driver.findElement(By.xpath("//button[@name='action']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("cookie-consent-accept")).click();
		
		
		
		driver.findElement(By.partialLinkText("Vitamins")).click();
		
		List<WebElement> link=driver.findElements(By.xpath("//a"));
		
		int nolinks=link.size();
		
		System.out.println("Total links in page are"+nolinks);
		
		for(int i=0;i<link.size();i++)
		{
			System.out.println(link.get(i).getText());
			String str=link.get(i).getText();
			
			String str1="Vitamins & Supplements";
			
			if(str==str1)
				
			{
				
				driver.findElement(By.partialLinkText("Vitamins & Supplements")).click();
				
				//driver.findElement(By.xpath(""))
			}
		}
		
	}
	
	

}
