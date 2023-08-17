package com.ice_hrm_automation.login;

import org.testng.annotations.*;

public class Sample2 {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is beforemethod of sample2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is afterMethod of sample2");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is beforeclass of sample2");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("this is aftermethod of sample2");
	}
	@Test
	public void test2()
	{
		System.out.println("thid is test2 of sample2");
	}
}
