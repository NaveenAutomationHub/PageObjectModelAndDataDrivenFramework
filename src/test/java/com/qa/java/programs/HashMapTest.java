package com.qa.java.programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {


		HashMap<Integer, String> hmp = new HashMap<Integer, String>();
		hmp.put(100, "Naveen Reddy9");
		hmp.put(100, "Rajesh Reddy9");
		hmp.put(102, "Sravan Reddy9");
		
		for(Entry<Integer, String> a: hmp.entrySet()){
			
			System.out.println(a.getValue());
			
			
		}

	}

}
