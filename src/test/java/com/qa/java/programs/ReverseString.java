package com.qa.java.programs;
public class ReverseString {
	public static void main(String[] args) {
		String input= "Naveen Ha";		
		StringBuilder sb = new StringBuilder(input);
		//sb.append(input);
		StringBuilder str = sb.reverse();		
		System.out.println(str);

		String input1= "Naveen Har";
		char[] ch = input1.toCharArray();
		for(int reverse=ch.length-1;reverse>=0;reverse--){	
			System.out.print(ch[reverse]);
		}
	}
}
