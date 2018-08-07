package com.qa.java.oops;

public class MethodOverloading {
	
	
/* Two or more methods can be created inside a single class as long as their parameters count,
declaration and type of parameters are different*/

	public static void main(String[] args) {
     int a = 700000;
     double b = 14.5;
     
     Demo d = new Demo();
		d.carDetails();
		d.carDetails(a);
		d.carDetails(b);
	}

}

class Demo{
	
	public void carDetails(){
		
		System.out.println("This is I20 Car");
		
	}
	
public void carDetails(int a){
	
	System.out.println("Cost of the car is "+ a);
		
		
	}

public void carDetails(double b){
	
	System.out.println("Milage of the car is "+ b);
	
	
}
	
	
}
