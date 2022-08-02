package com.selenium.testcases;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.testng.annotations.Test;

import com.selenium.pageobjects.LoginPage;
import com.selenium.pageobjects.WindowHandlePage;

@Test
public class WindowHandleTest extends BaseClass {
	
	
	public void WindowHandleTest() 
	{
		driver.get(url);
		logger.info("URL is opened");

		WindowHandlePage wh=new WindowHandlePage(driver);
wh.clickAddNewCustomer();
logger.info("child window is opened");

String MainWindow=driver.getWindowHandle();	
//To handle all new opened window.				
Set<String> s1=driver.getWindowHandles();	

java.util.Iterator<String> i1=s1.iterator();	

while(i1.hasNext())			
{		
String ChildWindow=i1.next();		
		
if(!MainWindow.equalsIgnoreCase(ChildWindow))			
{    		
     
        // Switching to Child window
        driver.switchTo().window(ChildWindow);
String email="fggfgffg"+"@gmail.com"; 
wh.emailid(email);
wh.clickSubmit();
// Closing the Child Window.
driver.close();	
logger.info("child window is closed");

}		
}		
// Switching to Parent window i.e Main Window.
driver.switchTo().window(MainWindow);


}
}

