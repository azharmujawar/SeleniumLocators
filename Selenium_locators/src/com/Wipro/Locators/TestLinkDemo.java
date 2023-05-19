package com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Helper;

public class TestLinkDemo {
	
	
	

	public static void main(String[] args) {

	WebDriver driver=Helper.startBrowser("Edge");

	driver.get("https://www.naukri.com/");

	driver.manage().window().maximize();



	List<WebElement> allLinks=driver.findElements(By.tagName("a"));

	System.out.println(allLinks.size());

	

	for(WebElement ele:allLinks)

	{

	System.out.println(ele.getText());

	System.out.println(ele.getAttribute("href"));

	}

	List<WebElement> allImages=driver.findElements(By.tagName("img"));

	System.out.println("Total images on this page"+allImages.size());


	for(WebElement ele:allImages)

	{

	System.out.println("src"+ele.getAttribute("src"));

	}

	}

}
