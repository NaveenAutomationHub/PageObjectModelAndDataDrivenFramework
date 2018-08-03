package com.qa.java.collections;

public class AdditionOfTwoDArrays {

	public static void main(String[] args) {

int a[][] ={{1,2,5},{6,5,8}};
int b[][] ={{1,1,1},{2,2,2}};

for(int i=0; i<2;i++){
	for(int j=0;j<3;j++){
		
		int[][] c = null;
		c[i][j]=a[i][j]+b[i][j];
		System.out.println(c[i][j]);
	}

}

	}

}
