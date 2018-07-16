package com.qa.reports.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreatingLogsInExtentReports {

	ExtentHtmlReporter extenthtmlreporter;
	ExtentReports eReports;
	ExtentTest eTest;
	
	@BeforeTest
	public void startReport(){
		extenthtmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyOwnReport.html");
		eReports = new ExtentReports();
		eReports.attachReporter(extenthtmlreporter);
		
	}
	
	@Test
	public void logGeneration(){
		
		eTest = eReports.createTest("Log Generation");
		eTest.log(Status.INFO, "createTest() method will return the ExtentTest Object");
		eTest.log(Status.INFO, "I am in actual test");
		eTest.log(Status.INFO, "We can write actual test test login in this test");
		
		eTest.info(MarkupHelper.createLabel("*********Using Lables", ExtentColor.RED));
		eTest.info(MarkupHelper.createLabel("This is the test logger 1", ExtentColor.BLUE));
	}
	@AfterTest
	public void tearDown(){
		eReports.flush();
		
	}
}
