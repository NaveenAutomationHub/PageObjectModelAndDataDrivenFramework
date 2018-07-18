package com.qa.selenium.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String pageMessage = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(pageMessage);
	}

}
