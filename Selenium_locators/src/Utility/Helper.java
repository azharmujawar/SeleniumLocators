package Utility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class Helper {

public static WebDriver startBrowser(String browser)
	
{

  WebDriver driver =null;
		
		if(browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC") || browser.equalsIgnoreCase("Google chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Selenium_locators\\Chrome Browser Drivers\\chromedriver.exe");
			
			ChromeOptions co =new ChromeOptions();
			co.addArguments("ignore-certificate-errors");
			driver=new ChromeDriver(co);
		}
		
		else if(browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG") || browser.equalsIgnoreCase("Microsoft Edge"))
		{
System.setProperty("webdriver.edge.driver", "D:\\Selenium Workspace\\Selenium_locators\\EdgeBrowser\\msedgedriver.exe");
			
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Wrong Browser");
		}
		return driver;
		
	}

}
