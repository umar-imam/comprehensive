package com.mindtree.hybrid.comprehensive;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	static XSSFWorkbook work;
	static XSSFSheet sheet;

	public Excel(String excelPath, String Sheetname) {
		try {
			work = new XSSFWorkbook(new FileInputStream(excelPath));
			sheet = work.getSheet(Sheetname);
		} catch (Exception exp) {
			exp.getStackTrace();
		}
	}

	public String getData(int rowNum, int colNum) {
		String searchValue = "";
		try {
			searchValue = sheet.getRow(rowNum).getCell(colNum).toString();

		} catch (Exception ex) {

			ex.getStackTrace();

		}
		return searchValue;

	}
}
