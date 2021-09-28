package com.hybrid.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hybrid.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(url);
		logger.info("Logged to website");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
	}
	
}
