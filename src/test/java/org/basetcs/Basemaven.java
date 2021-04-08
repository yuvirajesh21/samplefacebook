package org.basetcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.eval.StringValueEval;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basemaven {
	 static WebDriver driver;

	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\radha\\eclipse-workspace\\Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement ele, String name) {
		ele.sendKeys(name);
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static String getdatafromexcel(String pathname,String sheetname,int rowno,int cell) throws IOException {
		File file =new File(pathname);
		FileInputStream fileinput=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(fileinput);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell2 = row.getCell(cell);
		int cellType = cell2.getCellType();
		String value="";
		if(cellType==1) {
			value = cell2.getStringCellValue();
		
		}else if(DateUtil.isCellDateFormatted(cell2)){
			Date dateCellValue = cell2.getDateCellValue();
			SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yy");
			value = dateformat.format(dateCellValue);
			
			
		}
		if(cellType==0) {
			double numericCellValue = cell2.getNumericCellValue();
			long l=(long)numericCellValue;
			 value = String.valueOf(l);
		}
		return value;
		

	}
}
