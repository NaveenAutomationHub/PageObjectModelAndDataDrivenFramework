package com.qa.selenium.samples;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class HandlingKeyboard {
	@Test
	public void JavaSearch() throws InterruptedException{
		 WebDriver driver = new FirefoxDriver();
			driver.get("https://www.freecrm.com/index.html");
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("HELLO WORLD");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//*[@type='submit']")).sendKeys(Keys.ENTER);
		driver.switchTo().frame("mainpanel");
		WebElement e1 =driver.findElement(By.xpath("html/body/table[1]/tbody/tr[4]/td/form/table/tbody/tr/td[2]/div/input[3]"));
		e1.sendKeys("HELLO WORLD");
		Thread.sleep(5000);
		e1.sendKeys(Keys.chord(Keys.CONTROL,"Z"));
	}
}
