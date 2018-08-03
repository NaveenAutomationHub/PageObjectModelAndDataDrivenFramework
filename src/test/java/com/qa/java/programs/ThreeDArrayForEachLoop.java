package com.qa.java.programs;

public class ThreeDArrayForEachLoop {

	public static void main(String[] args) {


		int[][][] a= {{{10,11,12,10},{13,14,15,12},{7,80,90,7},{10,11,12,10},{13,14,15,12},{7,85,97,7}}};
		
		for(int[][] temp: a){
			
			for(int[] temp2:temp){
				
				for(int temp3:temp2){
					
					System.out.print(temp3+" ");
				}
				
				System.out.println();
				
			}
			
			System.out.println();
		}

	}

}
