package com.qa.selenium.samples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicSearch {
	
	@Test
	public void JavaSearch() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Java");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sbsb_b']/li/descendant::div[@id='sbse4']"));
		//*[@id='sbse6']/div[2]
		
		System.out.println("total options are "+list.size());
		//*[@id='tsf']/div[2]/div[3]
	}

}
