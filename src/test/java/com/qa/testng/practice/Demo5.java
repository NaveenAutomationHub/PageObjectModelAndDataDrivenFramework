package com.qa.testng.practice;

public class Demo5 {
	
	public static void main(String[] args) {
		

   int [] a={5,8,9,40,2};

      int temp=a[0];
        for(int i=0;i<a.length;i++){
        	
        	if(temp>a[i]){
        		
        		temp=a[i];
        	}
        	
        	System.out.println(temp);
        }

	}
	
	
	

}
