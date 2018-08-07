package com.qa.java.oops;

public class MethoOverriding {
	
	
	/* Declaring a method in sub class(Overriding method) which is already present in super class(Overridden)
	 *  is called method overriding*/

	public static void main(String[] args) {
     
		Animal a = new Dog();
		a.sound();

		

	}
	
	
	
	
}
class Animal{
	
	public void sound(){
		
		System.out.println("Animals makes dound");
		
	}
	
}

class Cat extends Animal{
public void sound(){
	
	System.out.println("Meow");
}
	
}

class Dog extends Animal{

	public void sound(){
	System.out.println("Bow Bow");
	
}
}
