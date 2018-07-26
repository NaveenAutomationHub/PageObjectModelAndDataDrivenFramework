package com.qa.testng.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {


	@Test(priority=1)
	public void testOne(){
		Assert.fail();
		System.out.println("Inside testone");
		System.out.println("********");
		
		
	}
	@Test(priority=3,dependsOnMethods="testOne")
	public void testTwo(){
		System.out.println("Inside testtwo");
		System.out.println("********");
	}
	@Test(priority=2)
	public void testThree(){
		System.out.println("Inside testthree");
		System.out.println("********");
	}
	

}
