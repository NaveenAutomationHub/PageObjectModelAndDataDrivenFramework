package com.qa.screenshots.sample;
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
public class RobotClass {
		@Test
		public void handlingAlerts() throws InterruptedException, IOException, HeadlessException, AWTException {
			WebDriver d = new FirefoxDriver();
			d.get("https://mail.rediff.com/cgi-bin/login.cgi");
			d.manage().window().maximize();
			d.findElement(By.name("proceed")).click();
			Alert a =d.switchTo().alert();
			System.out.println("text on the window is : "+ a.getText());
			Thread.sleep(5000);
			
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		     ImageIO.write(image, "png", new File("Screenshot//reddif.png")); 
			
			/*File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);	 
			 try{
				 FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//screenshots//redbus1.jpg"));
			 }catch(Exception e){
				 
				 System.out.println(e.getMessage());
			 }*/
	}	

	}


