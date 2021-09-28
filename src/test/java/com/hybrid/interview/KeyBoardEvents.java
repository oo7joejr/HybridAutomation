package com.hybrid.interview;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class KeyBoardEvents {

	public static void main(String[] args) {
		
        // Initialize ChromeDriver
		// Here we assume that the ChromeDriver path has been set in the System Global variables
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        
        driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //Create object of the Actions class
        Actions actions = new Actions(driver);
       
        
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        
        // Select the Current Address using CTRL + A
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        // Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        
        //Compare Text of current Address and Permanent Address
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        Assert.assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        
        
        driver.close();

	}

}