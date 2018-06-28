package com.qa.selenium.samples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Zoomin {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.className("gsfi"));
		
		String str = e.getAttribute("type");
		
		System.out.println(str);
		
		
/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		
		jse.executeScript("document.body.style.zoom='200%'");*/

		
	}

}
