package com.qa.java.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class SortingInJava {
	public static void main(String[] args) {
	ArrayList<String> li = new ArrayList<String>();		
		li.add("Test1");
		li.add("Test2");
		li.add("Test5");
		li.add("Test4");
		li.add("Test8");
		li.add("Test6");		
		Collections.sort(li);
		Iterator<String> itr = li.iterator();	
		while(itr.hasNext()){		
			System.out.println(itr.next());
		}
	}
}
