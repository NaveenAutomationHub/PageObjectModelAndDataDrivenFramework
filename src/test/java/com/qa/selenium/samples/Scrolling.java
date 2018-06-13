package com.qa.selenium.samples;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Scrolling {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='trigger-overlay']")).click();
		driver.findElement(By.xpath("//*[@id='page']/div[1]/header/nav/div/div/form/input[1]")).sendKeys("Naveen");
		
		WebElement w = driver.findElement(By.xpath("//*[@id='page']/div[1]/header/nav/div/div/form/input[1]"));
		
		Thread.sleep(2000);
		
		
          JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollTo(0,1750)");
		
		jse.executeScript("arguments[0].value='D'", w);
		
		jse.executeScript("window.scrollTo(1750,0)");
		Thread.sleep(2000);
		
		jse.executeScript("arguments[0].value='NaveenReddy'", w);
		
		jse.executeScript("document.body.style.zoom='200%'");
File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile1, new File(System.getProperty("user.dir")+"\\screenshots\\screenshot1.jpg"));
		
		
	}

}
