package com.ice_hrm_automation;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickerExample1 {
private static Object WebElemenet;

public static void main(String ar[])throws Exception
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("onward_cal")).click();
	/*List<WebElement> days=driver.findElements(By.xpath("//td[@class='current day' or @class='wd day']"));
	int currentday=LocalDateTime.now().getDayOfMonth();
	System.out.println(currentday);
      Thread.sleep(2000);
	 for(WebElement ele:days)
	{
		String day=ele.getText();
		String today=String.valueOf(currentday);
		if(day.equals(today))
		{ele.click();
		break;
		}
	}*/    
	String year="2023";
	while(true) {
		Thread.sleep(1000);
	 WebElement element=driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[2]"));
	String date=element.getText();
	if(date.contains(year)) {
	System.out.println(date);
	driver.findElement(By.xpath("//td[@class='next']/button")).click();
	}
	else {break;}
	}

/*	while(true)
	{if((date1.equals(date)))
	    { driver.findElement(By.xpath("//td[@class='current day']")).click();
			break;
			}  
		else {Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='next']/button")).click();
		     }
      }*/
}
}
