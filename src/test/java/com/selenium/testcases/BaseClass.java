package com.selenium.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.utilities.ReadConfig;



public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
	
	public String url=readconfig.getURL();



//	without readconfig file
	
//	public String baseURL="https://demo.guru99.com/v4/index.php";
//	public String username="mngr424648";
//	public String password="uvUzUdU";
//	//window handle
//	public String url="http://demo.guru99.com/popup.php";

	 
	
	ChromeDriver driver;
	
	//log4j
	public static Logger logger;

	//Run testcases on desired browser
	@Parameters("browser")

	@BeforeClass
	//public void invokeBrowser()
	
	//Run testcases on desired browser
public void invokeBrowser(String br)

	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejaswini A G\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		//using readconfig file
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());

		driver=new ChromeDriver();
	
	//log 4j properties
	logger = Logger.getLogger("selenium");
	PropertyConfigurator.configure("Log4j.properties");
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	  // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	   
	   driver.get(baseURL);
	
	
	
	   
	   
	   //window handle
	//driver.get(url);

	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	
	
}
	
	


