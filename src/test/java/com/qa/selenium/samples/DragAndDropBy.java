package com.qa.selenium.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver = new FirefoxDriver();
		
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		WebElement loanamount = driver.findElement(By.cssSelector("#loanamount"));
		WebElement loaninterest = driver.findElement(By.cssSelector("#loaninterest"));
		WebElement loanterm = driver.findElement(By.cssSelector("#loanterm"));
		
		System.out.println(loanamount.getAttribute("value"));
		System.out.println(loaninterest.getAttribute("value"));
		System.out.println(loanterm.getAttribute("value"));
		
		Actions actions = new Actions(driver);
		
		WebElement homeloanamount = driver.findElement(By.cssSelector("#loanamountslider>span"));
		WebElement loaninterestrate = driver.findElement(By.cssSelector("#loaninterestslider>span"));
		WebElement loantenure = driver.findElement(By.cssSelector("#loantermslider>span"));
		
		
		Thread.sleep(2000);
		actions.dragAndDropBy(homeloanamount, 150, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(loaninterestrate, 150, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(loantenure, -110, 0).build().perform();
		Thread.sleep(2000);
		
		System.out.println(loanamount.getAttribute("value"));
		System.out.println(loaninterest.getAttribute("value"));
		System.out.println(loanterm.getAttribute("value"));
		
	}

}
