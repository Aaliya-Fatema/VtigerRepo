package com.qsp.vtiger.genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;

/**
 * This class used Java Library
 * 
 * @author Aaliya
 *
 */
public class JavaUtility {

	/**
	 * This method generates random no
	 * 
	 * @param limit
	 * @return
	 */
	public int generateRandomNo(int limit) {
		Random random =new Random();
		return new Random().nextInt(limit);
	}

	/**
	 * This method generates System date Time
	 * 
	 * @return
	 */
	public String generateSysDateTime() {
		
 
		return new Date().toString();
	}

	/**
	 * This method presses and hold Enter Button
	 * 
	 * @throws AWTException
	 */
	public void pressEnter() throws AWTException {
		new Robot().keyPress(KeyEvent.VK_ENTER);
	}

	/**
	 * This method releases the Enter Button
	 * 
	 * @throws AWTException
	 */
	public void releaseEnter() throws AWTException {
		new Robot().keyRelease(KeyEvent.VK_ENTER);
	}
/**
 * 
 * @return This method generates date
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	
	
//	public String generateStartDataInYYYY_MM_DDFormat() throws EncryptedDocumentException, IOException {
//
//		ExcelUtility eUtility = new ExcelUtility();
//
//		String date = eUtility.fetchDateDataFromExcel(IPathConstant.PRODUCT_SHEET_NAME, 22, 2);
//
//		String day = date.toString().substring(8, 10);
//		String year = date.toString().substring(24);
//
//		int month = date.getMonth() + 1;
//		String newMonth = "";
//
//		if (month < 10) {
//			newMonth = "0" + month;
//		}
//
//		return year + "-" + newMonth + "-" + day;
//	}
	
	
	
//	public String generateEndDataInYYYY_MM_DDFormat() throws EncryptedDocumentException, IOException {
//
//		ExcelUtility eUtility = new ExcelUtility();
//
//		Date date = eUtility.fetchDateDataFromExcel(IPathConstant.PRODUCT_SHEET_NAME, 23, 2);
//
//		String day = date.toString().substring(8, 10);
//		String year = date.toString().substring(24);
//
//		int month = date.getMonth() + 1;
//		String newMonth = "";
//
//		if (month < 10) {
//			newMonth = "0" + month;
//			return year + "-" + newMonth + "-" + day;
//
//		}
//		
//		else
//		return year + "-" + month + "-" + day;
//	}
	public  String generateSystemDateTime() {
		Date date = new Date();
		 return date.toString().replace(" ","-").replace(":", "-");
		 
	}

}
