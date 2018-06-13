package com.qa.testng.practice;


import org.testng.annotations.Test;

public class Demo3 {
	
	
	
		  @Test
		 
		  public void function1() throws InterruptedException {
			  
			  for(int i=0;i<=10;i++){
				  
			
			  System.out.println("Function one value"+i);
			  Thread.sleep(500);
			  
			  }
				
				
		  }
		  
		  @Test 
           public void function2() throws InterruptedException {
			  
			  for(int i=100;i<=110;i++){
				  
			
			  System.out.println("Function one value"+i);
			  Thread.sleep(500);
			  }
				
				
		  }

}
