package com.qa.java.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();

		set.add("naveen");
		set.add("Harisha");
		set.add("Reddy");
		
		//System.out.println(set);
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}

}
