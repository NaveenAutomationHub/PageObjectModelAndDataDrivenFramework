package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;

import com.crm.qa.pages.DocPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class DocPageTest extends TestBase{
	
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	DocPage docpage;
	TestUtil testutil;
	
	public DocPageTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		docpage = new DocPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		testutil.switchToFrame();
		
		docpage = homepage.clickOnDocLink();
		
	}
	
	@Test(priority=1)
	public void docPageTest(){
		
		docpage.newDocument();
	}
	
	
	@AfterMethod()
	public void tearDown() {
		
		driver.quit();
		
	}
	

}
