package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BaseClass {

	
	public String baseURL="https://demo.guru99.com/v4/index.php";
	public String username="mngr424648";
	public String password="uvUzUdU";
	
	
	
	
	//window handle
	public String url="http://demo.guru99.com/popup.php";

	
	
	ChromeDriver driver;
	
	
	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejaswini A G\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	  // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	   
	   driver.get(baseURL);
	
	
	
	   
	   
	   //window handle
	//driver.get(url);

	}
	
	
	
	
	
}

