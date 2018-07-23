package com.qa.screenshots.sample;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ScreenshotSample {
	public static void main(String[] args) {
		  WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.redbus.in"); 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
		 try{
			 FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//screenshots//redbus1.jpg"));
		 }catch(Exception e){
			 
			 System.out.println(e.getMessage());
		 }
}
}