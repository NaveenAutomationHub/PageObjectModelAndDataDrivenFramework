package com.qa.java.programs;
public class TwoDArray {
	public static void main(String[] args) {		
		//Two-D array is nothing but array of single dimentional arrays		
		int[][] a= {{10,11,12},{13,14,15}};		
		for(int i=0;i<a.length;i++){			
			for(int j=0;j<a[0].length;j++){				
				System.out.print(a[i][j]+" ");
			}			
			System.out.println(" ");
		}}}
