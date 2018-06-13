package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase{
	
	@FindBy(xpath="html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]/tbody/tr[1]/td[1]")
	public WebElement dealsLabel;
	
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[5]/a")
	public WebElement dealsLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")
	public WebElement newDealslink;
	
	@FindBy(xpath="//*[@id='title']")
	public WebElement title;
	
	@FindBy(xpath="//*[@id='amount']")
	public WebElement amount;
	
	@FindBy(xpath="//*[@id='prospectForm']/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/select")
	public WebElement dropdown;
	
	@FindBy(xpath="//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")
	public WebElement savedeal;
	
public DealsPage(){
		
		PageFactory.initElements(driver, this);
	}

public boolean verifyDealsLabel(){
	
	return dealsLabel.isDisplayed();
	
	
}

public void newdealsdetails(){
	
	
	title.sendKeys("Automation");
	amount.sendKeys("5000");
	
	Select select = new Select(dropdown);
	select.selectByVisibleText("New");
	savedeal.click();
	
}



}
