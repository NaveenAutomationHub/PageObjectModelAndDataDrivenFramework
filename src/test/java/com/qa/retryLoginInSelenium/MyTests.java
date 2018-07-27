package com.qa.retryLoginInSelenium;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(retryAnalyzer = com.qa.retryLoginInSelenium.RetryAnalyzer.class)
public class MyTests {
	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
 
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(true, true);
	}

}