package com.qa.screenshots;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class SampleTest extends Utility {
	
	@BeforeMethod
	public void setup(){
		initialization();
		
	}


	@Test
	public void ScreenshotTest(){
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void ScreenshotTest1(){
		Assert.assertEquals(false, true);
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}

}
