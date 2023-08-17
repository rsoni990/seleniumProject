package com.ice_hrm_automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class EnterDataInExcel {

	public static void main(String[] args) {

		   String filePath="C:\\Users\\rsoni\\OneDrive\\Documents\\testData.xlse";
		   String extensions=filePath.substring(filePath.indexOf(".")+1);
		   Workbook workbook=null;
		   try
		   {
			  FileInputStream inputStream=new FileInputStream(filePath) ;
			  if(extensions.equals("xlse"))
			  {
				  workbook=new XSSFWorkbook(inputStream);
			  }else if(extensions.equals("xlx"))
					  {
					 workbook=new XSSFWorkbook(inputStream);
					  }
			  Sheet sheet=(Sheet) workbook.getSheet("testData");
			  if(sheet==null)
			  {
				  sheet= (Sheet) workbook.createSheet("testData");
			  }
			  org.apache.poi.ss.usermodel.Cell cell=((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(0).createCell(0);
			 cell.setCellValue("Cyber Success");
			 FileOutputStream outputStream=new FileOutputStream(filePath);
			 workbook.write(outputStream);
			 workbook.close();
			  
		   }
		   catch(Exception e)
		   {
		   throw  new RuntimeException(e);
		   }
	}

}
