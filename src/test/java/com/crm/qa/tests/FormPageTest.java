package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FormPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

@Listeners(com.crm.qa.util.ExtentReporterNG.class)
public class FormPageTest extends TestBase{
	
	TestUtil testutil;
	LoginPage loginpage;
	HomePage homepage;
	FormPage formpage;
	public FormPageTest(){
		
		super();
		
		
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		formpage = new FormPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
		
	}
	
	@Test
	public void feedbackFormPageTest(){
		
		formpage = homepage.clickOnForm();
		formpage.fillTheForm();
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}

}
