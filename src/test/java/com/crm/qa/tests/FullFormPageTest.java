package com.crm.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FullFormPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class FullFormPageTest extends TestBase {

	
	TestUtil testutil;
	LoginPage loginpage;
	HomePage homepage;
	FullFormPage fullformPage;
	
	
	public FullFormPageTest(){
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
		
	}
	
	@Test
	public void feedbackFormPageTest() throws InterruptedException{
		
		fullformPage = homepage.gotoFullFormPage();
		fullformPage.filltheForm();
		
		
		
	
		
	}
	
}
