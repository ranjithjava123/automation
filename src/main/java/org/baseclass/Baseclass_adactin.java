package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Baseclass_adactin {

	public static WebDriver driver;
	public static String value;

	public static WebDriver browser_Configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\Driverr\\chromedriver.exe");

			driver = new ChromeDriver();

	} else if (type.equalsIgnoreCase("firefox")) {

System.setProperty("webdriver.geckodriver.driver", 
		System.getProperty("user.dir") + "value");

			driver = new FirefoxDriver();

		}

		return driver;
	}

	public static void inputValueElement(WebElement element, String data) {

		element.sendKeys(data);

	}

	public static void close() {

		driver.close();

	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void clickonelement(WebElement element) {

		element.click();
	}

	public static void dropdown(String value, WebElement element, String i) {
		Select s = new Select(element);
		if (value.equals("byindex")) {
			s.selectByIndex(Integer.parseInt(i));

		} else if (value.equals("byvalue")) {
			s.selectByValue(value);
		} else if (value.equals("bytext")) {
			s.selectByVisibleText(value);
		}

	}

	public static void implicitlywait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static String particular_data_adactin(int Row_index, int Coloumn_index) throws IOException {
     File f = new File("C:\\Users\\Richard\\eclipse-workspace\\Maven_Sample\\duplicate.xlsx");
     FileInputStream fis = new FileInputStream(f);
     Workbook wb = new XSSFWorkbook(fis);
     Sheet s = wb.getSheetAt(0);
     Row r = s.getRow(Row_index);
     
     Cell c = r.getCell(Coloumn_index);
   
     CellType type = c.getCellType();
     
     if (type.equals(CellType.STRING)) {
    	  value = c.getStringCellValue();
         		
	}
     
     else if (type.equals(CellType.NUMERIC)) {
		double numericCellValue = c.getNumericCellValue();
    int a = (int) numericCellValue;
		value = String.valueOf(a);
	}
		
     
	//return cellType; 
	return value;
     
     
	}
	
	
	
}
