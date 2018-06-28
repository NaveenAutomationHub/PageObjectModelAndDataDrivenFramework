package com.crm.qa.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewCallPage;
import com.crm.qa.util.TestUtil;

public class NewCallPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	TestUtil testutil;
	
	NewCallPage newcallpage;
	
	public NewCallPageTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
	
		testutil = new TestUtil();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		testutil.switchToFrame();
		
	}
	
	
	
	@Test
	public void loginTest() throws InterruptedException{
		newcallpage = homepage.ClickOnNewCallLink();
		newcallpage.fillCallInformationPage();
		
		
	}
	
}
