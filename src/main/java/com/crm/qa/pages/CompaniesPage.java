package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CompaniesPage extends TestBase {
	
   @FindBy(xpath="//*[@id='company_name']")
	WebElement companyName;
   
   @FindBy(xpath="//*[@id='annual_revenue']")
	WebElement annaualRevenue;
   
   @FindBy(xpath="//*[@id='combinedForm']/fieldset/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td[2]/select")
   WebElement status;
   
   
   @FindBy(xpath="//*[@id='first_name']")
   WebElement firstname;
   
   @FindBy(xpath="//*[@id='surname']")
   WebElement lastName;
   
	
	public CompaniesPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void fillCombinedCompanyForm(){
		
		companyName.sendKeys("Deloitte");
		annaualRevenue.sendKeys("600000");
		firstname.sendKeys("Naveen");
		
		lastName.sendKeys("Reddy");
		
		Select select = new Select(status);
		select.selectByVisibleText("Active");
		
		
	}

}
