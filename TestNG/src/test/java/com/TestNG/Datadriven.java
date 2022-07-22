package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Vinothraj\\Desktop\\DataBook.xlsx");
	
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);

		int rowsize = sheetAt.getPhysicalNumberOfRows(); //3
		for (int i = 0; i < rowsize; i++) {
		Row row = sheetAt.getRow(i);

			int cellsize = row.getPhysicalNumberOfCells();//2
			for (int j = 0; j < cellsize; j++) { //0-1
		Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}
				else if (cellType.equals(cellType.NUMERIC)) {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
					
				}
			}
		}
		System.out.println("-----------------Particular Data--------------------------");
		String stringCellValue = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(stringCellValue);

		System.out.println("------------------create the cell and set the string value-------");
		Cell createCell = wb.getSheetAt(1).createRow(5).createCell(0);
		createCell.setCellValue("Vinothraj");
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.out.println("Value inserted");
	}
}