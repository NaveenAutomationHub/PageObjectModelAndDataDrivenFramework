package com.qa.java.oops;

public class TryCatchFinally {

	public static void main(String[] args) {

		TryCatchFinally tcf = new TryCatchFinally();
		
		tcf.trycatch();
		}
	
	
	public void trycatch(){
		
		try{
			
			int i = 9/0;
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}finally{
			
			System.out.println("Close the connections");
		}
				
	}

}


