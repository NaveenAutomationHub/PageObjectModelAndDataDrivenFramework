package com.qa.java.programs;

public class CallByValueAndCallByRef {

	

	 int p;
	 int q;

	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();

int x=10;
int y=20;
int z = obj.testSwap(x, y);

System.out.println(z);

//**************
obj.p=25;
obj.q=35;
obj.swap(obj);
System.out.println(obj.p);
System.out.println(obj.q);
		
	}
	
	//**************

	public int testSwap(int a, int b){
		a=50;
		b=60;
		int c=a+b;
		
		return c;
		
	}
	
	//**************
	
	public void swap(CallByValueAndCallByRef t) {
		
		int temp;
		temp=t.p; // 25
		t.p=t.q;  // 35
		t.q=temp; // 25
	}

}
