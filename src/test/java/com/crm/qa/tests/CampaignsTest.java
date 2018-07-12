package com.crm.qa.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class CampaignsTest extends TestBase{
	
	LoginPage loginpage ;
	HomePage homepage;
	TestUtil testutil; 
	
	
	public CampaignsTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		testutil = new TestUtil();
		 loginpage = new LoginPage();
		 homepage = new HomePage();
		 testutil = new TestUtil();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void compaignsTest() throws InterruptedException {
		
		homepage.gotoCampaignspages();
		System.out.println("test passed");	
	}
	
}
