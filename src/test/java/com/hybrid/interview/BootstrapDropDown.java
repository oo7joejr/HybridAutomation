package com.hybrid.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BootstrapDropDown {

	WebDriver driver;

	BootstrapDropDown() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void selectDropdown() {

		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement dropdownBox = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='dropdownMenuButton']")));

		dropdownBox.click();
		
		List<WebElement> divList= driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		for(int i=0;i<divList.size();i++)
		{
			System.out.println("Web elements : "+ divList.get(i).getText());
			if(divList.get(i).getText().equals("Another action"))
			{
				divList.get(i).click();
				break;
			}
		}

		//quitDriver();
	}

	public void quitDriver() {
		driver.quit();
	}
}
