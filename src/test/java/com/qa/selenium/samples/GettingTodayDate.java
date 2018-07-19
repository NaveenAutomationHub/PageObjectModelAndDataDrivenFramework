package com.qa.selenium.samples;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GettingTodayDate {
	
public static void main(String[] args) {
DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy, EEE");
Date date = new Date();
String todaydate = dateformat.format(date);
System.out.println("Current date and day is : " + todaydate);

	}

}
