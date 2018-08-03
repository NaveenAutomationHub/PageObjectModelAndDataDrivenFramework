package com.qa.java.collections;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+"/src/JavaPrograms/collections/Sample.txt")));
		String str;
		
		while((str = br.readLine())!=null){
			
			System.out.println(str);
		}
	}

}
