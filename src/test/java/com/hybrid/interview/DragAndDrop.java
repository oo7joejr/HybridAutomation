package com.hybrid.interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	WebDriver driver;
	
	public static void main(String ars[]) {
	//WebDriver driver;
		DragAndDrop dd=new DragAndDrop();
		dd.DragnDrop();
	
	}
	//@Test
	public void DragnDrop() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		// Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// Dragged and dropped.
		act.dragAndDrop(From, To).build().perform();

		//driver.quit();
	}
}

