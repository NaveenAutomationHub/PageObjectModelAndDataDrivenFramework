package com.crm.qa.tests;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginpage;
	
	HomePage homepage;
	
	public LoginTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	}
	
	@Test(priority=2)
	public void loginTest(){
		
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		String title = loginpage.validateHomePageTitle();
		
		Assert.assertEquals(title, "CRMPRO");
		
	}
	@AfterMethod()
	public void tearDown() {
		driver.quit();
		
	}
	
}
