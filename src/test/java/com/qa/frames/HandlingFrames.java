package com.qa.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingFrames {
	
	@Test
	public void handlingFrames() throws InterruptedException {
		
		WebDriver d = new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.manage().window().maximize();
		
		//WebElement e = d.findElement(By.cssSelector("div.advertisement-area iframe"));
		WebElement e = d.findElement(By.xpath("//iframe[contains(src,'//im.rediff.com/template/meta/lgnad_new_1.htm?purl1=1')]"));
		Thread.sleep(5000);
		d.switchTo().frame(e);
		d.findElement(By.xpath("//*[@id='map']/area[5]")).click();
		
}

}
