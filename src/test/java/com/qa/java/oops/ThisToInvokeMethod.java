package com.qa.java.oops;

public class ThisToInvokeMethod {

	
	
	public void test1(){
		
		System.out.println("This is test1 block");
	}
	
public void test2(){
		
	System.out.println("This is test2 block");
	
	this.test1();
	}
	public static void main(String[] args) {

		ThisToInvokeMethod a= new ThisToInvokeMethod();
		a.test2();
	}

}
