package com.ice_hrm_automation;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.Exception;
public class MousehoverExample1 {
	
	private static final Function<? super WebDriver, Object> ExpectedConditions = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://cybersuccess.icehrm.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("2zuzfakn");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions actions=new Actions(driver);
	
		actions.moveToElement(driver.findElement(By.xpath("//button[text()='Log in ']"))).click().build().perform();
	
       actions.click(driver.findElement(By.xpath("//span[text()='Employees']"))).build().perform();
       actions.click(driver.findElement(By.xpath("//ul[@id='admin_Employees']/descendant::a[1]"))).build().perform();
       actions.moveToElement(driver.findElement(By.xpath("//span[text()=' Add New']"))).click().build().perform();
       
      driver.findElement(By.id("employee_id")).sendKeys("121");
      driver.findElement(By.id("first_name")).sendKeys("Rahul");
      driver.findElement(By.id("middle_name")).sendKeys("Kumar");
      driver.findElement(By.id("last_name")).sendKeys("Soni");
      
      
      actions.moveToElement((WebElement) By.xpath("//span[text()='Select Nationality']")).click().build().perform();
      driver.findElement(By.xpath("//span[text()='Select Nationality']")).sendKeys("Indian");
      
      
      
	}

}
