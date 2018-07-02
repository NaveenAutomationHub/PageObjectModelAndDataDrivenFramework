package com.crm.qa.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ReportsPage;
import com.crm.qa.util.TestUtil;

public class ReportsTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ReportsPage reports;
	TestUtil testutil;
	
	public ReportsTest(){
		
		super();
	}
	@BeforeMethod
	public void setUp(){
		
		
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		testutil = new TestUtil();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
			
		
	}
	
	@Test
	public void ImportPageTest(){

	    homepage.ReportsLink();
		
		
	}

}
