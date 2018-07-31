package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WaitingInSelenium {

	
	@Test
	public void handlingAlerts() throws InterruptedException {
		
		WebDriver d = new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.manage().window().maximize();
		
		/*WebElement e = d.findElement(By.cssSelector("div.advertisement-area iframe"));
		d.switchTo().frame(e);
		d.findElement(By.xpath("//*[@id='map']/area[5]")).click();*/
		d.findElement(By.xpath("//a[contains(text(),'Disclaimer')]")).click();
}
	
	
	
}
