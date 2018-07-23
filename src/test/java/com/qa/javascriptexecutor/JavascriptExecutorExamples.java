package com.qa.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutorExamples {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		/*
		 * driver.get(
		 * "http://toolsqa.com/selenium-webdriver/javascript-and-selenium-javascriptexecutor/"
		 * ); driver.manage().window().maximize(); JavascriptExecutor jse=
		 * (JavascriptExecutor)driver; jse.executeScript(
		 * "document.getElementById('trigger-overlay').click()"); 
		 * WebElement e1 = driver.findElement(By.xpath(
		 * "//*[@id='page']/div[1]/header/nav/div/div/form/input[1]"));
		 * jse.executeScript("arguments[0].value='Selenium';", e1);
		 * jse.executeScript(
		 * "document.getElementById('enter element id').checked=false;");
		 */
          //***************************************************************************
		// JavascriptExecutor on multiple webelements
		
		/*driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement e1 = driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]"));
		WebElement e2 = driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]"));
		WebElement e3 = driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
		jse.executeScript("arguments[0].value='naveendommata';arguments[1].value='Welcome@123';arguments[2].click();",
				e1, e2, e3);*/
		//***************************************************************************
		
	}

}
