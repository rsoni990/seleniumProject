package com.ice_hrm_automation;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerexample2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://cybersuccess.icehrm.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("2zuzfakn");
	driver.findElement(By.xpath("//input[@type='password']/following::button[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Employees']")).click();
	driver.findElement(By.xpath("//ul[@id='admin_Employees']/li/a[1]")).click();
	driver.findElement(By.xpath("//span[text()=' Add New']")).click();
	//get the today date
	int currentdate=LocalDateTime.now().getDayOfMonth();
	System.out.println(currentdate);
	
	//get the day of week
	DayOfWeek currentweek=LocalDateTime.now().getDayOfWeek();
	System.out.println(currentweek);
	
	int currentmonth=LocalDateTime.now().getMonthValue();
	System.out.println(currentmonth);
	 String date="Oct";
	 String year="2025";
	WebElement ele=driver.findElement(By.id("birthday"));
	ele.click();
	List<WebElement> elements=driver.findElements(By.xpath("//div[@class='ant-picker-header-view']"));
	for(WebElement dates:elements)
	{
		String str=dates.getText();
		String str1[]=str.split("");
		
	}
	}

}
