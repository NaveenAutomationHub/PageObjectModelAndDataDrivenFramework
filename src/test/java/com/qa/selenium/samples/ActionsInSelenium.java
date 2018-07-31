package com.qa.selenium.samples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/div"));
		WebElement drop = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]/div"));
		Thread.sleep(10);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop);
	}

}
