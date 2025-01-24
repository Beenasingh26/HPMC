package com.genericLibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest implements IAutoConstant{
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeSuite
	public void toConnectServer()
	{
		Reporter.log("Server connected successfully",true);
	}
	
	@BeforeTest
	public void toConnectDatabase()
	{
		Reporter.log("Database connected successfully",true);
	}
	
	@BeforeClass
	public void setup() throws IOException, EncryptedDocumentException, InterruptedException
	{
		
		
		FLib f=new FLib();
		String broswer = f.getDataFromPropertyFile(PROP_FILE, "browser");
		String url = f.getDataFromPropertyFile(PROP_FILE, "url");
		
		Reporter.log("Lunching "+broswer+" browser",true);
		
		if(broswer.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(broswer.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(broswer.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
/*
	@BeforeClass
	@Parameters({"browser", "url"})
	void setup(String br, String url) throws IOException, InterruptedException {
	
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver();
		break;
		case "edge": driver = new EdgeDriver();
		break;
		case "firefox": driver = new FirefoxDriver();
		default: System.out.println("Invalid Browser");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
	}
*/
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		Reporter.log("Browser closed successfully",true);
	}
	
	@AfterTest
	public void toCloseDatabase()
	{
		Reporter.log("Database Closed successfully");
	}
}
