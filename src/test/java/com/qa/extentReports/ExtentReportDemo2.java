package com.qa.extentReports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo2 
{
         // Create global variable which will be used in all method
	 ExtentReports extent;
	 ExtentTest logger;
	 WebDriver driver;
	
        // This code will run before executing any testcase
	@BeforeMethod
	public void setup()
	{
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/naveen-report.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
	    logger=extent.createTest("LoginTest");
	}
 
	
        // Actual Test which will start the application and verify the title
	@Test
	public void loginTest() throws IOException
	{
		
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("title is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mukesh"));
	}
	
	
	
        // This will run after testcase and it will capture screenshot and add in report
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=Utility.getScreenshot(driver);
			
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		extent.flush();
		driver.quit();
		
	}
	
	
}