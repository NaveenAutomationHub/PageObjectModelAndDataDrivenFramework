package com.qa.java.programs;

public class ThisInJava {
	
	int i=50;
	public ThisInJava test1(){
		
		
		return this;
		
	}
	
public ThisInJava test2(){
		
		
		return new ThisInJava();
		
	}

public static void main(String[] args) {
	
	
	ThisInJava obj = new ThisInJava();
	obj.test1();
	
}
	
	
}
