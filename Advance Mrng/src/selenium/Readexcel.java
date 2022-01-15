package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./excel/test.xlsx");//path specified
		Workbook book = WorkbookFactory.create(fis);//opening the excel
		Sheet s = book.getSheet("Sheet1");//opening the sheet
		
		for(int i=0;i<s.getLastRowNum();i++)
		{
			Row r = s.getRow(i);
			
			for(int j=0;j<r.getLastCellNum();j++)
			{
				System.out.println(r.getCell(j).getStringCellValue());
			}
			
			System.out.println();
		}
	}

}
