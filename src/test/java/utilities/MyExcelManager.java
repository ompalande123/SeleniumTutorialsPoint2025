package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcelManager {

	public static String filePath = ".//testData//myData.xlsx";

	public static Map<String, String> getTestData(String sheetName, String testID) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		Map<String, String> data = new HashMap<>();

		boolean testIDfound = false;

		for (Row row : sheet) {
			XSSFCell firstCell = (XSSFCell) row.getCell(0);
			if (firstCell != null && firstCell.getStringCellValue().equals(testID)) {
				testIDfound = true;
				for (Cell cell : row) {
					String header = sheet.getRow(0).getCell(cell.getColumnIndex()).getStringCellValue();
					String value = cell.getStringCellValue();
					data.put(header, value);
				}
				break;
			}
		}
		workbook.close();
		fis.close();

		if (!testIDfound) {
			throw new IllegalArgumentException("Test ID not found : " + testID);
		}

		return data;
	}
	
	
	public static List<Map<String,String>> readAllRows(String sheetName, String filePath){
		List<Map<String, String>> allRows=new ArrayList<>();
		
		try(FileInputStream fis=new FileInputStream(filePath);
				XSSFWorkbook workbook = new XSSFWorkbook(fis)){
				XSSFSheet sheet = workbook.getSheet(sheetName);
				XSSFRow headerRow=sheet.getRow(0);
				int colCount=headerRow.getPhysicalNumberOfCells();
				for(int rowIdx=1; rowIdx<=sheet.getLastRowNum();rowIdx++) {
					XSSFRow row=sheet.getRow(rowIdx);
					if(row==null) 
						continue;
					Map<String, String> rowMap=new LinkedHashMap<>();
					for(int colIdx=0; colIdx<colCount;colIdx++) {
						String colName=headerRow.getCell(colIdx).getStringCellValue();
						XSSFCell cell=row.getCell(colIdx,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
						rowMap.put(colName, cell.toString());
					}
					allRows.add(rowMap);
				}
	}catch(Exception e) {
		e.printStackTrace();
												
	}
	return allRows;
	}

}
