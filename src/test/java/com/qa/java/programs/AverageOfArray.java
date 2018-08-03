package com.qa.java.programs;

public class AverageOfArray {

	public static void main(String[] args) {


	double [] a= {10.1,1.3,25.8};
	
	double total=0;
	
	for(int i=0;i<a.length;i++){
		
		total=total+a[i];
		
	}
	
	
	//System.out.println(a.length);
	double average = total/a.length;
	
	System.out.println(average);
	}

}
