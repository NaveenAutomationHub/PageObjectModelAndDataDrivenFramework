package com.crm.qa.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalendarPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
public class CalendarTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	CalendarPage calendarPage;
	public CalendarTest(){		
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new LoginPage();
		testutil = new TestUtil();
		homepage = new HomePage();
		calendarPage = new CalendarPage();
	}
	@Test(priority=1)
	public void gotoCalendarWeekView() throws InterruptedException{		
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));	
		testutil.switchToFrame();
		homepage.gotoCalendarWeekView();	
		calendarPage.selectDate();
	}
	@AfterMethod()
	public void tearDown() {
		//driver.quit();
		
	}

}
