package ice_hrm_automation_TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ice_hrm_automation.login.BaseClass;
import com.ice_hrm_automation.login.PropertyHandling;

public class EmpTest extends BaseClass {
	
	PropertyHandling propertyhandling;
	
	@BeforeClass
	public void before()
	{
		propertyhandling=new PropertyHandling();	
	}
	
	@Test
	public void login()
	{
		String url=propertyhandling.getProperty("icehrmUrl");
		launchBrowser("edge");
		driver.navigate().to(url);
		String username=propertyhandling.getProperty("icehrmUsername");
		enterText(By.name("username"),username);
		String password=propertyhandling.getProperty("icehrmPassword");
		enterText(By.name("password"),password);
		click(By.xpath("//input[@id='password']/following::button[1]"));
	}
	public void test()
	{
		String url=propertyhandling.getProperty("icehrmUrl");
		System.out.println(url);
		
	}

}
