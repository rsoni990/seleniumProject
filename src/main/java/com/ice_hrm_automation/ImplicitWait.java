package com.ice_hrm_automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//1)using implicit Wait method --->for synchronisation-->dynamic wait in nature-->applied globally-->
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		   driver.navigate().refresh();
		   WebElement username=driver.findElement(By.id("email"));
		   WebElement password=driver.findElement(By.id("pass"));
		   WebElement firstelement=driver.findElement(By.name("firstname"));
			WebElement lastelement=driver.findElement(By.name("lastname"));
		   sendKeys(driver,username,Duration.ofSeconds(5),"rsoni7790@gmail.com");
		   sendKeys(driver,password,Duration.ofSeconds(5),"Ishdish@7795");
		   driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		   sendKeys(driver,firstelement,Duration.ofSeconds(5),"Rahul");
		   sendKeys(driver,lastelement,Duration.ofSeconds(5),"Soni");
		  // clickOn(driver, login,Duration.ofSeconds(5));
		   //clickOn(driver,createAccount, Duration.ofSeconds(10));
	
		   
		
		}
	public static void sendKeys(WebDriver driver, WebElement element, Duration timeout, String value)
	{
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		}  
/*	public static void clickOn(WebDriver driver, WebElement element,Duration timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}*/
}
