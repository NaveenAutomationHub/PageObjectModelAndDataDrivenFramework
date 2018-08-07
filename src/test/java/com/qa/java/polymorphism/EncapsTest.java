package com.qa.java.polymorphism;
 public class EncapsTest{
	 public static  void main(String[] args) {
			
			Encapsulation e = new Encapsulation();
			e.setStr("Naveen Reddy");		
			System.out.println(e.getStr());
		}
 }
 
 class Encapsulation {
	 
		
	private String str ;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
 
 
 
