package com.MyFrame.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig 
{
	Properties prop;
	public readconfig()
	{
		File src=new File("./configuration//config.properties");
		
		try {
		FileInputStream fis=new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}		
	}
	public String getURI()
	{
		String uri=prop.getProperty("baseURI");
		return uri;
	}
	public String getUsername()
	{
		String username=prop.getProperty("username");
		return username;
	}
	public String getpassword()
	{
		String Password=prop.getProperty("password");
		return Password;
	}
	public String getchromepath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
}
