package com.selenium.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.selenium.pageobjects.EditCustomerPage;
import com.selenium.pageobjects.LoginPage;
import com.selenium.pageobjects.NewCustomerPage;

public class EditCustomerTest  extends BaseClass{
	
	
	@Test
	public void EditCustomerTest() throws InterruptedException, IOException
	{
		
		LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("User name is provided");

	
	lp.setPassword(password);
	logger.info("Passsword is provided");

	lp.clickSubmit();
	logger.info("Click on submitButton");

	
	Thread.sleep(3000);
	
	
	
	EditCustomerPage addcust=new EditCustomerPage(driver);
	addcust.clickEditCustomer();
	logger.info("providing customer details....");

	addcust.custiD("43554");
	addcust.custsubmit();


	logger.info("edit customer details....");


	
	

}
}
