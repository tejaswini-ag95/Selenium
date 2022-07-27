package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	
WebDriver ldriver;
	
	public DeleteCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//body/div[3]/div[1]/ul[1]/li[4]/a[1]")
	@CacheLookup
	WebElement delCustid;
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement txtCusId;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement submit;
	
	public void clickDeleteCustomer() {
		delCustid.click();
			
	}
	
	public void custiD(String cname) {
		txtCusId.sendKeys(cname);
		
	}
	public void custsubmit() {
		submit.click();
	}

}
