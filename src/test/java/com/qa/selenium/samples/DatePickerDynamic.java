package com.qa.selenium.samples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		DateFormat dateformat = new SimpleDateFormat("d");
		Date date = new Date();
		String todaydate = dateformat.format(date);
		System.out.println("Current date and day is : " + todaydate);

		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		for (WebElement ele : list) {
			String date1 = ele.getText();
			//System.out.println("todays date is"+date1);
			if (date1.equals(todaydate)) {

				ele.click();
				System.out.println("Current date is selected: "+date1);
				break;
			}}}}
