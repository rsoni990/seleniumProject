package com.ice_hrm_automation.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample5 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is beforeclass of sample5");
	}
     @AfterClass
     public void afterClass()
     {
    	 System.out.println("this is afterclass of sample5");
     }
     @Test
     public void test5()
     {
    	 System.out.println("this is test4 of sample5");
     }
}



