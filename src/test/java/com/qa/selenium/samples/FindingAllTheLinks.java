package com.qa.selenium.samples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindingAllTheLinks {
	
	
	
	@Test
	public void Linkstest(){
		
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement e =d.findElement(By.id("lst-ib"));
		
		e.sendKeys("S2tech");
		
		e.sendKeys(Keys.ENTER);
		//e.submit();
		
		String str = d.getCurrentUrl();
		
		System.out.println(str);
		
		List<WebElement> list =d.findElements(By.tagName("a"));
		
		for(WebElement l:list){
			
			System.out.println(l.getAttribute("href"));
		}
		
		
		
		
		for(int i=0;i<list.size();i++){
			
			if(list.get(i).isEnabled()){
				
				System.out.println(list.get(i).getAttribute("href"));
			}
			
		}
		
		
		//System.out.println(list.size());
		
	}

}
