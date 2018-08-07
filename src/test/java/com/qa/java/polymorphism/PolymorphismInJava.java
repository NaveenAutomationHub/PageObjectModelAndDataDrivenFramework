package com.qa.java.polymorphism;
public class PolymorphismInJava {
	public static void main(String[] args) {
		Animal obj1 = new Dog();
		obj1.sound();
	}}

class Animal{
	public void sound(){	
	System.out.println("Animal is making sound");
	}
}
class Horse extends Animal{	
public void sound(){
	System.out.println("Horse is making Neigh sound");	
	}
}
class Dog extends Animal{
public void sound(){
	System.out.println("Dog is making BowBow sound");
	}
}
