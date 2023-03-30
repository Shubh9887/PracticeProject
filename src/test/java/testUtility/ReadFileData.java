package testUtility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFileData {
	
	public static String fetchDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException {
	String data = "";
	String path = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"Excel Test Data"+File.separator+"Sample Test Data.xlsx";
//File.separator will automatically take separator as per device in which we run code like in windows separator is '//' where as in mac separator is  '\'
	FileInputStream file = new FileInputStream(path);
	Cell c= WorkbookFactory.create(file).getSheet("TestData").getRow(row).getCell(cell);
	
	CellType type = c.getCellType();
	
	if(type==CellType.STRING) {
		data = c.getStringCellValue();
	}
	else if (type==CellType.NUMERIC) {
		double number = c.getNumericCellValue();
	//	data = String.valueOf(number);			//Converting double data into String
		data= Double.toString(number);			//Double is wrapper class of double data type
	}
	else if(type==CellType.BLANK) {
		data ="";
	}
	
	return data;								//Taking excel data in form of String as output
	}
}
