package com.qa.java.programs;

public class _18_Swaping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swaping:"+a+" and "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swaping :"+a+" and "+b);

	}

}
