package com.qa.java.programs;
public class RemoveJunk {
	public static void main(String[] args) {
String str ="@88999#$8Naveen%#*&Reddy";
String str1 = str.replaceAll("[^a-zA-Z]", "");
System.out.println(str1);
	}

}
