package com.qa.testng.practice2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {

	@Test(groups={"Sanity-group"})
	public void testOne(){
		System.out.println("Inside testone");
		System.out.println("********");
		
	}
	@Test(groups={"Regression-group", "Sanity-group"})
	public void testTwo(){
		System.out.println("Inside testtwo");
		System.out.println("********");
	}
	@Test(groups={"Sanity-group"})
	public void testThree(){
		System.out.println("Inside testthree");
		System.out.println("********");
	}

}
