package com.exercise;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExcel {

	
	
	public void readData(){
		
	}
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		String  excelFilePath = new String("C:\\Users\\Deepa\\workspace\\Day1\\src\\config\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excelFilePath);
		XSSFSheet  sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
	
		int lastRownumer =sheet.getLastRowNum()+1;
		XSSFCell cell ;
		for(int j=0 ;j<lastRownumer; j++){
			for(int i=0 ;i <row.getLastCellNum();i++){
				cell=row.getCell(i);
				System.out.print(cell.getStringCellValue()+" ");
			
		}
		}
	}

}
