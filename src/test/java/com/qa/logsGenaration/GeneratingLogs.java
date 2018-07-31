package com.qa.logsGenaration;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GeneratingLogs {
	
	//What is log? : capturing info/activities at the time of program execution. 
		// types of logs:
			//1. info
			//2. warn
			//3. debug
			//4. fatal
			
		//how to generate the logs? : use Apache log4j API (log4j jar)
		//How it works? : it reads log 4j configuration from log4j.properties file
		//where to create: create inside resources folder
	public static void main(String[] args) {
		Logger log=	Logger.getLogger(GeneratingLogs.class);		
		WebDriver driver = new FirefoxDriver();
		log.info("Browser opened");
		driver.get("https://www.freecrm.com/index.html");
		log.info("navigated to free page");
		
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		log.info("successfully logged into free CRM");
		driver.quit();

		}


}
