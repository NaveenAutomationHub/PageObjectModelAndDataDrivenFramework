package com.qa.testng.practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RedBus {
	
	@Test
	public void redBus() {
		  
		  WebDriver driver = new FirefoxDriver();
			driver.get("https://www.redbus.in/");
			driver.manage().window().maximize();
			String str = driver.getTitle();
			System.out.println(str);	
	}

}
