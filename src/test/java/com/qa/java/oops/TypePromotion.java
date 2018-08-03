package com.qa.java.oops;

public class TypePromotion {
	
	/*
	
	When a datatype of smaller size is promoted to datatype of bigger size is called type promotion
*/
	public static void main(String[] args) {

		Promotion d = new Promotion();
		d.Test(500);
		d.Test(500.52f);
		
	}

}

class Promotion{
	
	public void Test(int a){
		
		System.out.println("Value of the int Test is "+ a);
	}
	
public void Test(double b){
	System.out.println("Value of the double Test is "+ b);
		
	}
}
