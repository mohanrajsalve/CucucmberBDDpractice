package simple.cucumber;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ReadExcelFile {
  @Test
  public void f() {
	  System.out.println(";dkngdjfnh");
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	//Create an object of File class to open xlsx file
      File file =    new File("F:\\java_practice\\Selenium_practice\\test_data.xls");
      
      //Create an object of FileInputStream class to read excel file
      FileInputStream inputStream = new FileInputStream(file);
      
      //Creating workbook instance that refers to .xls file
      HSSFWorkbook wb=new HSSFWorkbook(inputStream);
      
      //Creating a Sheet object using the sheet Name
      HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
       int Lastrownumber =sheet.getLastRowNum();
       
      //Create a row object to retrieve row at index 1
      HSSFRow row2=sheet.getRow(1);
      
      //Create a cell object to retreive cell at index 5
      HSSFCell cell=row2.getCell(1);
   
      //Get the address in a variable
      String name= cell.getStringCellValue();
      
      //Printing the address
      System.out.println("Name is :"+ name);
 
      	
      }
  

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
