package com.MyFrame.Testcases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.MyFrame.utilities.readconfig;
import com.beust.jcommander.Parameter;


public class Baseclass 
{
	readconfig rconfig=new readconfig();
	public String baseuri=rconfig.getURI();
	public String username=rconfig.getUsername();
	public String password=rconfig.getpassword();
	public  WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger=Logger.getLogger("MyFrameWork");
		PropertyConfigurator.configure("log4j.properties");
		//System.setProperty("webdriver.chrome.driver",rconfig.getchromepath());
		
		if(br.equals("chrome"))
		{
			System.out.println(rconfig.getchromepath());
			logger.info("Going to launch");
			driver= new ChromeDriver();
			logger.info("successfully launch");
		}
		else if(br.equals("FirefoxDriver"))
		{
			logger.info("Going to launch");
			//System.setProperty("webdriver.chrome2.driver",reconfig.getchrome2path());
			driver= new FirefoxDriver();
			logger.info("successfully launch");
		}
		else if(br.equals("chrome3"))
		{
			logger.info("Going to launch");
			//System.setProperty("webdriver.chrome3.driver",reconfig.getchrome3path());
			driver= new ChromeDriver();
			logger.info("successfully launch");
		}
		
			driver.get(baseuri);
	}
	
	@AfterClass
	public void tesrdown()
	{
		//driver.quit();
	}
	
}
