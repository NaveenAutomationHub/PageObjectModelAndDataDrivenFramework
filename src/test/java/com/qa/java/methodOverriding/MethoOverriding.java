package com.qa.java.methodOverriding;

public class MethoOverriding {

	public static void main(String[] args) {
		Boy b = new Boy();
		//Girl a = new Girl();
		
         // a.Actions();
          b.Actions();
	}
	
}
class Boy{
	
	public  void Actions(){
		
		System.out.println("Boy is eating");
	}
	}
	
	class Girl extends Boy{
		
		public  void Actions(){
			
			System.out.println("Girl is eating");
		}
}