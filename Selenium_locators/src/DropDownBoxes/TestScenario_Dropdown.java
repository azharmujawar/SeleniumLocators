package DropDownBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utility.Helper;

public class TestScenario_Dropdown {
	
	
	WebDriver driver;
    @Test
    public void FBluanch() throws Exception
    {
         driver=Helper.startBrowser("GC");
         driver.manage().window().maximize();
         driver.navigate().to("https://www.facebook.com/campaign/landing.php?");

         WebElement day_dropdown=driver.findElement(By.id("day"));
         Select day_dd=new Select(day_dropdown);
         int size_day=day_dd.getOptions().size();
         System.out.println("Size of day dropdown: "+size_day);

         WebElement year_dropdown=driver.findElement(By.id("year"));
         Select year_dd=new Select(day_dropdown);
         int size_year=year_dd.getOptions().size();
         System.out.println("Size of year dropdown: "+size_year);


    }
    @AfterTest
    public void tearDown()
    {
        driver.close();
    }


}
