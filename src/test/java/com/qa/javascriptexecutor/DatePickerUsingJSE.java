package com.qa.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DatePickerUsingJSE {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        
        //http://seleniumpractice.blogspot.com/
        //http://demo.automationtesting.in/Register.html

        
      //Method -1
        /*
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("document.getElementById('datepicker1').value='09/14/2018'");
		jse.executeScript("document.querySelector('#datepicker1').value='09/14/2018'");
		jse.executeScript("document.querySelector('#datepicker2').value='11/27/2018'");*/
		
      //Method -2
      /*  driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.querySelector('#onward_cal').value='09/14/2018'");*/
		
		//Method -3
        driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String date = "20/09";
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	     jse.executeScript("arguments[0].setAttribute('value','"+date+"');",ele);
	  //  jse.executeScript("document.getElementById('datepicker1').setAttribute('date', '20/09');");
		
		
	}

}
