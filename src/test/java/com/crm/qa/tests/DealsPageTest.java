package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import junit.framework.Assert;

public class DealsPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	DealsPage dealspage;
	TestUtil testutil;
	
	public DealsPageTest(){
		super();
		}
	
	
	@BeforeMethod
	public void setUp(){
	initialization();
	testutil = new TestUtil();
	loginpage = new LoginPage();
	dealspage = new DealsPage();
	homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	testutil.switchToFrame();
				
	}
	
	@Test(priority=1,enabled=false)
	public void gotoDealsPageTest(){
		dealspage = homepage.clickOnDealsLink();
		Assert.assertTrue(dealspage.verifyDealsLabel());
		
	}
	
	@Test(priority=2)
	public void goToNewDealTest(){
		
		dealspage = homepage.goToNewDeal();
		dealspage.newdealsdetails();
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		
	//	driver.quit();
		
		
	}
	
	
}
