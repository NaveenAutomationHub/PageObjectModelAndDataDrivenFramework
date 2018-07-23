package com.qa.javascriptexecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class JavaScriptExamplesinSelenium {
	@Test
	public void howToScollIntoView() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		/*
		jse.executeScript("window.scrollTo(0,3500);");
		WebElement e1 = driver.findElement(By.xpath("//*[contains(text(),'Jobs in India')]"));
		jse.executeScript("arguments[0].click();", e1);*/
		

		String str = jse.executeScript("return document.getElementById('primary-menu').innerHTML").toString();
		System.out.println(str);
		
		//refresh a window:
		jse.executeScript("history.go(0)");
		
		//get the title of the WebPage:
		String text = jse.executeScript("return document.title").toString();
		System.out.println("Page Title is : "+ text);
		
		//scroll till the bottom of the web page:
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//navigate back to page:
		jse.executeScript("window.history.back()");

		//navigate forward to next page:
				jse.executeScript("window.history.forward()");
				
			//	Zoom IN and Zoom OUT in selenium:
				jse.executeScript("document.body.style.zoom='200%'");
				jse.executeScript("document.body.style.zoom='40%'");

		
		//get the text of a particular web element:
		/*driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//*[@id='mCSB_3_container']/p[5]"));
		jse.executeScript("arguments[0].scrollIntoView(true)", e);	
		System.out.println(e.getText());
		Thread.sleep(5000);*/
	
		
}
}
