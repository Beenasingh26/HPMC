package com.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FLib {
	public String getDataFromPropertyFile(String path,String key) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(key);
		
	}
	
	public String getDataFromExcelFile(String path,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();	
	
	}
	
	public Sheet getSheetFromExcelFile(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f);
		return book.getSheet(sheetName);
	}
	
	public Iterator<Row> getRowsFromExcelFile(String path, String sheetName) throws EncryptedDocumentException, IOException
	{
		Iterator<Row> itr = getSheetFromExcelFile(path, sheetName).rowIterator();
		return itr;
	}
	

    public void selectFromDropdownByVisibleText(WebElement dropdownElement, String visibleText) {
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);
    }
	
	 public void selectFromDropdownByValue(WebElement dropdownElement, String value) {
	        Select select = new Select(dropdownElement);
	        select.selectByValue(value);
	    }

	
//	public String getNewUserDataFromExcel(String path,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
//		FileInputStream f=new FileInputStream(path);
//		Workbook book = WorkbookFactory.create(f);
//		Sheet sheet = book.getSheet(sheetName);
//		return sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
//	}
	
//	public static  Object[][] getMultipleDataFromExcel(String path,String sheetName) throws EncryptedDocumentException, IOException
//	{
//		FileInputStream f=new FileInputStream(path);
//		Workbook book = WorkbookFactory.create(f);
//		Sheet sheet = book.getSheet(sheetName);
//		int row = sheet.getPhysicalNumberOfRows();
//		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		
//		//creating 2D object array
//		
//		Object o[][]=new Object[row-1][cell];
//		for(int i=1;i<row;i++)
//		{
//			for(int j=0;j<cell;j++)
//			{
//				o[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
//			}
//		}
//		return o;
//	}
}
