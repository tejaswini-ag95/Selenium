package com.selenium.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

//import com.selenium.pageObjects.AddCustomerPage;
import com.selenium.pageobjects.LoginPage;
import com.selenium.pageobjects.NewCustomerPage;

public class NewCustomerTest extends BaseClass {
	
	

	@Test
	public void NewCustomerTest() throws InterruptedException, IOException
	{
		
		LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("User name is provided");

	
	lp.setPassword(password);
	logger.info("Passsword is provided");

	lp.clickSubmit();
	logger.info("Click on submitButton");

	
	Thread.sleep(3000);
	
	//AddCustomerPage addcust=new AddCustomerPage(driver);
	
	NewCustomerPage addcust=new NewCustomerPage(driver);
	addcust.clickAddNewCustomer();
	logger.info("providing customer details....");

	
	addcust.custName("Pavan");
	addcust.custgender("male");
	addcust.custdob("10","15","1995");
	Thread.sleep(5000);
	addcust.custaddress("INDIA");
	addcust.custcity("HYD");
	addcust.custstate("AP");
	addcust.custpinno("5000074");
	addcust.custtelephoneno("987890098");
	
	//String email=randomestring()+"@gmail.com";
	//edit customer  fggfgffg--43554
	//delete custmer ggfgffg--77970
	//String email="ggfgffg"+"@gmail.com";   --delete customer       

	String email="fggfgffg"+"@gmail.com"; 

	
	addcust.custemailid(email);
	addcust.custpassword("abcdef");
	addcust.custsubmit();
	
	Thread.sleep(3000);
	logger.info("validation started....");

	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");

	

//	}
//
//	private String randomestring() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
	
	
	
	if(res==true)
	{
		Assert.assertTrue(true);
		logger.info("test case passed....");
		
	}
	else
	{
		logger.info("test case failed....");
	//	captureScreen(driver,"addNewCustomer");
		Assert.assertTrue(false);
	}
		
}


}
