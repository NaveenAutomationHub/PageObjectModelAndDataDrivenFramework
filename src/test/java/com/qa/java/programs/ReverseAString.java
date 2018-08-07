package com.qa.java.programs;

public class ReverseAString {

	public static void main(String[] args) {


		String name= "Naveen Reddy";
		
		/*StringBuilder sb = new StringBuilder();
		sb.append(name);
		System.out.println(sb.reverse());*/
		
		
		char[] a = name.toCharArray();
		for(int i=a.length-1;i>=0;i--){
			
			System.out.print(a[i]);
		}
		

	}

}
