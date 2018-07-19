package com.qa.selenium.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandlindUnCertifiedErrors {

	public static void main(String[] args) {
		FirefoxProfile ff  = new FirefoxProfile();
		ff.setAcceptUntrustedCertificates(true);
		WebDriver driver = new FirefoxDriver(ff);
		//driver.get("https://www.codecademy.com");
		//driver.get("https://www.vrecedu.org/");
		driver.get("https://www.cacert.org/");
		driver.manage().window().maximize();
	}

}
