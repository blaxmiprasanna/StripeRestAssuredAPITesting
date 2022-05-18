package com.CTS.StripeRestAssuredAPI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPayLoadData {

	static String fileName = "C:\\Users\\blaxm\\workspace\\StripeRestAssuredAPI\\resource\\TestData.xlsx";
	static FileInputStream FIS;
	static XSSFWorkbook XSF;
	static PojoClass pojoClass;
	static Map<Object, Object> data;


	public Map<Object, Object> readExcelData(String testCaseName) throws IOException {

		FIS = new FileInputStream(fileName);

		XSF = new XSSFWorkbook(FIS);

		pojoClass = new PojoClass();

		data = new HashMap<Object, Object>();

		int count = XSF.getSheetAt(0).getLastRowNum();

		for (int i = 1; i < count + 1; i++) {

			pojoClass.setTestCase(XSF.getSheetAt(0).getRow(i).getCell(0).getStringCellValue());
			
			if(pojoClass.testCase.equalsIgnoreCase(testCaseName)){
				
				pojoClass.setTestCase(XSF.getSheetAt(0).getRow(i).getCell(0).getStringCellValue());
				
				pojoClass.setLatitude(XSF.getSheetAt(0).getRow(i).getCell(1).getNumericCellValue());
				
				pojoClass.setLongitude(XSF.getSheetAt(0).getRow(i).getCell(2).getNumericCellValue());
				
				pojoClass.setAccuracy((int) XSF.getSheetAt(0).getRow(i).getCell(3).getNumericCellValue());
				
				pojoClass.setName(XSF.getSheetAt(0).getRow(i).getCell(4).getStringCellValue());
				
				pojoClass.setPhone_number(XSF.getSheetAt(0).getRow(i).getCell(5).getStringCellValue());
				
				pojoClass.setAddress(XSF.getSheetAt(0).getRow(i).getCell(6).getStringCellValue());
				
				pojoClass.setType1(XSF.getSheetAt(0).getRow(i).getCell(7).getStringCellValue());
				
				pojoClass.setType2(XSF.getSheetAt(0).getRow(i).getCell(8).getStringCellValue());
				
				pojoClass.setLanguage(XSF.getSheetAt(0).getRow(i).getCell(9).getStringCellValue());
				
			}
			
			data.put(pojoClass.testCase,pojoClass);
			data.put(pojoClass.accuracy, pojoClass);
			data.put(pojoClass.address, pojoClass);
			data.put(pojoClass.language, pojoClass);
			data.put(pojoClass.latitude, pojoClass);
			data.put(pojoClass.longitude, pojoClass);
			data.put(pojoClass.name, pojoClass);
			data.put(pojoClass.phone_number, pojoClass);
			data.put(pojoClass.type1, pojoClass);
			data.put(pojoClass.type2, pojoClass);


			}
		
		return data;
		}
			

	}

	
	
