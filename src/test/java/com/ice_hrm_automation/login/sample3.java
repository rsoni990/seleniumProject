package com.ice_hrm_automation.login;

import org.testng.annotations.*;

public class sample3 {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is beforeMethod of sample3");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is after method of sample3");
	}
    @Test
    public void test3()
    {
    	System.out.println("this is test3 method for sample3");
    }
}
