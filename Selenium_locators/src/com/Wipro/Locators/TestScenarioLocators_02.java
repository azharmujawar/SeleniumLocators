package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenarioLocators_02 {
	
	WebDriver driver;
	
	@Test
	public void registerUser() throws InterruptedException
	{
		
		driver=Helper.startBrowser("GC");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Azaruddin");
		driver.findElement(By.name("lastname")).sendKeys("Mujawar");
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[4]/div[1]/input[1]")).sendKeys("azharmujawar1234@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("wipro@123");
		
		
		Thread.sleep(2000);
		
JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 1000)");
		
		Thread.sleep(2000);
		driver.findElement(By.id("input-newsletter-yes")).click();
		
		driver.findElement(By.name("agree")).click();
		
		driver.findElement(By.className("btn btn-primary")).click();
	
		
	
		
		
		
		
	}
	
	

}
