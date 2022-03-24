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

public class Particular_RowData {
	public static void particular_Row() throws IOException {
		
		File f=new File("C:\\Users\\Richard\\eclipse-workspace\\Maven_Sample\\duplicate.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			CellType type = c.getCellType();
		
			if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);
			
		}else if (type.equals(CellType.NUMERIC)) {
			double cellvalue = c.getNumericCellValue();
			System.out.println(cellvalue);
		}}
	wb.close();
	
}
public static void main(String[] args) throws IOException {
	particular_Row();
}
}
