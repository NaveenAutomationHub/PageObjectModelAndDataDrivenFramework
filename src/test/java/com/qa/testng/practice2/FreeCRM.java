package com.qa.testng.practice2;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class FreeCRM {

@Test
  public void freeCRM() {
	  
	  WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		String str = driver.getTitle();
		System.out.println(str);	
		System.out.println("************");
  }

}
