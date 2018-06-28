package com.qa.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class HowToScollIntoView {
	@Test
	public void howToScollIntoView() {
		
		WebDriver d = new FirefoxDriver();
		d.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		d.manage().window().maximize();
		
		JavascriptExecutor jse= (JavascriptExecutor)d;
		
		WebElement e = d.findElement(By.xpath("//*[@id='mCSB_3_container']/p[5]"));
		jse.executeScript("arguments[0].scrollIntoView(true)", e);
		
	//jse.executeScript("e.value='Java';");
		
		System.out.println(e.getText());
		
	
		
}
}
