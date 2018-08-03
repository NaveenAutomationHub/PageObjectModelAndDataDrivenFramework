package com.qa.java.collections;


import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
HashSet<String> li = new HashSet<String>();
		
		li.add("Test1");
		li.add("Test2");
		li.add("Test5");
		li.add("Test4");
		li.add("Test8");
		li.add("Test6");
		li.add("Test4");
		
		
		
		Iterator<String> itr = li.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}

	}

