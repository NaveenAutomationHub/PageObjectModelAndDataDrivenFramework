package com.qa.java.programs;

public class _07_MissingNumber {
	
	public static void main(String[] args) {
				
		/*//Declare an array
		int a[] = {0,1,2,3,4,5,7};
		
		//Print the size of the array
		System.out.println("The length of given array is:"+a.length);
		
		//Sum of all numbers by using mathematical calculation
		int sum = 0;
		int total = (a.length*(a.length+1))/2;
		
		//By using enhanced loop to get the output
		for(int i:a){
			sum+=i;
		}System.out.println("Missing number is:"+(total-sum));*/
		
	int a[] ={0,1,2,3,4,5,7};
	
	System.out.println("The length of given array is:"+a.length);
	
	int sum = 0;
	int total = (a.length*(a.length+1))/2;
	
	for(int i:a){
		sum+=i;//sum = sum+i;
	}System.out.println("The missing number is:"+(total-sum));
		
	
	}

}
