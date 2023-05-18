package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenarioLocators_02_Opencart {
	
	WebDriver driver;
	
	@Test
	public void registerUser() throws InterruptedException
	{
		
		String expectedTitle = "Register Account";

		// 1. Open Url
		
		
		
		driver=Helper.startBrowser("gc");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		

		String currentTitle = driver.getTitle();

		// 2.Validate Title
		Assert.assertEquals(currentTitle, expectedTitle);

		WebElement firstName = driver.findElement(By.name("firstname"));

		// 3. Validate First Name
		if (firstName.isEnabled()) {

			firstName.clear();
			firstName.sendKeys("Azaruddin");
		} else {
			System.out.println("unable to locate First Name");
		}

		WebElement lastName = driver.findElement(By.name("lastname"));

		// 3. Validate Last Name

		if (lastName.isEnabled()) {

			lastName.clear();
			lastName.sendKeys("Mujawar");

		}

		driver.findElement(
				By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[4]/div[1]/input[1]"))
				.sendKeys("azharmujawar1234@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("wipro@123");

		Thread.sleep(2000);
		

		// 4. Scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");

		Thread.sleep(2000);
		driver.findElement(By.id("input-newsletter-yes")).click();

		driver.findElement(By.name("agree")).click();

		// driver.findElement(By.className("btn btn-primary")).click();

		// 4 click on submit button

		WebElement ele2 = driver.findElement(By.xpath("//button[@type='submit']"));
		ele2.click();

	}

	

}
