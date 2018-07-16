package com.qa.reports.practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CapturingScreenshotInReports {
	
	ExtentHtmlReporter extenthtmlreporter;
	ExtentReports eReports;
	ExtentTest eTest;
	WebDriver driver;
	
	@BeforeTest
	public void startReport(){
		extenthtmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyOwnReport.html");
		eReports = new ExtentReports();
		eReports.attachReporter(extenthtmlreporter);
		
	}
	
	@Test
	public void captureScreenshot(){
		eTest = eReports.createTest("Capture ScreenShot");
		driver=new FirefoxDriver();
		driver.get("https://portal1.passportindia.gov.in/AppOnlineProject/statusTracker/trackStatusInpNew");
		driver.manage().window().maximize();
		System.out.println("title is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Naveen"));
		
	}
	@AfterMethod
	public void getResult(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
			
			String screenShotPath = GetScreenShot.getScreenshot(driver);
			eTest.fail(MarkupHelper.createLabel(result.getName() +" Test Case Failed", ExtentColor.RED));
			eTest.fail(result.getThrowable());
			eTest.fail("SnapShot below: "+eTest.addScreenCaptureFromPath(screenShotPath));
		}
		eReports.flush();
		
			}
	
	@AfterTest
	public void tearDown(){
		//driver.quit();
	}
}
