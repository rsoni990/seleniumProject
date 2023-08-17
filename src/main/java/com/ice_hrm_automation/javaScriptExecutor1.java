package com.ice_hrm_automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class javaScriptExecutor1 {

	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://cybersuccess.icehrm.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
	//	WebElement login=driver.findElement(By.xpath("//button[text()='Log in ']"));
	//	login.click();
	/*	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("alert('Please login to application');");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
	/*	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());*/
	Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeAsyncScript("prompt('Please enter the text....!');");
		Alert alert=driver.switchTo().alert();
		String alertmessage=alert.getText();
		System.out.println(alertmessage);
	
		
		
		
	}

}
