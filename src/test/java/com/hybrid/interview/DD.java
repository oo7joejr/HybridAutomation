package com.hybrid.interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DD {

	public static void main(String[] args) throws InterruptedException  {
		
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
      
		Actions act = new Actions(driver);  

    // Launch Web site  
        driver.get("https://www.testandquiz.com/selenium/testing.html");   
        
        Thread.sleep(3000);
        //SCROLL DOWN
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
          
    //WebElement on which drag and drop operation needs to be performed  
        WebElement From = driver.findElement(By.xpath("//img[@id='sourceImage']"));  
        Thread.sleep(3000);
    //WebElement to which the above object is dropped  
        WebElement To = driver.findElement(By.id("targetDiv"));  
       
        Thread.sleep(3000);
        
        
        act.clickAndHold(From).moveToElement(To).release(To).build().perform();
       // act.dragAndDrop(From, To).build().perform();
        
        System.out.println("After hover: " );
        
       // driver.quit();
     
	}
	
}