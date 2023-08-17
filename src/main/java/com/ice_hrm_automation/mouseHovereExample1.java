package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHovereExample1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	/*	driver.get("https://cybersuccess.icehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("2zuzfakn");
		Actions action=new Actions(driver);
	//	action.moveToElement(driver.findElement(By.xpath("//button[text()='Log in ']"))).click().build().perform();
		action.click(driver.findElement(By.xpath("//button[text()='Log in ']"))).build().perform();
		*/
	/*	driver.navigate().to("https://rson7790.agilecrm.com/login?sur=true");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rsoni7790@agilecrm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ishdish@7790");
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//input[@value='Sign In']"))).build().perform();   */
		driver.get("https://rsoni123.agilecrm.com/login?sur=true");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rsoni123@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AUORXOGO");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//i[@class=\"material-icons monetization_on\"]")).click();
		Thread.sleep(3000);
		WebElement src=driver.findElement(By.xpath("//div[@class='media-body']"));
		WebElement dsn=driver.findElement(By.xpath("//ul[@milestone='Won']"));
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//i[@class='material-icons monetization_on']"))).build().perform();
		//action.clickAndHold(src).release(dsn).build().perform();
		action.dragAndDrop(src, dsn).build().perform();
		
		
		
	}

}
