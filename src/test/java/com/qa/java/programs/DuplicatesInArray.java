package com.qa.java.programs;

public class DuplicatesInArray {

	public static void main(String[] args) {


		String[] str ={"ABC","DEF","GHI","ABC","JKL","DEF"};
		
		for(int i=0;i<str.length;i++){
			
			for(int j=i+1;j<str.length;j++){
				
				if(str[i].equals(str[j])){
					
					System.out.println(str[i]);
				}
			}
		}

	}

}
