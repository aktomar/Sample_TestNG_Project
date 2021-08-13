package com.project.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.project.pageObjects.Registor_User;
import com.project.utilities.BrowserFactory;
import com.project.utilities.ReadConfig;
//Implemented Listner at class level
//@Listeners(implimentingListners.TestNgListners.class)

public class TC_RegistorUser_001 {
	

	
	ReadConfig cp = new ReadConfig();
			public String fname = cp.EnterFname();
			public String lname = cp.EnterLname();
			public String Email = cp.EnterEmailid();
			public String pswd = cp.EnterPassword();
			public String cpswd = cp.ConfirmPassword();
	     
	public static Logger logger;
	
	
	
	
	@Test
	public void VerifyUserRegistorDetails() throws InterruptedException 
	{
		 
        WebDriver driver =  BrowserFactory.setup("chrome","http://live.demoguru99.com/");
        Registor_User ru = PageFactory.initElements(driver,Registor_User.class);
        logger = Logger.getLogger(BrowserFactory.class);
		PropertyConfigurator.configure("D:\\Automation\\iNetBanking\\log4j.properties");
		
		
		
	
			ru.ClickOnAccount();
			logger.info("Account Clicked....");
			ru.ClickOnRegistor();
			logger.info("Registor Clicked....");
			ru.EnterFirstname(fname);
			logger.info("Enter User Firstname....");
			ru.EnterLastName(lname);
			logger.info("Enter User Lastname....");
			ru.EnterEmailAddress(Email);
			logger.info("Enter User EmailAddress....");
			ru.EnterPassword(pswd);
			logger.info("Enter User Password....");
			ru.EnterConfirmPassword(cpswd);
			logger.info("Confirm password....");
			ru.SubmitDetails();
			logger.info("Submitted user details....");
		    
			String text = ru.verifysubmittext();
		
			if(text.equals("Thank you for registering with Main Website Store."))
			{
				Assert.assertTrue(true);
				System.out.println(text);
			}
			else 
			{
				Assert.assertTrue(false);
			
			}
			
	
			driver.quit();
			logger.info("Browser closed.....");

	
	}

}
