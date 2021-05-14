package com.hackathon.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadpropertyExcel {
	
	public String email;
	public String password;
	
	public static void main(String[] args) {
		ReadpropertyExcel r = new ReadpropertyExcel();
		
		System.out.println(r.email);
		
		System.out.println(r.password);
	}
	
	public ReadpropertyExcel() {
		
		
		try {
			File file = new File("C:\\Users\\Vishwanth Reddy\\Desktop\\DataFiles\\OPEN_CART\\OpencartLoginDetails.xlsx"); 
			FileInputStream fis = new FileInputStream(file); 
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); 
			
			String email = sheet.getRow(1).getCell(0).getStringCellValue(); 
			
			this.email = email;
			
			String password = sheet.getRow(1).getCell(1).getStringCellValue(); 
			
			this.password = password;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
