package com.qa.selenium.samples;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;
	
	public class WiatingInSelenium {
		@Test
		public void JavaSearch() throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.icicibank.com/");
			driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
			
			//Thread.sleep(5000);
			/*
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         WebDriverWait wait = new WebDriverWait(driver,10);
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));*/
			
			
		}

	}


