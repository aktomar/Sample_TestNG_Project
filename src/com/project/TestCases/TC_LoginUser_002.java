package com.project.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.project.pageObjects.Login_user;

import com.project.utilities.BrowserFactory;
import com.project.utilities.ReadConfig;

//Implemented Listner at class level
//@Listeners(implimentingListners.TestNgListners.class)
public class TC_LoginUser_002 {
	
	ReadConfig cp = new ReadConfig();
	
	public String LoginUser = cp.EnterEmailid();
	public String Loginpswd = cp.EnterPassword();
	
 
    public static Logger logger;
	
	
	@Test
	public void VerifyLoginUserDetails() throws InterruptedException 
	{
		
		 WebDriver driver =  BrowserFactory.setup("chrome","http://live.demoguru99.com/");
		    Login_user ru = PageFactory.initElements(driver,Login_user.class);
	        logger = Logger.getLogger(BrowserFactory.class);
			PropertyConfigurator.configure("D:\\Automation\\iNetBanking\\log4j.properties");
			
		    Login_user login = new Login_user(driver);
		    login.ClickOnAccount();
		    login.ClickOnLogin();
		    login.EnterLoginUSer(LoginUser);
		    login.EnterLoginPassword(Loginpswd);
		    login.LoginButton();

			driver.quit();
			logger.info("Browser closed.....");
		
			
	}

}
