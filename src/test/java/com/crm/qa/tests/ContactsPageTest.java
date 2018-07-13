package com.crm.qa.tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	TestUtil testutil; 
	
	
	
		public ContactsPageTest(){
				super();
			}

		@BeforeMethod
		public void setUp(){
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		contactspage = new ContactsPage();
		
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		testutil.switchToFrame();
		contactspage = homepage.clickOnContactsLink();		
		}
		
		@Test(priority=1,enabled=false)
		public void verifyContactsLabelTest(){
			
			Assert.assertTrue(contactspage.verifyContactsLabel(), "ContactsLabel is missing on the page");
		}
		
		@Test(priority=2)
		public void selectContactsByNameTest(){
			
			contactspage.selectContactsByName("naveen a");
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		}
