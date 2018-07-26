package com.qa.testng.practice2;

import org.testng.annotations.Test;

public class Description {

	@Test
	public void testOne(){
		System.out.println("Inside testone");
		System.out.println("********");
		
	}
	@Test(description="SampleTest Two")
	public void testTwo(){
		System.out.println("Inside testtwo");
		System.out.println("********");
	}
	@Test
	public void testThree(){
		System.out.println("Inside testthree");
		System.out.println("********");
	}



}
