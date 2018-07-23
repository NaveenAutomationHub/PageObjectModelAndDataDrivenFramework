package com.qa.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) {
		
	Logger log=	Logger.getLogger("Google");
	PropertyConfigurator.configure("E://Eclipse workspaces/TaskManagement/PageObjectModelAndDataDrivenFramework/src/test/java/com/qa/log4j/log4j.properties");
	
	WebDriver driver = new FirefoxDriver();
	log.info("Browser opened");
	driver.get("https://www.freecrm.com/index.html");
	log.info("navigated to free page");
	
	driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
	driver.findElement(By.xpath("//*[@type='submit']")).submit();
	log.info("successfully logged into free CRM");

	}

}
