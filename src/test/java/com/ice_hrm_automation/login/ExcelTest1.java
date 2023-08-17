package com.ice_hrm_automation.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest1 {
	
	
	 @DataProvider
	 public Object[][] getTestData(){
		 ExcelUtil1 excelutil=new ExcelUtil1();
		 String filePath="/Users/rsoni/OneDrive/Documents/testData.xlsx";
		 String sheetName="Sheet2";
		 return excelutil.getExcelData(filePath, sheetName);
	 }
	   
	 @Test(dataProvider="getTestData")
	 public void test(EmpDetails emp)
	    {
		  
	       double empId=emp.getId();
		 String empName1=emp.getEmpName();
		 String empad=emp.getAddress();
		 double sal=emp.getSalary();
		 String des=emp.getDestination1();
		 double adh=emp.getAdharNo();
		 String pan=emp.getPanCard();
		 System.out.println(empId+" "+empName1+" "+empad+" "+sal+" "+des+" "+adh+" "+pan);
		 System.out.println("--------------");
		
		 }

}
/*  double empId;double empId, String empName,String address,String state,double salary,String desination,double adharno,String pancard
private String empName;
private String address;
private String state;
private double salary;
private String desination;
private double adharno;
private String pancard; */

