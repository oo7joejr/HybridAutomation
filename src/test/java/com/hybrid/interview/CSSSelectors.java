package com.hybrid.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CSSSelectors {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Before class");
	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
		System.out.println("After class");
	}

	@Test(enabled = false)
	public void registration() {
		driver.navigate().to("https://www.blazemeter.com/");
		driver.manage().window().maximize();

		WebElement startlink = driver.findElement(By.cssSelector("a.start-testing-btn"));
		startlink.click();
		WebElement firstName = driver.findElement(By.cssSelector("input#firstName"));
		firstName.sendKeys("Joshy");
		WebElement lastName = driver.findElement(By.cssSelector("input#lastName"));
		lastName.sendKeys("Joy");

		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("joshyjoy123@gmail.com");

		WebElement company = driver.findElement(By.xpath("//input[@id=\"user.attributes.company\"]"));
		company.sendKeys("ABCD Firm");
		
		WebElement submitButton= driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		submitButton.click();

	}
	
	@Test
	public void login() {
		driver.navigate().to("https://www.blazemeter.com/");
		driver.manage().window().maximize();
		
		WebElement startlink = driver.findElement(By.cssSelector("a.start-testing-btn"));
		startlink.click();
		
		WebElement signIn= driver.findElement(By.xpath("//a[text()=\"Sign In\"]"));
		signIn.click();
	}

}
