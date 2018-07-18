package com.qa.handlingwindowsandalerts;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class HandlingWindows {
	@Test
	public void handlingWindowPopups() throws InterruptedException{
		
		WebDriver d = new FirefoxDriver();
		d.get("http://www.popuptest.com/goodpopups.html");
		d.manage().window().maximize();
		d.findElement(By.linkText("Good PopUp #1")).click();
		Thread.sleep(5000);
		d.findElement(By.linkText("Good PopUp #3")).click();
		d.findElement(By.linkText("Good PopUp #2")).click();
		Set<String> set = d.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String parentWindow = itr.next();
		//Thread.sleep(5000);
		String childWindow1 = itr.next();
		System.out.println(parentWindow);
		System.out.println(childWindow1);
	//Thread.sleep(5000);
		String childWindow2 = itr.next();
		//Thread.sleep(5000);
		
		//Thread.sleep(5000);
		String childWindow3 = itr.next();
		d.switchTo().window(childWindow3);
		d.close();
		d.switchTo().window(childWindow2);
		d.close();
		d.switchTo().window(childWindow1);
		d.close();
		
		d.quit();
		
	}
}
