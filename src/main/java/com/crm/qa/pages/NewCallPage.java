package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NewCallPage extends TestBase{
	
	@FindBy(xpath="//*[@id='callForm']/table/tbody/tr[14]/td[2]/table/tbody/tr/td[2]/input")
	public WebElement createNewDealCheckbox;
	
	@FindBy(xpath="//*[@id='notes']")
	public WebElement addNote;
	
	
	public NewCallPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void fillCallInformationPage(){
		
		createNewDealCheckbox.click();
		addNote.sendKeys("This is a first notes");
	}

}
