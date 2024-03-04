package com.MyFrame.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(name="uid")
	WebElement uname;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	public void setusername(String username)
	{
		uname.sendKeys(username);
	}
	public void setpassword(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickloginbtn()
	{
		btnLogin.click();
	}	
}
