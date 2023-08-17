package com.ice_hrm_automation.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class Sample1 extends BaseClass {
	
	   @BeforeGroups(groups = {"sanity"})
	    public void beforeGroups(){
	        System.out.println("This is before group method");
	    }

	    @AfterGroups(groups = {"sanity"})
	    public void afterGroups(){
	        System.out.println("This is after group method");
	    }


	    @Test(groups = {"sanity"})
	    public void sample1Test1() throws AWTException {
	        System.out.println("This is test1 from sample1 class");
	        System.out.println(driver.getTitle());
	    }

	    @Test(groups = {"sanity"})
	    public void sample1Test2() {
	        System.out.println("This is sample 1 class Test2 method");
	        System.out.println(driver.getTitle());

	    }

	    @Test(groups = {"regression"})
	    public void sample1Test3() {
	        System.out.println("This is sample 1 class Test3 method");
	        System.out.println(driver.getTitle());

	    }

	    @Test(groups = {"regression"})
	    public void sample1Test4() {
	        System.out.println("This is sample 1 class Test4 method");
	        System.out.println(driver.getTitle());

	    }

	    @Test(groups = {"regression"})
	    public void sample1Test5() {
	        System.out.println("This is sample 1 class Test5 method");
	        System.out.println(driver.getTitle());

	    }

	    @BeforeClass(groups = "sanity")
	    public void beforeClass() {
	        System.out.println("Sample1 Before class");
	        launchBrowser("edge");
	        driver.get("https://google.com");
	    }

	    @AfterClass(groups = "sanity")
	    public void afterClass() {
	        System.out.println("Sample1 After class");
	        driver.quit();
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Sample1 Before method");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("Sample1 after method");
    }
    
}
