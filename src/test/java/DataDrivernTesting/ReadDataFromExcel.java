package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
	FileInputStream fis = new FileInputStream("./TestData/Book1.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(url);
		
	

	int price  =  (int)wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
	System.out.println(price);
			
			
		

//	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//	System.out.println(url);
//		
//
//	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//	System.out.println(url);
		
		
		
		
		

	
		
	}

}
