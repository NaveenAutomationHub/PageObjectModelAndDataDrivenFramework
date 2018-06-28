package com.qa.handlingwindowsandalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertsHandle {
	@Test
	public void handlingAlerts() throws InterruptedException {
		
		WebDriver d = new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.manage().window().maximize();
		d.findElement(By.name("proceed")).click();
		Alert a =d.switchTo().alert();
		System.out.println("text on the window is : "+ a.getText());
		
		Thread.sleep(5000);
		
		//a.accept();
		//d.close();
		d.switchTo().defaultContent();
		
		
}
	
	
	
}
