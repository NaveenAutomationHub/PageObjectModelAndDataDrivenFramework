package com.qa.selenium.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new FirefoxDriver();
driver.get("http://toolsqa.com/selenium-webdriver/running-test-in-ie-explorer/");
driver.manage().window().maximize();
System.out.println(driver.findElement(By.xpath("//*[@id='page']/div[4]/div/div/div/div[1]/h1")).getText());

System.out.println(driver.findElement(By.xpath("//*[@id='page']/div[4]/div/div/div/div[1]/h1")).getAttribute("class"));
System.out.println(driver.findElement(By.xpath("//*[@id='primary-menu']/li[5]/a/span[1]/span/span")).isDisplayed());
driver.findElement(By.xpath("//*[@id='presscore-custom-menu-2-11']/ul/li[2]/ul/li[1]/a/span")).click();

System.out.println(driver.getPageSource().contains("QA"));


	}

}
