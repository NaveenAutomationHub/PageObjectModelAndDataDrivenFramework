package com.crm.qa.pages;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;
public class CalendarPage extends TestBase{	
	
	@FindBy(xpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr/td")
	public WebElement calendar;
	@FindBy(xpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]")
	public WebElement date;
	public CalendarPage(){		
		PageFactory.initElements(driver, this);
	}	
	public void selectDate() throws InterruptedException{
		
		DateFormat dateformat = new SimpleDateFormat("dd");
		Date date = new Date();
		String todaydate = dateformat.format(date);
		System.out.println("Current date and day is : " + todaydate);

		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr/td"));

		for (WebElement ele : list) {

			String date1 = ele.getText();
			if (date1.equals(07)) {

				ele.click();
				System.out.println("Current date is selected");
				break;
			}
		}
		//date.click();
		System.out.println("date is selected");
		
		
	}

}
