package com.qa.readingPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingPropertiesFile {
	
		public static void main(String[] args) {
			Properties prop = new Properties();
			try {
				
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/"
						+ "java/com/qa/readingPropertiesFile/config.properties");
				prop.load(fis);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			WebDriver driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath("//*[@type='password']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//*[@type='submit']")).submit();
		}

	}

	


