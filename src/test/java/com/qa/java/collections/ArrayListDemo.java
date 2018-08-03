package com.qa.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {


		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("Naveen");
		list.add("Reddy");
		list.add("Hari");
		list.add("Naveen");
		
		//System.out.println(list.get(2));

/*Iterator<String> itr = list.iterator();

while(itr.hasNext()){
	
	System.out.println(itr.next());
}
		*/
		
		
		for(Object obj:list){
			
			System.out.println(obj);
		}
		

	}

}
