package com.qa.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("Naveen");
		list.add("Reddy");
		list.add("Dommata");
		list.add("@S2tech");
		list.add("ID:"+7343);
		System.out.println(list);
		for(int i=0;i<list.size();i++){	
			System.out.println(list.get(i));
		}
		for(Object obj:list){
			System.out.println(obj);	
		}
		Iterator<Object> lst = list.iterator();
		while(lst.hasNext()){
			System.out.println(lst.next());
		}
	}

}
