package com.qa.java.programs;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i =1;i<=7;i++){
			  for(int j=1;j<=i;j++){
				  
				  System.out.print(j+" ");
				  
				  //System.out.print("*"+" ");
			  }
			  
			  System.out.println();
			  
		  }
		
		for(int i = 6; i>=1;i--){
			
			
			for(int j=1; j<=i;j++){
				
				System.out.print(j+" ");
				//System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		

	}

}
