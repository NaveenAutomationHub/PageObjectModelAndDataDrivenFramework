package com.crm.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DocPage extends TestBase {
	
	
	@FindBy(xpath="//*[@id='title']")
	public WebElement title;
	
	
	@FindBy(xpath="//*[@id='docForm']/table/tbody/tr[7]/td[2]/input[3]")
	public WebElement contact;
	
	@FindBy(xpath="html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/legend")
	public WebElement docslabel;
	
	
	@FindBy(xpath="//*[@id='docForm']/table/tbody/tr[14]/td[2]/input")
	public WebElement save;
	
	public DocPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void newDocument(){
		
		title.sendKeys("NewDocument");
		contact.sendKeys("111111111");
		save.click();
		
		
	}
	
	

}
