package com.qa.testng.practice2.DataDriven;

import java.util.ArrayList;

public class TestUtility {
	
	public static ArrayList<Object[]> readLoginDataFromExcel(){
		
		ArrayList<Object[]> arraylist = new ArrayList<Object[]>();
		
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"/src/test/java/com/qa/testng/practice2/DataDriven/FreeCRMTest.xlsx");
		
		for(int rowNum=2;rowNum<=reader.getRowCount("LoginData");rowNum++){
			
			String uname = reader.getCellData("LoginData", "username", rowNum);
			String pwd = reader.getCellData("LoginData", "password", rowNum);
			
			Object ob[] = {uname,pwd};
			
			arraylist.add(ob);
		}
		
		return arraylist;
	}

}
