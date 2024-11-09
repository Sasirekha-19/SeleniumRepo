package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static String[][] readData(String fileName) throws IOException {
		
		// To open the Workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Data/"+fileName+".xlsx");
		
		//To open the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To get the number of rows - ignores the header
		int rowCount = ws.getLastRowNum();
		System.out.println("Row count is: "+rowCount);
		
		//Including the header
		int rowCountWithHeader = ws.getPhysicalNumberOfRows();
		System.out.println("Row count with header: "+rowCountWithHeader);
		
		//To count the number of columns
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("Column Count is: "+columnCount);
		
		
		//Retrieve a particular data
		String row1Coulumn1Value = ws.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Required value is :"+row1Coulumn1Value);
		
	    String[][] data=new String[rowCount][columnCount];
		
		//Retrieve all the values
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("All data is: "+allData);
				data[i-1][j]=allData;
			     }
			}
wb.close();
return data;
}
}
