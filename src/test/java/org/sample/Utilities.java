package org.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
	public static Workbook book;
	public static Sheet sheet;
	public static FileInputStream excel;

	String[][] data =null;
	
	

	public String [][] loginData() {
		return data;
	}

	public Object getExcelSheet()  {
	
		try {
			excel = new FileInputStream("C:\\Users\\Prithiv\\eclipse-workspace\\Boohoo.com\\Excel\\Hotel.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			book = new XSSFWorkbook(excel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet("Sheet1");

		Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
System.out.println(data[i][j]);
			}

		}
return data;
	}
}
