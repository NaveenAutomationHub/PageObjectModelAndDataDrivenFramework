package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/"
				+ "java/com/crm/qa/config/config.properties");
			
		prop.load(fis);
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		}

	public void initialization() {
		
		String browserType = prop.getProperty("browser");
		if(browserType.equalsIgnoreCase("firefox")){
			
			driver = new FirefoxDriver();
		}if(browserType.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMOUT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

	
	

}

