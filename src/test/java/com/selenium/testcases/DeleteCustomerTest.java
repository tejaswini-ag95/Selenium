package com.selenium.testcases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.selenium.pageobjects.DeleteCustomerPage;
import com.selenium.pageobjects.EditCustomerPage;
import com.selenium.pageobjects.LoginPage;

public class DeleteCustomerTest extends BaseClass {
	
	@Test
	public void DeleteCustomerTest() throws InterruptedException, IOException
	{
		
		LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("User name is provided");

	
	lp.setPassword(password);
	logger.info("Passsword is provided");

	lp.clickSubmit();
	logger.info("Click on submitButton");

	
	Thread.sleep(3000);
	
	
	
	DeleteCustomerPage addcust=new DeleteCustomerPage(driver);
	addcust.clickDeleteCustomer();
	logger.info("providing customer details....");

	addcust.custiD("77970");
	addcust.custsubmit();
	
    // Switching to Alert        
	Alert alert = driver.switchTo().alert();
	
	 // Capturing alert message.    
    String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
    System.out.println(alertMessage);	
    Thread.sleep(5000);
    		
    // Accepting alert		
    //alert.accept();	
    alert.dismiss();

	logger.info("deleted customer details....");


}

}