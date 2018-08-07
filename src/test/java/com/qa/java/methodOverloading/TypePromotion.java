package com.qa.java.methodOverloading;

public class TypePromotion {
	
	public void methodOne(int a, int b){
		
		System.out.println("Mehtod A");
	}
public void methodOne(int a, double b){
		
	System.out.println("Mehtod B");
	}

	public static void main(String[] args) {
		
		TypePromotion obj = new TypePromotion();
		obj.methodOne(2, 5.5f);
	}
}
