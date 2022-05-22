package pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(int row,int cell, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\SELENIUM\\Zerodha.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
