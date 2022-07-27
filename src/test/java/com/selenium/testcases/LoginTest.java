package com.selenium.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.selenium.pageobjects.LoginPage;

public class LoginTest extends BaseClass {

	
	
	@Test
	public void loginTest() 
	{
		driver.get(baseURL);
		

		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		
		lp.setPassword(password);
		lp.clickSubmit();

		
	}
}
