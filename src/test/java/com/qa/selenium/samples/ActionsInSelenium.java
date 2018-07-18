package com.qa.selenium.samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionsInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Java");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
