package com.project.utilities;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {
	
	static ReadConfig rc = new ReadConfig();
	 static WebDriver driver;
	public static Logger logger;
	
	
	public static WebDriver setup(String br,String url) throws InterruptedException 
	{
		
		logger = Logger.getLogger(BrowserFactory.class);
		PropertyConfigurator.configure("D:\\Automation\\iNetBanking\\log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rc.getChromePath());
			driver = new ChromeDriver();
			logger.info("Lunching Chrome Browser....");
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",rc.GetFirefoxPath());
			driver = new FirefoxDriver();
			logger.info("Lunching Firefox Browser....");
		}
		else if(br.equals("IE")){
			System.setProperty("webdriver.ie.driver",rc.GetIEpath());
			driver = new InternetExplorerDriver();
			logger.info("Lunching InternetExplorer Browser....");
		}
		driver.manage().window().maximize();
		logger.info("Maximizing Browser....");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get(url);

		
		
		return driver;

		
	}
	

}
