package JavaPrograms;

public class FactorialOfANumber {

	public static void main(String[] args) {
              
		int factorial = fact(3);
		
		
		System.out.println(factorial);

		}
	
	 static int fact(int n){
		 int output;
		 if(n==1){
			 
			 return 1;
		 }
		 
		 output = fact(n-1)*n;
		 
		 
		return output;
		 
		 
	 }

	

      

}
