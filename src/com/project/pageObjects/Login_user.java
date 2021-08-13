package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_user {
	
	WebDriver driver;
	
	By ClickAccount     = By.xpath("//*[text()='Account']");
	By ClickLogIn    	= By.xpath("//*[text()='Log In']");
	By LoginUser		= By.name("login[username]");
	By LoginPassword	= By.name("login[password]");
	By Submit			= By.name("send");
	
	
	public Login_user(WebDriver ldriver) 
	{
		this.driver=ldriver;
	}
	
	public void ClickOnAccount() 
	{
		driver.findElement(ClickAccount).click();
	}
	public void ClickOnLogin() 
	{
		driver.findElement(ClickLogIn).click();
	}
	public void EnterLoginUSer(String Luser) 
	{
		driver.findElement(LoginUser).sendKeys(Luser);
	}
	public void EnterLoginPassword(String Lpswd) 
	{
		driver.findElement(LoginPassword).sendKeys(Lpswd);
	}
	public void LoginButton() 
	{
		driver.findElement(Submit).click();
	}

}
