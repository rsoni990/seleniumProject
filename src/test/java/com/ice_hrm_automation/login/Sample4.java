package com.ice_hrm_automation.login;

import org.testng.annotations.*;

public class Sample4 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is beforeclass of sample4");
	}
     @AfterClass
     public void afterClass()
     {
    	 System.out.println("this is afterclass of sample4");
     }
     @Test
     public void test4()
     {
    	 System.out.println("this is test4 of sample4");
     }
}
