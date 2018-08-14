package com.qa.brokenLinksAndImages;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		link.addAll(driver.findElements(By.tagName("img")));
		System.out.println("total links size is:" + link.size());
		for(int i=0;i<link.size();i++){
			WebElement ele = link.get(i);

			String url = ele.getAttribute("href");
	//	String str =	link.get(i).getAttribute("href");
			System.out.println(url);
			
			verifyActivelink(url);
		}
	}
	
	public static void verifyActivelink(String linkurl) {
		try{
		URL url = new URL(linkurl);
		HttpURLConnection httpurlconnection =  (HttpURLConnection) url.openConnection();
		httpurlconnection.setConnectTimeout(5000);
		httpurlconnection.connect();
		if(httpurlconnection.getResponseCode()==200){
			
			System.out.println(linkurl+"-------"+httpurlconnection.getResponseMessage());
		}
          if(httpurlconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			
			System.out.println(linkurl+"-------"+httpurlconnection.getResponseMessage()+"-----"+HttpURLConnection.HTTP_NOT_FOUND);
		}
	}catch(Exception e){
		
		
	}
	}

}
