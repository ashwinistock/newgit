package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	
//	public static String testdata(String name,int row,int cell) throws EncryptedDocumentException, IOException {
//		FileInputStream file=new FileInputStream("D:\\Eclipse new\\ZerodaProject\\src\\test\\resources\\user.xlsx\\");
//		String value=WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
//		System.out.println(value);
//		return value;

    public static String Getop(int row,int cell,String sheetname) throws EncryptedDocumentException, IOException  {
	FileInputStream file = new FileInputStream ("D:\\Eclipse new\\ZerodaProject\\src\\test\\resources\\user.xlsx");
	String val = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	System.out.println(val);
	return val;
}
}