package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import junit.framework.Assert;

public class ReportsPage extends TestBase {
	
	@FindBy(xpath="html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/legend")
	WebElement text;

	public ReportsPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void verifyImportPageText(){
		
		Assert.assertEquals("Reports", text);
		
	}

	
}

