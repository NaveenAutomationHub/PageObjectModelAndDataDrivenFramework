package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {


		int fn=0;
		int sn=1;
		
	
		for(int i=0;i<=10;i++){
			
			int tn=fn+sn;
			
			System.out.println(tn);
			
			fn=sn;
			sn=tn;
			
		
		}
		
		

	}

}
