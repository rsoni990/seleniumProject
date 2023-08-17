package ice_hrm_automation_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.ice_hrm_automation.login.BaseClass;

public class LoginTestOrangeHrm1 extends BaseClass {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Welcome to OrangeHrm Application");
	}	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser)
	{
		launchBrowser(browser);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	@Parameters({"username","password"})
	@BeforeMethod
	public void beforeMethod(String username,String password)
	{System.out.println("Welcome to OrangeHrm Login Page");
	enterText(By.name("username"), username);
	enterText(By.name("password"),password);
	click(By.xpath("//button[@type='submit']"));
	}
/*	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println(driver.getTitle());
		WebElement element=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		System.out.println(element.getText());
	}*/
	
	@Test
	public void test1()
	{
		
		System.out.println("test1");
		
	}
	@AfterMethod
	public void afterMethod() {
		click(By.xpath("//p[@class='oxd-userdropdown-name']"));
		click(By.xpath("//a[text()='Logout']"));
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("out of OrangeHrm page");
	}

}
