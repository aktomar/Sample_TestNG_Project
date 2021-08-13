package com.project.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.pageObjects.Adding_Item_To_Cart;
import com.project.pageObjects.Login_user;
import com.project.pageObjects.Order_Items;
import com.project.utilities.BrowserFactory;
import com.project.utilities.ReadConfig;

public class TC_PlaceOrder_004 {
	
	ReadConfig cp = new ReadConfig();
	
	public String Email = cp.EnterEmailid();
	public String pswd = cp.EnterPassword();
	public static Logger logger;
		
		@Test
		public void VerifyAddToCartItems() throws InterruptedException 
		{
	        WebDriver driver =  BrowserFactory.setup("chrome","http://live.demoguru99.com/");
	        
	        //Creating Registor_User object to access its methods...
	        Login_user lu = PageFactory.initElements(driver,Login_user.class);
	        
	        //Creating Adding_Item_To_Cart object to access its methods...
	        Adding_Item_To_Cart atc = PageFactory.initElements(driver,Adding_Item_To_Cart.class);
	        
	      //Creating Order_Items object to access its methods...
	        Order_Items oit = PageFactory.initElements(driver,Order_Items.class);
	        
	        //Creating logger class object to generate logs
	        logger = Logger.getLogger(BrowserFactory.class);
	    	PropertyConfigurator.configure("D:\\Automation\\iNetBanking\\log4j.properties");

	    	//Calling methods.....
	    	//Login to application.......
	    	lu.ClickOnAccount();
	    	logger.info("Clicked on Account...");
	    	lu.ClickOnLogin();
	    	logger.info("Clicked on Login...");
	    	lu.EnterLoginUSer(Email);
	    	logger.info("Username Entered...");
	    	lu.EnterLoginPassword(pswd);
	    	logger.info("Username Entered...");
	    	lu.LoginButton();
	    	logger.info("Clicked Login Button...");
	    	Thread.sleep(3000);
	    	
	    	//Adding items to the Cart.......
	    	
	    	atc.VerifyEnterItem();
	    	logger.info("Searched item...");
	    	atc.verfiyItemFilter();
	    	logger.info("Item filtered...");
	    	atc.VerifyAddItemToCart();
	    	logger.info("Item Added to the cart...");
	    	atc.VerifyContinueShop();
	    	logger.info("Clicked on continue to shop...");
	    	atc.VerifyAgainEnterItem();
	    	logger.info("Searched One more item...");
	    	atc.VerfiyAgainToAddItem();
	    	logger.info("One more item Added to the cart...");
	    	atc.ViewCartDetails();
	    	logger.info("Cart details displayed...");
	    	Thread.sleep(3000);
	    	
	    	//Fill customer details to place an order....
	    	oit.ClickOnProceadToCheckout();
	    	logger.info("Clicked on procead to checkOut...");
	    	oit.EnterAddress();
	    	logger.info("Address entered....");
	    	oit.EnterCity();
	    	logger.info("OCity Entered...");
	    	oit.EnterZipCode();
	    	logger.info("ZipCode Entered...");
	    	oit.SelectCountry();
	    	logger.info("Country Selected...");
	    	oit.EnterTelephone();
	    	logger.info("Telephone Entered...");
	    	oit.ClickContinueBttons();
	    	logger.info("Clicked on continues buttons...");
	    	oit.SelectDeliveryMethod();
	    	logger.info("Delivery Method selected and continue...");
	    	oit.ClickOnPlaceOrder();
	    	logger.info("Clicked Place order...");
	    	String status = oit.CheckOrderStatus();
	    	System.out.println(status);
	    	logger.info("*****ORDER PLACED******");

	    	
	    	driver.quit();
	    	logger.info("Browser Closed...");
	    	


	    	



	    	
	    	
		
		
		
		}

}
