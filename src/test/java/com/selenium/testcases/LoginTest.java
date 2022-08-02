package com.selenium.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.selenium.pageobjects.LoginPage;

public class LoginTest extends BaseClass {

	
	
	@Test
	public void loginTest() throws IOException 
	{
		driver.get(baseURL);
		logger.info("URL is opened");

		

		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		
		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();
		logger.info("Click submitButton");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage123"))

		//if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
		captureScreen(driver,"loginTest");
		//		captureScreen(driver,"testcase name");

			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	} 


		
	}
