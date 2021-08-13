package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Order_Items {
	
	
		WebDriver driver;
	    By checkout		= By.xpath("//*[text()='Proceed to Checkout'][1]");
		By AddAddress	= By.xpath("//input[@title='Street Address'][1]");
		By AddCity		= By.xpath("//input[@title='City'][1]");
		//By region  		= By.name("billing[region_id]");
		By ZipCode	    = By.xpath("//input[@title='Zip'][1]");
		By BillingCountry  = By.name("billing[country_id]");
		By telephone    = By.name("billing[telephone]");
		By continue1		 = By.xpath("//span[text()='Continue']");
		By continue2		    = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button/span/span");
		By deliveryMethod  = By.xpath("//label[@for='p_method_checkmo']");
		By Continue3     = By.xpath("//*[@id=\"payment-buttons-container\"]/button/span/span");
		By placeorder   = By.xpath("//span[text()='Place Order']");
		By status			 = By.xpath("//*[text()='Your order has been received.']");   
		
		public Order_Items(WebDriver rdriver)
		{
			this.driver = rdriver;
		}
		
		public void ClickOnProceadToCheckout()  
		{
			driver.findElement(checkout).click();
			
		}
		
		public void EnterAddress() throws InterruptedException
		{
			driver.findElement(AddAddress).clear();
			driver.findElement(AddAddress).sendKeys("B-345, Sagar Avenue");
			Thread.sleep(2000);
			
		}
		
		public void EnterCity() throws InterruptedException
		{
			driver.findElement(AddCity).clear();
			driver.findElement(AddCity).sendKeys("Bhopal");
			Thread.sleep(2000);

		}			
			
			
			
			
//			WebElement ddown = driver.findElement(region);
//			ddown.click();
//			Select rgn = new Select(ddown);
//			rgn.selectByValue("24");
		
		public void EnterZipCode() throws InterruptedException
		{
			driver.findElement(ZipCode).clear();
			driver.findElement(ZipCode).sendKeys("243001");
			Thread.sleep(2000);
		}
			
		public void SelectCountry()  throws InterruptedException
		{
			WebElement ddown1 = driver.findElement(BillingCountry);
			ddown1.click();
			Select bc = new Select(ddown1);
			bc.selectByVisibleText("India");
			Thread.sleep(2000);
		}
			
		public void EnterTelephone() throws InterruptedException 
		{
			driver.findElement(telephone).clear();
			driver.findElement(telephone).sendKeys("7301084345");
			Thread.sleep(2000);
		}
			
		public void ClickContinueBttons() throws InterruptedException
		{
			driver.findElement(continue1).click();
			Thread.sleep(2000);
			driver.findElement(continue2).click();
			Thread.sleep(2000);
		}
		
		public void SelectDeliveryMethod() throws InterruptedException 
		{
			
			driver.findElement(deliveryMethod).click();
			Thread.sleep(2000);
			driver.findElement(Continue3).click();
			Thread.sleep(2000);
			
		}

		public void ClickOnPlaceOrder() throws InterruptedException 
		{
			
			driver.findElement(placeorder).click();
			Thread.sleep(2000);
		}
		
		

		public String CheckOrderStatus() throws InterruptedException {
			String ele = driver.findElement(status).getText();
			Thread.sleep(2000);
			return ele;
			
		}

		
		
			
			
}		
			
		

