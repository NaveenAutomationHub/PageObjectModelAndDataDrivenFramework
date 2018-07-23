package com.qa.readingExcelFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcelFile {
	public static void main(String[] args) throws IOException {
		File file = new File("E://Eclipse workspaces/TaskManagement/PageObjectModelAndDataDrivenFramework/src/test/java/com/qa/readingExcelFile/PassportTestData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("RegistrationData");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<=rowCount;i++){	
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++){
				
				System.out.print(row.getCell(j).getStringCellValue()+ " ");
				
			}
			System.out.println(" ");
			//System.out.println(" ************");
		}
		

	}

}
