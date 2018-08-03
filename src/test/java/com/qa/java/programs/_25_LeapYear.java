package com.qa.java.programs;

import java.util.Scanner;

public class _25_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		//sc.close();
		
		if(n%4==0) {
			System.out.println("Given "+n+" year is a leap year");
		}else
			System.out.println("Given "+n+" year is not a leap year");

	}

}
