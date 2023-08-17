package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPOM {
	
	  public WebDriver driver;
	  public LoginPageUsingPOM(WebDriver d)
	  {
		  driver=d;
		  PageFactory.initElements(driver,this);
	  }
	  @FindBy(id="user-name")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;
	
	public void setUserName(String user)
	{
		username.sendKeys(user);
		
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void setClick()
	{
		loginButton.click();
	}

}
