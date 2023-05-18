package com.Wipro.Locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Helper;

public class FindElementsByLinks {
	
	WebDriver driver;
	int total=0;
	
	@Test
	
	public void linksLocator()
	{
		driver=Helper.startBrowser("gc");
		driver.navigate().to("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Calculators")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int linksCount=links.size();
		
		System.out.println(""+linksCount);
		
		for (int i = 0; i < linksCount; i++)
		{
			
			System.out.println(links.get(i).getText());
			
		}
		
	}

}
