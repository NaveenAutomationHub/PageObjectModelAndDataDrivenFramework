package JavaPrograms;

public class GreatestNumber {

	public static void main(String[] args) {


		int[]a={8,9,7,5,8};
		
		int temp=a[0];
		
		for(int i=0;i<a.length;i++){
			
			if(temp<a[i]){
				
				temp=a[i];
			}
			
			System.out.println(temp);
		}

	}

}
