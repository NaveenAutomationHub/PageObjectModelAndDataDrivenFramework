package com.qa.selenium.samples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html?e=2");
boolean b = driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[4]/a")).isEnabled();
String str = driver.getPageSource();
if(str.contains("Contact")){
	
	System.out.println("contact is present");
}
     
		//System.out.println(str);
	/*	List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement a:list){
			
			System.out.println(a.getAttribute("href"));
			if(a.getAttribute("href").equals("https://www.freecrm.com/login.cfm?pr=1")){
				a.click();
			}
		}*/
//driver.quit();
	}

}
