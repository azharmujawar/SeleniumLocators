package com.Wipro.Locators;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarioLocators_02_Edge {

	@Test
	public void registerUser() throws InterruptedException {

		String expectedTitle = "Register Account";

		// 1. Open Url
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Workspace\\Selenium_locators\\EdgeBrowser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();

		String currentTitle =driver.getTitle();

		// Validate Title
		Assert.assertEquals(currentTitle, expectedTitle);
		
		

		WebElement firstName=driver.findElement(By.name("firstname"));
				firstName.sendKeys("Azaruddin");
				
		driver.findElement(By.name("lastname")).sendKeys("Mujawar");
		driver.findElement(
				By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[4]/div[1]/input[1]"))
				.sendKeys("azharmujawar1234@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("wipro@123");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 1000)");

		Thread.sleep(2000);
		driver.findElement(By.id("input-newsletter-yes")).click();

		driver.findElement(By.name("agree")).click();

		// driver.findElement(By.className("btn btn-primary")).click();

		WebElement ele2 = driver.findElement(By.xpath("//button[@type='submit']"));
		ele2.click();

		Thread.sleep(2000);

	}

}
