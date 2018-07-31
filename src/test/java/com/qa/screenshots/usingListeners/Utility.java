package com.qa.screenshots.usingListeners;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Utility {
	public static WebDriver driver;
	public static void initialization(){
		driver=new FirefoxDriver();
		driver.get("https://www.techonthenet.com/");
	}
	public void failed(String testMethodName){
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{	
			FileUtils.copyFile(file, new File("E://Eclipse workspaces//TaskManagement//PageObjectModelAndDataDrivenFramework//screenshots//"+" failedshot_"+testMethodName+"_"+".jpg"));
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
}