package com.qa.selenium.samples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropSlider {
	public static void main(String[] args) {
	       WebDriver driver = new FirefoxDriver();		
			driver.get("http://demo.automationtesting.in/Slider.html");
			driver.manage().window().maximize();
			WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/a"));			
			Actions actions = new Actions(driver);		
			actions.dragAndDropBy(slider, 500, 0).build().perform();
			//actions.clickAndHold(slider).moveByOffset(534, 301).release().perform();		
			//slider.click();
}}
