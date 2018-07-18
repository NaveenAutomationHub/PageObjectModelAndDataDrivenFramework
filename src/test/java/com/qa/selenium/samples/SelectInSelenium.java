package com.qa.selenium.samples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Select select = new Select(driver.findElement(By.xpath("//*[@id='continents']")));
		select.selectByVisibleText("Africa");
		select.selectByIndex(5);
		//select.selectByValue(value);
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id='selenium_commands']")));
		select1.selectByVisibleText("Navigation Commands");
		select1.selectByIndex(2);
		List<WebElement> list = select1.getOptions();
		for(WebElement options: list){
			
			System.out.println(options.getText());
		}
		System.out.println("***********************");
        for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i).getText());
		}
        
		driver.findElement(By.xpath("//a/strong[contains(text(),'Partial Link Test')]")).click();
		//select1.selectByValue(value);
		//System.out.println(select.isMultiple());
	}

}
