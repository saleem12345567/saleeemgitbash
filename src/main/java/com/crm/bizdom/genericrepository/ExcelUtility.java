
package com.crm.bizdom.genericrepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {

	//this method will return single cell value in excel sheet
	
	public 	String readDatafromExcel(String sheetName,int rownum,int cellnum) throws Throwable{
		FileInputStream fis = new FileInputStream(".\\Testdata\\sel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rownum);
		Cell c = row.getCell(cellnum);
		return c.getStringCellValue();
	}

	public String getDatafromExcel(String sheetName,String testcaseID,String columnHeader) throws Throwable{
		int expectedRowNum=0;
		int expectedCellNum=0;
		FileInputStream fis = new FileInputStream(".\\Testdata\\sel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int lastRowNum = sh.getLastRowNum();
		//System.out.println(lastRowNum);
		//traverse in row
		for(int i=0;i<lastRowNum;i++){
			String actualID = sh.getRow(i).getCell(0).getStringCellValue();
			if(actualID.equals(testcaseID)){//tc_01
				expectedRowNum=i;
				break;
			}
		}
		//traverse in column
		int lastCellNum = sh.getRow(expectedRowNum).getLastCellNum();
		for(int j=0;j<lastCellNum;j++){
			String actualHeader = sh.getRow(expectedRowNum-1).getCell(j).getStringCellValue();
			if(actualHeader.equals(columnHeader)){
				expectedCellNum=j;//tc_id
				break;
			}
		}
		return sh.getRow(expectedRowNum).getCell(expectedCellNum).getStringCellValue();
	}
		public static void main(String[] args) throws Throwable
		{
			String org = new ExcelUtility().getDatafromExcel("Sheet1","TC_01","OrganizationName");
			String con = new ExcelUtility().getDatafromExcel("Sheet1", "TC_01", "ContactName");
			System.out.println(org);
			System.out.println(con);
			System.out.println(new ExcelUtility().readDatafromExcel("Sheet1", 1, 3));
			
		
		
		
		
		
	}
}
