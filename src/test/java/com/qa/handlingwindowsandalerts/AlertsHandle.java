package com.qa.handlingwindowsandalerts;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertsHandle {
	@Test
	public void handlingAlerts() throws InterruptedException, IOException, HeadlessException, AWTException {
		WebDriver d = new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.manage().window().maximize();
		d.findElement(By.name("proceed")).click();
		Alert a =d.switchTo().alert();
		System.out.println("text on the window is : "+ a.getText());
		Thread.sleep(5000);
		//a.accept();
		//a.dismiss();
		//d.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/a")).click();
		//d.close();
		 BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	     ImageIO.write(image, "png", new File("Screenshot//reddif.png")); 
		
}	
}
