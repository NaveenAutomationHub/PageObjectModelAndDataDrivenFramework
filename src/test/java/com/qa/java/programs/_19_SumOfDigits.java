package com.qa.java.programs;

import java.util.Scanner;

public class _19_SumOfDigits {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		sc.close();
		
		int sum = 0;
		//sum = sum*10+num%10;---> For reverse of a number;
		//sum = sum+num%10;----> For sum of a number
		while(number!=0){
			sum = sum+number%10;
			number = number/10;
		}System.out.println("Sum of digits in a given number is:"+sum);*/

		int[] a={4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			
		}
		
		System.out.println(sum);
		
		
	}

}
