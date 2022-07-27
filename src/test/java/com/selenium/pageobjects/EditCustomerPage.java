package com.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	@CacheLookup
	WebElement editCustid;
	
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement txtCusId;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement submit;
	
	
	public void clickEditCustomer() {
		editCustid.click();
			
	}
	
	public void custiD(String cname) {
		txtCusId.sendKeys(cname);
		
	}
	public void custsubmit() {
		submit.click();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	

}
