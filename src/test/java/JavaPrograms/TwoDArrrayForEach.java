package JavaPrograms;
public class TwoDArrrayForEach {
	public static void main(String[] args) {

		int[][] a= {{10,11,12},{13,14,15}};
		
		for(int temp[]: a){
			
			for(int temp2:temp){
				
				System.out.print(temp2+" ");
			}
			
			System.out.println(" ");
		}

	}

}
