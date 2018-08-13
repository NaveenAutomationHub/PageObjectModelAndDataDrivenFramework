package com.qa.brokenLinksAndImages;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FindingBrokenLinksAndImages {
//Naveen
	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html?e=2");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("naveendommata");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		driver.switchTo().frame("mainpanel");
		

		List<WebElement> links = driver.findElements(By.tagName("a"));

		links.addAll(driver.findElements(By.tagName("img")));

		System.out.println("Total links are " + links.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(i).getAttribute("href"));

			if (links.get(i).getAttribute("href") != null && (!links.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(links.get(i));

			}
		}
		System.out.println("size of active links is" + activeLinks.size());

		// 200 - OK
		// 404 -not found
		// 500 --internal error
		// 400 --bad request

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection httpURLConnect = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();

			httpURLConnect.connect();
			String response = httpURLConnect.getResponseMessage();
			httpURLConnect.disconnect();

			System.out.println(activeLinks.get(j).getAttribute("href") + "--->" + response);
			
			
		}

	}
}
