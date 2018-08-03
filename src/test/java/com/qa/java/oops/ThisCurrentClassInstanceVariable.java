package com.qa.java.oops;

public class ThisCurrentClassInstanceVariable {
	
	
	int i;
	int j;
	int k;
	
	ThisCurrentClassInstanceVariable(int i, int j, int k){
		this.i=i;
		this.j=j;
		this.k=k;
		
	}
	
	ThisCurrentClassInstanceVariable(int i){
		
		k=i;
	}
	
	static void methodone(){
		
		System.out.println("Inside sample method");
		
	}

	public static void main(String[] args) {

		ThisCurrentClassInstanceVariable t = new ThisCurrentClassInstanceVariable(5,6,8);
		System.out.println(t.i);
		System.out.println(t.j);
	
		ThisCurrentClassInstanceVariable t1 = new ThisCurrentClassInstanceVariable(5);
		
		System.out.println(t1.k);
		
		ThisCurrentClassInstanceVariable.methodone();
		
		

	}

}
