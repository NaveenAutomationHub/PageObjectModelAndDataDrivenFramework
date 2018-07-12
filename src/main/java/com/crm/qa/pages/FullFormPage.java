package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FullFormPage extends TestBase {
	
	@FindBy(xpath="//*[@id='cs_name']")
	WebElement company;
	
	
	@FindBy(xpath="//*[@id='cs_annual_revenue']")
	WebElement annualrevenue;
	
	@FindBy(xpath="//*[@id='cs_phone']")
	WebElement phone;
	
	@FindBy(xpath="//*[@id='compForm']/table/tbody/tr[7]/td/input")
	WebElement searchCompanies;
	
	
	
	public FullFormPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void filltheForm() throws InterruptedException{
		company.sendKeys("Wells Fargo");
		annualrevenue.sendKeys("6000000");
		phone.sendKeys("9985822966");
		Thread.sleep(4000);
		searchCompanies.click();
	}

}
