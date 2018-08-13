package com.crm.qa.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.util.ExtentReporterNG;
import com.crm.qa.util.TestUtil;
@Listeners(ExtentReporterNG.class)
public class SignUpTest  extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	SignUpPage signUpPage;
	public SignUpTest(){		
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new LoginPage();
		testutil = new TestUtil();
		homepage = new HomePage();
		signUpPage = new SignUpPage();
	}
	@Test(priority=1)
	public void gotoSignUpPage() {		
		signUpPage = homepage.gotoSignUpPage();
		signUpPage.verifyURL();
	}
	@Test(priority=2)
	public void fillSignUpDetails() {		
		signUpPage = homepage.gotoSignUpPage();
		signUpPage.fillSignUpDetails();
	}
	@AfterMethod()
	public void tearDown() {
		//driver.quit();	
	}
}
