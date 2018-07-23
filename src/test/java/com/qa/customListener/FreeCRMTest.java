package com.qa.customListener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class FreeCRMTest {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
CustomListener cl = new CustomListener();

efwd.register(cl);
efwd.get("https://www.freecrm.com/index.html");
efwd.manage().window().maximize();
efwd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
efwd.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
efwd.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
efwd.findElement(By.xpath("//*[@type='submit']")).submit();
efwd.unregister(cl);
		
	}

}
