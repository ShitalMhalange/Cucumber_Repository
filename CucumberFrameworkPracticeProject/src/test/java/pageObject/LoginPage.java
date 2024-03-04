package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	@CacheLookup	
	WebElement LogInButton;
	
	@FindBy(xpath="//a[text()='Logout']")
	@CacheLookup
	WebElement Logout;
	
	public void setUserName( String Uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(Uname);
	}
	public void setPassword( String Pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(Pwd);
	}
	public void LoginButton()
	{
		LogInButton.click();
	}
	public void Logout()
	{
		Logout.click();
	}
	
	
	
	
}
