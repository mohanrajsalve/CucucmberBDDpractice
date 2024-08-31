package utilitise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {
	public String valuerequired;
	public String getvaluefromexcel(String value) throws IOException {
		  File file =    new File("F:/java_practice/cucumber/propertie_file/inforead.xls");
	        
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //Creating workbook instance that refers to .xls file
	        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
	        //Creating a Sheet object using the sheet Name
	        HSSFSheet sheet=wb.getSheet("customer");
	         int Lastrownumber =sheet.getLastRowNum();
	         
	       
	        HSSFRow row=sheet.getRow(0);        
	        for(int y=0;row.getLastCellNum()>y;y++) {
	        	 HSSFCell cell=row.getCell(y);
	        	 if(cell.getStringCellValue().equalsIgnoreCase(value)) {
	        		   row=sheet.getRow(1);    
	        		  HSSFCell cell1=row.getCell(y);
	        		 valuerequired=cell1.getStringCellValue();
	        		  break;
	        	 }
	        }
	        //Create a cell object to retreive cell at index 5
	       
	        return valuerequired;
	        
	 
	}

}
