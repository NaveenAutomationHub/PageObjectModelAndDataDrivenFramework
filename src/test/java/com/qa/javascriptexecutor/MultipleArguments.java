package com.qa.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleArguments {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement e1 = driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]"));
		WebElement e2 = driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]"));
		WebElement e3 = driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
		jse.executeScript("arguments[0].value='naveendommata';arguments[1].value='Welcome@123';arguments[2].click();",
				e1, e2, e3);
		jse.executeScript("history.go(0)");
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
