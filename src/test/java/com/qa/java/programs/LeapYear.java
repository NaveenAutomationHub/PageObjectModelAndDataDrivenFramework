package com.qa.java.programs;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
System.out.println("Enter the input");
int x = scnr.nextInt();
if(x%4==0){	
	System.out.println("It's a leap year" + x);
}else{	
	System.out.println("It's not a leap year" + x);
}}
}
