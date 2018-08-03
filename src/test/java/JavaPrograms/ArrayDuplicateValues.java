package JavaPrograms;

import java.util.ArrayList;

public class ArrayDuplicateValues {

	public static void main(String[] args) {


		int a[] = {1,2,2,3,3,3,4,5,5,6};
		
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		ArrayList<Integer> unique = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++){
			
			if(!unique.contains(a[i])){
				
				unique.add(a[i]);
			}else{
				
				duplicate.add(a[i]);
			}
			
			
		}
		
		System.out.println("unique values are: " + unique);
		System.out.println("Duplicate values are: " + duplicate);
	}

}
