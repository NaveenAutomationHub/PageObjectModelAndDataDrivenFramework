package com.qa.java.methodOverloading;
public class MethodOverLoading {
	
	public void withOutParameters(){
		
		System.out.println("method without parameters ");
	}
	public void DemoOne(int a){
		
		System.out.println("Inside DemoOne method 1 " +a);
	}
	public void DemoOne(double b){
		
		System.out.println("Inside DemoOne method 2 " +b);
	}	
	public static void main(String[] args) {
		
		MethodOverLoading mol = new MethodOverLoading();
		mol.withOutParameters();
		mol.DemoOne(5);
		mol.DemoOne(22.2f);
	}

}
