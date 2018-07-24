package com.qa.selenium.samples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class HeadLessBrowser {
	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		String str = driver.getTitle();
		System.out.println(str);	
	}

}
