package com.actitime.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelLib {
	String filePath=Constants.filePath;
	public String getExcelData(String sheetName, int row, int coloumn) throws Exception{
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(row);
		String data=rw.getCell(coloumn).getStringCellValue();
		return data;
	}
	
	public void setExcelData(String sheetName, int row, int colNum, String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(row);
		Cell cel=rw.createCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		FileOutputStream fos=new FileOutputStream(filePath);
		cel.setCellValue(data);
		wb.write(fos);
		wb.close();
	}
	public int getRowCount(String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		return rowCount;
	}

}
