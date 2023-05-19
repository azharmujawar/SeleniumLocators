package DropDownBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_EasyCalculation {
	
	WebDriver driver;
	 
    @Test
    public void FBLunchMethod() throws InterruptedException {
 
        driver = Helper.startBrowser("Google Chrome");
        driver.get("https://www.easycalculation.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
 
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();
 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        Thread.sleep(2000);
        Select country1 = new Select(country);
        int countsize = country1.getOptions().size();
 
        System.out.println(countsize);
        Thread.sleep(2000);
        String text = country.getText();
 
        System.out.println(text);
        
        
        String title=driver.getTitle();
        
        System.out.println(title);
        
        String expectedText="Create your HIOX Account";
        
        try {
            Assert.assertEquals(title, expectedText);
            System.out.println("Title verified Sucessfully");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
