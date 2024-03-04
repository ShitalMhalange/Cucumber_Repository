package com.MyFrame.Testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyFrame.pageObject.LoginPage;

public class TC_Loginpage_001 extends Baseclass
{
		@Test
		public void loginTest()
		{
			logger.info("URI lunch successfully");
			LoginPage lp=new LoginPage(driver);
			logger.info("Enter username");
			lp.setusername(username);
			logger.info("Enter username");
			lp.setpassword(password);
			logger.info("Enter password");
			lp.clickloginbtn();
			logger.info("click buton");
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				logger.info("Login successful");
			}
			else
			{
				Assert.assertTrue(false);			
				logger.info("Login unsuccessful");
			}
			}
		@Test
		public void loginTest1()
		{
			logger.info("URI lunch successfully");
			LoginPage lp=new LoginPage(driver);
			logger.info("Enter username");
			lp.setusername(username);
			logger.info("Enter username");
			lp.setpassword(password);
			logger.info("Enter password");
			lp.clickloginbtn();
			logger.info("click buton");
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				logger.info("Login successful");
			}
			else
			{
				Assert.assertTrue(false);			
				logger.info("Login unsuccessful");
			}
			}
}
