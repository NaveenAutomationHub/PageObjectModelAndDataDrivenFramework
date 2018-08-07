package com.qa.java.programs;
import java.util.Scanner;
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
***********
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
*/

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
		System.out.println("***********");
		for(int i = number; i>=1;i--){
			for(int j=1; j<=i;j++){	
				System.out.print(i+" ");
				//System.out.print("*"+" ");
			}
			System.out.println();
			}
	}}
