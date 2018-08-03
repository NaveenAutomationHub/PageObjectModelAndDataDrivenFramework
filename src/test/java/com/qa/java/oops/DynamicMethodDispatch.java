package com.qa.java.oops;

public class DynamicMethodDispatch{
	
	public static void main(String[] args) {
		
		Game g = new Cricket();
		g.type();
	}
	
	
}
class Game{
	
	public void type(){
		
		System.out.println("Cricket");
	}
}

class Cricket extends Game{
	
	public void type(){
		
		System.out.println("Carrom");
	}
}