package com.crm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

import junit.framework.Assert;

public class SignUpPage  extends TestBase{
	@FindBy(xpath="//*[@name='first_name']")
	public WebElement firstName;
	
	@FindBy(xpath="//*[@name='surname']")
	public WebElement surname;
	
	@FindBy(xpath="//*[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@name='email_confirm']")
	public WebElement confirmEmail;
	
	@FindBy(xpath="//*[@name='username']")
	public WebElement userName;
	
	@FindBy(xpath="//*[@name='password']")
	public WebElement passWord;
	
	@FindBy(xpath="//*[@name='passwordconfirm']")
	public WebElement passWordConfirm;
	
	@FindBy(xpath="//*[@name='agreeTerms']")
	public WebElement agree;
	@FindBy(xpath="//*[@name='submitButton']")
	public WebElement submit;
	
	
	public SignUpPage(){
		
		PageFactory.initElements(driver, this);
	}

	
	public void verifyURL(){
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("https://www.freecrm.com/register/", url);
		
		
	}
	public void fillSignUpDetails()
	{
		Select select = new Select(driver.findElement(By.xpath("//*[@id='payment_plan_id']")));
		select.selectByVisibleText("Free Edition");
		firstName.sendKeys("Reddy");
		surname.sendKeys("reddy");
		email.sendKeys("naveen.dommata@s2tech.com");
		confirmEmail.sendKeys("naveen.dommata@s2tech.com");
		userName.sendKeys("naveen");
		passWord.sendKeys("naveen@123");
		passWordConfirm.sendKeys("naveen@123");
		agree.click();
		submit.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	}

}
