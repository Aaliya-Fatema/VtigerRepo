package com.qsp.vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @author Aaliya
	 */
	public String fetchStringDataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException,IOException  {
		FileInputStream fis= new FileInputStream(IPathConstant.EXCEL_FILE_PATH);
		
		return  WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		
	}
/**
 * 
 * @param sheetName
 * @param rowNo
 * @param cellNo
 * @return
 * @throws IOException
 * @author Aaliya
 */
	
	public int fetchNumericDataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException,IOException  {
		FileInputStream fis= new FileInputStream(IPathConstant.EXCEL_FILE_PATH);
		
		return (int) WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
		
	}
	/**
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws IOException
	 * @author Aaliya
	 */
	public boolean fetchbooleanDataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException,IOException  {
		FileInputStream fis= new FileInputStream(IPathConstant.EXCEL_FILE_PATH);
		
		return  WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
		
	}
	
	
	public long fetchNumericDataFromExcel1(String sheetName,int rowNo,int cellNo) throws IOException {
		FileInputStream fis=new FileInputStream(IPathConstant.EXCEL_FILE_PATH);
		return(long) WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
	}
	
	public String fetchDateDataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(IPathConstant.EXCEL_FILE_PATH);
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue().toString().substring(0, 10);
	}

}
