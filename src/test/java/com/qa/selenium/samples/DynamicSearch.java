package com.qa.selenium.samples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicSearch {
	
	@Test
	public void JavaSearch() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Java");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li/descendant::div[@id='sbse4']"));
		//*[@id='sbse6']/div[2]
		
		System.out.println("total options are "+list.size());
		//*[@id='tsf']/div[2]/div[3]
	}

}
