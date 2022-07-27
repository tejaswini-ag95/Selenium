/**
 * 
 */
package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Tejaswini A G
 *
 */
public class LoginPage {
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	
	//public void setUserName(String username) {
//	public void setPassword(String password) {
//	public void clickSubmit() {

	
	
	
	
//	public void clickSubmit()
	
	
//	public void clickSubmit() 
//
//	{
//		btnLogin.click();
//	}	
//	
//	public void clickLogout()
//	{
//		lnkLogout.click();
//	}
	
	public void setUserName(String username)
	{
		txtUserName.sendKeys(username);
		 new WebDriverWait(ldriver,10).until(ExpectedConditions.visibilityOf(txtUserName));

	
	}
	


	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	
	
public void clickSubmit()
{
	Actions action=new Actions(ldriver);
	action.moveToElement(btnLogin);
	try	{
		Thread.sleep(1000);
		action.click().build().perform();
	}
	catch(Exception e) {
	//firstTimeInvestingWithUs.click();
	System.out.println(e);
	}
}
}