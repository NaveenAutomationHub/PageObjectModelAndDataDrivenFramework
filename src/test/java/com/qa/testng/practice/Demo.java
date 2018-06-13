package com.qa.testng.practice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
  @Test(invocationCount=2)
  @Parameters({"url","username","password"})
  public void function(String url, String username, String password) {
	  
	  WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		
		String str = driver.getTitle();
		System.out.println(str);
		
		
  }
}
