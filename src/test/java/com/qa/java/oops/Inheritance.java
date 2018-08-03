package com.qa.java.oops;

public class Inheritance {
	
	/*
	Inheritance is a mechanism in which one class aquires the Properties (Variables and Methods) of another class
	
	Types:
	Single Inheritance 
	Multilevel Inheritance
	Heirarchical Inheritance
	
*/
	public static void main(String[] args) {

B b = new B();
b.zeep();
b.car();
		

	}

}

class A{
	
	public void car(){
		
		
		System.out.println("This is a car block");
		
	}
	
	public void bus(){
		System.out.println("This is a bus block");
		
	}
	
	
}
class B extends A{
	
	public void zeep(){
		
		System.out.println("This is a zeep block");
		
		A a = new A();
		a.bus();
	}
	
	
}


