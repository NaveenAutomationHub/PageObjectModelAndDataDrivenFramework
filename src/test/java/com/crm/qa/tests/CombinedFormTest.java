package com.crm.qa.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.FormPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;



	
	public class CombinedFormTest extends TestBase{
		
		TestUtil testutil;
		LoginPage loginpage;
		HomePage homepage;
		FormPage formpage;
		CompaniesPage companiesPage;
		
		
		public CombinedFormTest(){
			
			super();
			
		}
		
		@BeforeMethod
		public void setUp(){
			
			initialization();
			testutil = new TestUtil();
			loginpage = new LoginPage();
			formpage = new FormPage();
			companiesPage = new CompaniesPage();
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			testutil.switchToFrame();
			
		}
		
		@Test
		public void feedbackFormPageTest() throws InterruptedException{
			
			companiesPage = homepage.combinedLink();
			companiesPage.fillCombinedCompanyForm();
			
		
			
		}
		
		
}
	

