package com.qa.selenium.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerStatic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]/td[3]")).click();
		
	}

}
