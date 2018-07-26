package com.qa.testng.practice2.DataDriven;
import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.qa.testng.practice2.DataDriven.ExtentReporterNG.class)
public class CreateNewCompany {
	
	public WebDriver driver;
	@BeforeMethod
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();			
	}
	
	@DataProvider
	public Iterator<Object[]> getDataFromExcel(){
		ArrayList<Object[]> data = TestUtility.readLoginDataFromExcel();
		return data.iterator();
	}
	@Test(dataProvider="getDataFromExcel")
	public void loginTest(String uname, String pwd){

		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		System.out.println(driver.getTitle());
		
	}
	}
