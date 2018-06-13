package com.qa.selenium.samples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTables {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr/td[1]"));
		List<WebElement> list2 = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr/td[5]"));
		/*
		
		for(WebElement a: list1){
			
			//System.out.println(a.getText());
			
			 for(WebElement a1: list2){
				
				if( a.getText().equals("Saudi Arabia")){
					
                	  System.out.println(a1.getText());
                  }

				}
			
		}
	*/
		
		
	
		
		for(int i=0;i<list1.size();i++){
			
			if(list1.get(i).getText().equals("Saudi Arabia")){
				
				System.out.println(list2.get(i).getText());
			}
			
		}
		
		
	}

}
