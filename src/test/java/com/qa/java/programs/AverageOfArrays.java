package com.qa.java.programs;

public class AverageOfArrays {

	public static void main(String[] args) {

   int [] a= {1,3,5,8};
   
   int total = 0;
   
   for(int i=0;i<a.length;i++){
	   
	   total= total+a[i];
   }
   
   double average = total/a.length;
   
   System.out.println(average);

	}

}
