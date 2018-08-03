package com.qa.java.programs;

import java.util.Scanner;

public class Pattern3 {

	
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input data");
		int number = scanner.nextInt();
		
		for(int i = number; i>=1;i--){
			for(int j=1; j<=i;j++){
				
				System.out.print(j+" ");
				//System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		
	}

}
