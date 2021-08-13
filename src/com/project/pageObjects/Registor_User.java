package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public  class Registor_User {
	
	 WebDriver driver;
	
	By ClickAccount     = By.xpath("//*[text()='Account']");
	By ClickRegisotr    = By.xpath("//*[text()='Register']");
	By Firstname        = By.name("firstname");
	By Lastname			= By.name("lastname");
	By Email 			= By.name("email");
	By Password			= By.name("password");
	By ConfirmPassword  = By.name("confirmation");
	By Registor			= By.xpath("//*[@id=\"form-validate\"]/div[2]/button");
	By text 			= By.xpath("//span[text()='Thank you for registering with Main Website Store.']");
	By wrongtext 		= By.xpath("//*[contains(text(),'There is already an account with this email address.')]");
	
	
	
	
	public Registor_User(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
	 
	
	public void ClickOnAccount() 
	{
		driver.findElement(ClickAccount).click();
	}
	public void ClickOnRegistor() 
	{
		driver.findElement(ClickRegisotr).click();
	}
	public void EnterFirstname(String fname) 
	{
		driver.findElement(Firstname).sendKeys(fname);
	}
	public void EnterLastName(String lname) 
	{
		driver.findElement(Lastname).sendKeys(lname);
	}
	public void EnterEmailAddress(String email) 
	{
		driver.findElement(Email).sendKeys(email);;
	}
	public void EnterPassword(String pswd) 
	{
		driver.findElement(Password).sendKeys(pswd);;
	}
	public void EnterConfirmPassword(String confirmPswd) 
	{
		driver.findElement(ConfirmPassword).sendKeys(confirmPswd);;
	}
	public void SubmitDetails() 
	{
		driver.findElement(Registor).click();
	}
	public String verifysubmittext() {
		
		String txt = driver.findElement(text).getText();
		return txt;
	}
    public String verifyWrongsubmittext() {
		
		String txt1 = driver.findElement(wrongtext).getText();
		return txt1;
	}
	
	
	

}
