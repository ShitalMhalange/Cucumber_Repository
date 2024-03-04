package StepDefination;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import pageObject.LoginPage;

public class StepsLogin 
{
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) throws InterruptedException 
	{
	   driver.get(url);
	    Thread.sleep(5000);
	}

	@When("User Enter EmailId as {string}")
	public void user_enter_email_id(String email) throws InterruptedException 
	{
		
		System.out.println(email);
	   lp.setUserName(email);
	    Thread.sleep(5000);
	}
	@When("User Enter Password as {string}")
	public void password(String password) throws InterruptedException 
	{
		System.out.println(password);
	
	    lp.setPassword(password);
	    Thread.sleep(5000);
	}

	@When("Click On Login")
	public void click_on_login() throws InterruptedException 
	{
	    lp.LoginButton();
	    Thread.sleep(5000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) 
	{
		 System.out.println(title);
	  if(driver.getPageSource().contains("Login was unsuccessful."))
	  {
		  System.out.println("Login was unsuccessful.");
		  driver.close();
		  Assert.assertTrue(false);
	}
	  else 
	  {
		  Assert.assertEquals(title, driver.getTitle());
		  System.out.println(driver.getTitle());
	  }
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException 
	{
	    lp.Logout();
	    Thread.sleep(5000);
	    
	}

	@Then("Close Browser")
	public void close_browser() 
	{
	    driver.close();
	    
	}
}
