package com.data_driven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_ColumnData {
	public static void particular_Column() throws IOException {
		
		File f=new File("C:\\\\Users\\\\Richard\\\\eclipse-workspace\\\\Maven_Sample\\\\duplicate.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
	
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
		
			Cell c = r.getCell(i);
		
			CellType type=c.getCellType();
			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);
			}else if (type.equals(CellType.NUMERIC)) {
				double value = c.getNumericCellValue();
				System.out.println(value);
			}}
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		particular_Column();
	}

}
