package com.qa.readDataFromTableIntoExcel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadingDataDromTables {
	@Test
	public void test(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//Company
		//*[@id='customers']/tbody/tr[1]/th[1]
		//*[@id='customers']/tbody/tr[2]/td[1]
		//*[@id='customers']/tbody/tr[3]/td[1]
		
		//Contact
		//*[@id='customers']/tbody/tr[1]/th[2]
		//*[@id='customers']/tbody/tr[2]/td[2]
		
		String before_xpath_company= "//*[@id='customers']/tbody/tr[";
		String after_xpath_company= "]/td[1]";
		
		String before_xpath_contact= "//*[@id='customers']/tbody/tr[";
		String after_xpath_contact= "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println("total number od rows: "+(rows.size()-1));
		int rowCount = rows.size();
		
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"/src/test/java/com/qa/readDataFromTableIntoExcel/Data.xlsx");
		
		if(!reader.isSheetExist("TableData")){
			reader.addSheet("TableData");
			reader.addColumn("TableData", "companyname");
			reader.addColumn("TableData", "contactname");
		}
		
		/*reader.addSheet("TableData");
		reader.addColumn("TableData", "companyname");
		reader.addColumn("TableData", "contactname");*/
		
		for(int i=2;i<rowCount;i++){
			
			String actualpath_company= before_xpath_company+i+after_xpath_company;
			String companyName = driver.findElement(By.xpath(actualpath_company)).getText();
			System.out.println(companyName);
			reader.setCellData("TableData", "companyname", i, companyName);
			
			String actualpath_contact= before_xpath_contact+i+after_xpath_contact;
			String contactName = driver.findElement(By.xpath(actualpath_contact)).getText();
			System.out.println(contactName);
			reader.setCellData("TableData", "contactname", i, contactName);
		}
		
	}
	

}
