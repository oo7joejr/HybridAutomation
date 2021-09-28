package com.hybrid.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkFinder {

	WebDriver driver;
	LinkFinder()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Test
	public void findLinksInPage()  {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
				
		int linkCountAll=driver.findElements(By.tagName("a")).size();
		System.out.println("All link count  " +linkCountAll);
		
		
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int linkCountFooter=footer.findElements(By.tagName("a")).size();
		System.out.println("Footer link count  " +linkCountFooter);
		
		quitDriver();
	}
	
	public void quitDriver() {
		driver.quit();
	}
}
