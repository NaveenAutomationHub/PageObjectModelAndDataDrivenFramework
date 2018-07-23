package com.qa.selenium.samples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DatePickerUsingJSE {
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        /*
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("document.getElementById('datepicker1').value='09/14/2018'");
		jse.executeScript("document.querySelector('#datepicker1').value='09/14/2018'");
		jse.executeScript("document.querySelector('#datepicker2').value='11/27/2018'");*/
		
        driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.querySelector('#onward_cal').value='09/14/2018'");
		
	}

}
