package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import junit.framework.Assert;
@Listeners(com.crm.qa.util.ExtentReporterNG.class)
public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	TestUtil testutil;
	
		public HomePageTest(){
								
		super();
		}
		
		@BeforeMethod
		public void setUp(){
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
						
		}
		
		@Test(priority=1)
		public void verifyHomePageTitleTest(){
			
			String homepageTitle = homepage.verifyHomePageTitle();
			
			Assert.assertEquals(homepageTitle, "CRMPRO");
		}
		
		@Test(priority=2)
		public void verifyUserNameTest(){
			testutil.switchToFrame();
			
			Assert.assertTrue(homepage.verifyUserName());
			
		}
		
		@Test(priority=3)
		public void clickonContactsTest(){
			testutil.switchToFrame();
			contactspage = homepage.clickOnContactsLink();
			
		}
		
		
		@AfterMethod
		public void tearDown(){
			
			driver.quit();
		}
		
		}
