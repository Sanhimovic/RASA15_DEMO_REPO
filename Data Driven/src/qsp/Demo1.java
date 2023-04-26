package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./excel/d1.xlsx");
		//step1
		Workbook wb = WorkbookFactory.create(fis);
		//step2
		Sheet sh = wb.getSheet("Sheet1");
		//step3
		Row r = sh.getRow(0);
		//step4
		Cell c = r.getCell(0);
		//step5
		String val = c.getStringCellValue();
		System.out.println(val);
	}
}
