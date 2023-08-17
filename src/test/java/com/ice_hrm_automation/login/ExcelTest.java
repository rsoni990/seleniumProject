package com.ice_hrm_automation.login;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ExcelTest {
	@DataProvider
	public Object[][] getTestData()
	{
		ExcelUtil excelUtil=new ExcelUtil();
		String filePath="/Users/rsoni/OneDrive/Documents/testData.xlsx";
		String sheetName="Sheet1";
		return excelUtil.getExcelData(filePath, sheetName);
	}

	@Test(dataProvider= "getTestData")
	public void test(String username, String password) {
		System.out.println(username+" "+password);
	}
	
}
