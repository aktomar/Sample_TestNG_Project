package com.project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adding_Item_To_Cart {
	
	WebDriver driver;
	
	By search 		= By.id("search");  
	By SortBy 		= By.xpath("//*[@title='Sort By'][1]");
	By AddToCart    = By.xpath("//span[text()='Add to Cart']");
	By continueShop = By.xpath("//span[text()='Continue Shopping']");
	By AddCart		= By.xpath("//button[@title='Add to Cart'][1]");
	By SeeCart 		= By.xpath("//*[text()='Cart']");
	By ViewCart	    = By.xpath("//a[@class='cart-link']");
			

	
	public Adding_Item_To_Cart(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	//Search item.....
	public void VerifyEnterItem() 
	{
		driver.findElement(search).sendKeys("Mobile"+Keys.ENTER);
	}
	
	//Filter item by name....
	public void verfiyItemFilter() 
	{
		WebElement ddown = driver.findElement(SortBy);
		ddown.click();
		Select dd = new Select(ddown);
		dd.selectByIndex(1);
	}
	
	//Add item into cart
	public void VerifyAddItemToCart() 
	{
		driver.findElement(AddToCart).click();
	}
	
	//Click to continue shop
	public void VerifyContinueShop() 
	{
		driver.findElement(continueShop).click();
	}
	
	//Adding one more item into cart
	public void VerifyAgainEnterItem() 
	{
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys("TV"+Keys.ENTER);
	}
	
	//Adding item
	public void VerfiyAgainToAddItem() 
	{
		driver.findElement(AddCart).click();
	}
	
	//View item into Cart
	public void ViewCartDetails() 
	{
		driver.findElement(SeeCart).click();
		driver.findElement(ViewCart).click();
	}
}
