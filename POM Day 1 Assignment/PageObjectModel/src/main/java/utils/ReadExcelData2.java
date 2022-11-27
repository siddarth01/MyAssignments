package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData2 {

	
	public static String[][] getData(String excelFileName) throws IOException {

		// Open file

		XSSFWorkbook book = new XSSFWorkbook("./testdata/"+excelFileName+".xlsx");

		// Go to sheet

		XSSFSheet sheet = book.getSheetAt(0);

		// Find Rows -Active ones

		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count " + rowCount);

		// Find Colums

		XSSFRow headerRow = sheet.getRow(0);

		int colCount = headerRow.getLastCellNum();

		System.out.println("Colum Count " + colCount);
		
		//Create empty 2D array data to store data
		
		String[][]data = new String[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {

				XSSFCell eachCell = eachRow.getCell(j);
				String stringCellValue = eachCell.getStringCellValue();

				System.out.println(stringCellValue);
				
				data[i-1][j]=stringCellValue;
				
				
			}
		}
		
		book.close();
		return data;

	}
}
