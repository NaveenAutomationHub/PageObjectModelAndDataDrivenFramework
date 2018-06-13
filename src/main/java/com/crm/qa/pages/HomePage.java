package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;



public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: naveen reddy')]")
	public WebElement nameLabel;
	
	@FindBy(xpath="(//*[contains(text(),'Contacts')])[1]")
	public WebElement contactsLink;
	
	
	
	@FindBy(xpath="(//*[contains(text(),'Tasks')])[1]")
	public WebElement tasksLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[13]/a")
	public WebElement docButton;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[13]/ul/li[1]/a")
	public WebElement newDocumentlink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[5]/a")
	public WebElement dealsLink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")
	public WebElement newDealslink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[14]/a")
	public WebElement formslink;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[14]/ul/li/a")
	public WebElement newFormLink;
	
	
   public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
   
   public String verifyHomePageTitle(){
	   
	   return driver.getTitle();
	   
   }
   
   public boolean verifyUserName(){
	   
	   return nameLabel.isDisplayed();
	   
	   
   }
   
   public ContactsPage clickOnContactsLink(){
	   
	   contactsLink.click();
	   return new ContactsPage();
   }
   
   public DealsPage clickOnDealsLink(){
	   dealsLink.click();	 
	   return new DealsPage();
   }
   
   
   public DealsPage goToNewDeal(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(dealsLink).perform();
		
		actions.moveToElement(newDealslink).click().build().perform();
		return new DealsPage();
	}
   
   public DealsPage clickOnTasksLink(){
	   dealsLink.click();	 
	   return new DealsPage();
   }
   
   public DocPage clickOnDocLink() {
	   
	   Actions actions = new Actions(driver);
		
		actions.moveToElement(docButton).build().perform();
		
		actions.moveToElement(newDocumentlink).click().build().perform();
	   
	   return new DocPage();
	   
   }
   
   public FormPage clickOnForm(){
	   
	 Actions actions = new Actions(driver);
		
		actions.moveToElement(formslink).build().perform();
		
		actions.moveToElement(newFormLink).click().build().perform();
	   
	   
	  // JavascriptExecutor jse = (JavascriptExecutor)driver;
	  // jse.executeScript("document.getElementByXpath('newFormLink').click();");
	  
	   return new FormPage();
	   
	   
   }
	
   
	
	
	
	

}
