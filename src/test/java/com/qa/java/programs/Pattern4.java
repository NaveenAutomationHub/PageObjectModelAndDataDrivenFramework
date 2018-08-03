package com.qa.java.programs;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input data");
		int number = scanner.nextInt();
		
		for(int i = 1; i<=number;i++){
			for(int j=number; j>=i;j--){
				
				System.out.print(j+" ");
				//System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		
	}

}
