package com.qa.java.oops;

public class Constructor {
	
	
	public Constructor(String name){
		
		System.out.println("Inside constructor demo "+ name);
	}
	
	
	public void testDemo1(){
		
		System.out.println("Inside testDemo1");
	}

	public static void main(String[] args) {


		Constructor c = new Constructor("Naveen");
		c.testDemo1();
	}

}
