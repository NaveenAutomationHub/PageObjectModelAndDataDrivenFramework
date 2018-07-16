package com.qa.reports.practice;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class ExtentReportsInDetailed {
	
	ExtentHtmlReporter extenthtmlreporter;
	ExtentReports eReports;
	ExtentTest eTest;
	
	@BeforeTest
	public void startReport(){
		extenthtmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyOwnReport.html");
		eReports = new ExtentReports();
		eReports.attachReporter(extenthtmlreporter);
		
		eReports.setSystemInfo("OS", "Windows 7"); //Operating System Name
		eReports.setSystemInfo("Host Name", "Naveen D"); //Hostname
		eReports.setSystemInfo("Environment", "QA"); //Environment Name
		eReports.setSystemInfo("UserName", "NaveenDommata"); //User Name
		
		extenthtmlreporter.config().setDocumentTitle("Automation testing Extent Reports"); //Report Title
		extenthtmlreporter.config().setReportName("My Own Report");  //Report Name
		extenthtmlreporter.config().setTestViewChartLocation(ChartLocation.TOP); //PIE Chart Location
		extenthtmlreporter.config().setTheme(Theme.DARK);  //Document Theme //PIE Chart Visibility
	}
	
	@Test
	public void demoTestPass(){
		eTest=  eReports.createTest("demoTestPass", "This test will demonstrate the pass test case");
		Assert.assertTrue(true);
	}
	@Test
	public void demoTestPFail(){
		eTest=  eReports.createTest("demoTestFail", "This test will demonstrate the fail test case");
		Assert.assertTrue(false);
		
	}
	@Test
	public void demoTestSkip(){
		
		eTest=  eReports.createTest("demoTestSkip", "This test will demonstrate the skip test case");
		throw new SkipException("This test case is not ready for execution");
	}
	@AfterMethod
	public void getResult(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			eTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ "This test is failed due to below issues", ExtentColor.RED));
			eTest.fail(result.getThrowable());
		}else if(result.getStatus()==ITestResult.SUCCESS){
			eTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+ "This test is Passed", ExtentColor.GREEN));
			
		}else {
				eTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ "This test is Skipped", ExtentColor.YELLOW));
				eTest.skip(result.getThrowable());
			}
	}
	@AfterTest
	public void tearDown(){
		
		eReports.flush();
	}

}
