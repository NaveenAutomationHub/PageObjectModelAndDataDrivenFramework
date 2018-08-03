package com.qa.java.oops;
public class ThrowInJava  {
	public void validateAge(int age)  throws ArithmeticException {
		if(age<18){		
			throw new ArithmeticException("person age is not valid for voting");
			//System.out.println("person age is not valid for voting");
		}else{
			
			System.out.println("person age is valid for voting");
		}
	}

	public static void main(String[] args) {
		ThrowInJava obj = new ThrowInJava();
		obj.validateAge(15);}}
