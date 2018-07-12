package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CampaignsPage extends TestBase{
	
	public CampaignsPage(){
		
		PageFactory.initElements(driver, this);
	}

}
