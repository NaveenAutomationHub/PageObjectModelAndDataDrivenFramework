package com.qa.java.oops;
public class StaticBlocks {
    static{	
	System.out.println("inside static block");
	}
	public void m1(){		
		System.out.println("inside method block");
	}
	public static void main(String[] args) {
		StaticBlocks obj = new StaticBlocks();
		obj.m1();
	}
}
