package com.qa.selenium.samples;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindow {
 
		public static WebDriver driver;
 
		public static void main(String[] args) {
 
	        driver = new FirefoxDriver();
 
	       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
          
          WebElement element1 = driver.findElement(By.xpath("//button[@id='button1']"));
 
         
          element1.click();
          
	      Set<String> set =  driver.getWindowHandles();
 
	      Iterator<String>  itr = set.iterator();
	      
	    String str1 =   itr.next();
	    String str2 =  itr.next();
	    
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    
	    driver.switchTo().window(str1);
	      
	     WebElement element2 = driver.findElement(By.xpath("//*[@id='content']/p[3]/button"));
	     element2.click();
	     
	     String str3 =  itr.next();
	     
	     driver.switchTo().window(str3);
	     driver.close();
	      
 
	}
 
}