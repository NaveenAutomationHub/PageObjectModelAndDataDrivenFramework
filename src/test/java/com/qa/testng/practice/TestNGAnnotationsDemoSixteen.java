package com.qa.testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;


public class TestNGAnnotationsDemoSixteen {
	
	
	// parallel testing
	
	
	
	WebDriver driver;
	WebDriver driver1;
	WebDriver driver2;
	@Test(description="FirstTest", enabled=false )
	public void testLogin(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		
	}	
	
	@Test(description="SecondTest")
	public void testLogin2(){
		
		driver1 = new FirefoxDriver();
		driver1.get("https://www.freecrm.com/index.html");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
		driver1.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver1.findElement(By.xpath("//*[@type='submit']")).submit();
		
	}	
	
	@Test(description="ThirdTest", enabled=false)
	public void testLogin3(){
		
		driver2 = new FirefoxDriver();
		driver2.get("https://www.freecrm.com/index.html");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
		driver2.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver2.findElement(By.xpath("//*[@type='submit']")).submit();
		
	}	
	
}