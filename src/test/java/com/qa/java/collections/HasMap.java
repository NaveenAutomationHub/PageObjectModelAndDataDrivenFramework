package com.qa.java.collections;
import java.util.HashMap;
import java.util.Map.Entry;
public class HasMap {
	public static void main(String[] args) {
	HashMap<Integer, String> hmp = new HashMap<Integer, String>();
		hmp.put(001, "Naveen Reddy");
		hmp.put(002, "Harisha Reddy");
		hmp.put(003, "Arjun Reddy");	
		//System.out.println(hmp.get(003));	
		for(Integer i: hmp.keySet()){
			System.out.println(i);
		}
for(String i: hmp.values()){		
			System.out.println(i);	
		}
		
		for(Entry<Integer, String> e:hmp.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			//System.out.println(e);	
		}	
	}
}
