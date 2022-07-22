package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {
	public static void main(String[] args) throws IOException {
		
		//file location
		
		File excelFile = new File("C:\\Users\\Vinothraj\\Desktop\\DataBook.xlsx");
		
		//input file
		FileInputStream fis = new FileInputStream(excelFile);
		// workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		
		//select my sheet
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		//count the rows
		int rowCount = sheetAt.getPhysicalNumberOfRows(); //3
		

		for (int i = 0; i < rowCount; i++) {
			//get into row
			XSSFRow row = sheetAt.getRow(i);
			//get the cell counts
			int cellCount = row.getPhysicalNumberOfCells(); //2
			for (int j = 0; j < cellCount; j++) {
				//get into the cell
				XSSFCell cell = row.getCell(j);
				// find my cellType 
				CellType cellType = cell.getCellType();
				// String - CellType
				if(cellType.equals(cellType.STRING))
				{
					// getStringCellValue
					String strResult = cell.getStringCellValue();
					System.out.println(strResult);
				}
				//Numeric
				if(cellType.equals(cellType.NUMERIC))
				{
					//Get Numeric Cell value
					double d = cell.getNumericCellValue();
					long l = (long) d;
					String numericResult = String.valueOf(l);
					System.out.println(numericResult);
				}
			} //j loop close
		} // i loop close
		System.out.println("------------Specific Value---------------");
		XSSFCell SpecificCell = wb.getSheetAt(0).getRow(2).getCell(0);
		System.out.println(SpecificCell);
		
		System.out.println("------------Write a value in the Excel---------------");
		XSSFCell createCell = wb.getSheetAt(1).createRow(2).createCell(1);
		createCell.setCellValue("Vinothraj");
		FileOutputStream fos = new FileOutputStream(excelFile);
		wb.write(fos);
		wb.close();
		System.out.println("Value inserted in Excel");
	}
}
