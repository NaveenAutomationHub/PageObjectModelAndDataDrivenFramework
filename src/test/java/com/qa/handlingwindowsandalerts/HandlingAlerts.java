package com.qa.handlingwindowsandalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingAlerts {

	
	@Test
	public void handlingAlerts() {
		
		WebDriver d = new FirefoxDriver();
		d.get("http://ksrtc.in/oprs-web/");
		d.manage().window().maximize();
		d.findElement(By.id("searchBtn")).click();
		Alert a =d.switchTo().alert();
		a.getText();
		a.accept();
		d.findElement(By.id("fromPlaceName")).sendKeys("HYDERABAD");
		d.findElement(By.id("toPlaceName")).sendKeys("BANGALORE");
		
		
}
	
}
