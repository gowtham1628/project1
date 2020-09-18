package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class mavenFirst {
	
   public static void main(String[] args) throws Throwable {
	
	   File fin  = new File("C:\\Users\\VASANTH\\eclipse-workspace\\Sample\\Data\\empsheet.xlsx");
	   
	   FileInputStream fsm = new FileInputStream(fin);
	   
	   Workbook wb = new XSSFWorkbook(fsm);
	   
	   Sheet sh = wb.getSheet("empsheet");
	   
	   int numberOfRows = sh.getPhysicalNumberOfRows();
	   System.out.println(numberOfRows);
	   
	   Row r = sh.getRow(0);
	   
	   
	   
	   
	   
	   Cell c = r.getCell(0);
}

}
