package com.project.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/Config.properties");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e){
			System.out.println("Exception is" + e.getMessage());
		}
		
		
		
	}
	
	//Fatch data from config.properties file..
	public String GetApplicationUrl() 
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getChromePath() 
	{
		String chrome = pro.getProperty("ChromePath");
		return chrome;
	}
	public String GetFirefoxPath() 
	{
		String fboxpath = pro.getProperty("firefox");
		return fboxpath;
	
	}
	public String GetIEpath() 
	{
		String IEpath = pro.getProperty("IEPAth");
		return IEpath;
	
	}
	public String EnterFname() 
	{
		String fn = pro.getProperty("UserFirstName");
		return fn;
	}
	public String EnterLname() 
	{
		String ln = pro.getProperty("UserLastName");
		return ln;
	}
	public String EnterEmailid() 
	{
		String em = pro.getProperty("UserEmailAddress");
		return em;
	}
	public String EnterPassword() 
	{
		String ps = pro.getProperty("UserPassword");
		return ps;
	}
	public String ConfirmPassword() 
	{
		String cp = pro.getProperty("ConfirmPassword");
		return cp;
	}
	
	
	

}
