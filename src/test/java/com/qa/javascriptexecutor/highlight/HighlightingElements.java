package com.qa.javascriptexecutor.highlight;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HighlightingElements {
	public static void main(String []args){	 
		WebDriver driver=new FirefoxDriver(); 
		driver.manage().window().maximize();	 
		driver.get("https://www.freecrm.com/index.html");	 
		// Inspect element
		WebElement uname = driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]"));
		// Call reuse method
		highLightElement(driver,uname);
		uname.sendKeys("naveendommata");
		WebElement pwd = driver.findElement(By.xpath("//*[@type='password']"));
		highLightElement(driver,pwd);
		pwd.sendKeys("Welcome@123");
		WebElement submit = driver.findElement(By.xpath("//*[@type='submit']"));
		highLightElement(driver,submit);
		submit.click();
		}
		 
		// Element highlighter code
		public static void highLightElement(WebDriver driver, WebElement element)
		{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		 
		try 
		{
		Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
		 
		System.out.println(e.getMessage());
		} 
		 
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
		 
		}
		 
		}

