package com.qa.reports.practice;


import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import com.qa.reports.practice.Utility;



public class DealsPageTest2 extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	DealsPage dealspage;
	TestUtil testutil;
	ExtentReports extent;
	ExtentTest logger;
	
	
	
	public DealsPageTest2(){
		super();
		}
	
	
	@BeforeMethod
	public void setUp(){
		
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/learn_automation2.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	  
	initialization();
	testutil = new TestUtil();
	loginpage = new LoginPage();
	dealspage = new DealsPage();
	homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	testutil.switchToFrame();
				
	}
	
	@Test(priority=1)
	public void gotoDealsPageTest(){
		
		logger=extent.createTest("Label Check");
		
		dealspage = homepage.clickOnDealsLink();
		Assert.assertTrue(dealspage.verifyDealsLabel());
		
	}
	
	@Test(priority=2)
	public void goToNewDealTest(){
		
		logger=extent.createTest("New Deals Page");
		dealspage = homepage.goToNewDeal();
		dealspage.newdealsdetails();
		
		
	}
	
	
	


	@AfterMethod
	public void tearDown(ITestResult result) throws IOException 
	{
		
		
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=Utility.getScreenshot(driver);
			
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			
		}else if(result.getStatus()==ITestResult.SUCCESS){
			
              String temp=Utility.getScreenshot(driver);
			
			logger.pass(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		
		
		extent.flush();
		driver.quit();
		
	}


	
	
	
	
}
