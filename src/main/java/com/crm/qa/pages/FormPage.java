package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FormPage extends TestBase{
	
	
	@FindBy(xpath="//*[@id='title']")
	public WebElement title;
	
	@FindBy(xpath="//*[@id='report_email']")
	public WebElement reportemailfield;
	
	@FindBy(xpath="//*[@id='feedbackForm']/table/tbody/tr[4]/td/textarea")
	public WebElement description;
	
	@FindBy(xpath="//*[@id='feedbackForm']/table/tbody/tr[5]/td/textarea")
	public WebElement welcomemessage;

	@FindBy(xpath="//*[@id='feedbackForm']/table/tbody/tr[6]/td/textarea")
	public WebElement confirmmessage;
	
	@FindBy(xpath="//*[@id='feedbackForm']/table/tbody/tr[8]/td/input")
	public WebElement savebutton;
	
	
	public FormPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void fillTheForm(){
		title.sendKeys("First Form");
		reportemailfield.sendKeys("abcd@gmail.com");
		description.sendKeys("This is my first feedback");
		welcomemessage.sendKeys("WelCome to form page");
		confirmmessage.sendKeys("This is my confirmation");
		savebutton.click();
		
	}
	
}
