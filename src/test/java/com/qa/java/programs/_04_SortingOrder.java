package com.qa.java.programs;

public class _04_SortingOrder {

	public static void main(String[] args) {
		/*//1.This is by using Sort()
		//Declaring the array
		String arr[] = {"O","U","I","A","E"};

		//Sorting the array
		Arrays.sort(arr);

		//Printing the array
		System.out.println(Arrays.toString(arr));
		 */

		//2.By using o(n*n) i.e., by using two for loops
		
		//Declare the array
		int a[] = {55,56,20,14,3,8};
		
		//By using brute force
		for(int i = 0;i<=a.length-1;i++){
			
			for(int j = i+1;j<=a.length-1;j++){

				if(a[i]>a[j]){
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}System.out.println(a[i]);
	}

	}
}
