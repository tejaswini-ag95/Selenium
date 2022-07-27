package com.selenium.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class WindowHandlePage {
	
	
WebDriver ldriver;
	
	public WindowHandlePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath="//a[contains(text(),'Click Here')]")
	@CacheLookup
	WebElement clickHere;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtEmailId;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement submit;
	
	
	
	
	public void clickAddNewCustomer() {
		clickHere.click();}
		
		public void emailid(String emailid) {
			txtEmailId.sendKeys(emailid);
		}
			
		public void clickSubmit() {
			submit.click();
		}
	
	
}
