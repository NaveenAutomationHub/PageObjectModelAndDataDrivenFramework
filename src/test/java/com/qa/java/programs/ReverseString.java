package com.qa.java.programs;

public class ReverseString {

	public static void main(String[] args) {

/*
		String input= "Naveen Harisha";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(input);
		
		StringBuilder str = sb.reverse();
		
		System.out.println(str);
*/
		
		String input= "Naveen Harisha";
		
		char[] ch = input.toCharArray();
		
		for(int reverse=ch.length-1;reverse>=0;reverse--){
			
			System.out.print(ch[reverse]);
		}
		
	}
	
	

}
