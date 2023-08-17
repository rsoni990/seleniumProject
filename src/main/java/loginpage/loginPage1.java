package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class loginPage1 {
	public static LoginPageUsingPOM log;
	public static WebDriver driver;
	public static ChromeOptions setChromeOption()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("incognito");
		return option;
		}
	   
	 public static void main(String args[]) throws Throwable
	 {
		 
	  try {	 
		 driver=new ChromeDriver(setChromeOption());
		  log=new LoginPageUsingPOM(driver);
		 driver.get("https://www.saucedemo.com/");
	       }
	      catch(Exception e)
	  {
		  throw new Exception(e);
	  }
	  
	    log.setUserName("standard_user");
	    log.setPassword("secret_sauce");
	     log.setClick();
	    Thread.sleep(4000);
	    driver.close();
	 }

}
