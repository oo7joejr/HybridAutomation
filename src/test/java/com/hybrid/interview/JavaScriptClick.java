package com.hybrid.interview;

import org.openqa.selenium.By;		
import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.annotations.Test;		
    		
public class JavaScriptClick {				


    @Test		
    public void Login() throws InterruptedException 					
    {		
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
    	WebDriver driver = new ChromeDriver();		
        		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://demo.guru99.com/V4/");			
        		
        WebElement button =driver.findElement(By.name("btnLogin"));			
        		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to Guru99');");   
        Thread.sleep(5000);
    		
    }		
}