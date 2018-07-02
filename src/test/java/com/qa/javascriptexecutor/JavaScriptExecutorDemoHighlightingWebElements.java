package com.qa.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JavaScriptExecutorDemoHighlightingWebElements {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("naveendommata");
		driver.findElement(By.name("password")).sendKeys("Welcome@123");
		
		
	WebElement element1 = driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
	
	
	flash(element1 , driver);
	
	
	element1.click();
	
	driver.switchTo().frame("mainpanel");
	WebElement element2 =driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[1]/a"));
	
	
	flash(element2, driver);
	
	driver.close();
	
	}

	public static void flash(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgColor = element.getCssValue("backgroundColor");
		for(int i=0;i<=1;i++){
			
			changeColor("rgb(255,0,0)",element,driver);
			changeColor(bgColor,element,driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try{
			
			Thread.sleep(2000);
		}catch(InterruptedException e){
			
			System.out.println(e);
		}
		
	}
	
	//***************************************
	
	/*public static void homePage(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		String bgColor = element.getCssValue("backgroundColor");
		for(int i=0;i<=5;i++){
			
			changeColor1("rgb(255,0,0)",element,driver);
			changeColor1(bgColor,element,driver);
		}
	}

	public static void changeColor1(String color, WebElement element, WebDriver driver) {
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try{
			
			Thread.sleep(2000);
		}catch(InterruptedException e){
			
			System.out.println(e);
		}
		
	}
	*/
	


}
