package com.qa.testng.practice2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingATest {

	@Test
	public void testOne(){
		throw new SkipException("Skipping this test");
		
	}
	@Test
	public void testTwo(){
		throw new SkipException("Skipping this test");
	}
	@Test
	public void testThree(){
		System.out.println("Inside testthree");
		System.out.println("********");
	}


}
