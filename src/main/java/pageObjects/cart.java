package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart {
	
	
	public WebDriver driver;
	
	//public ExtentTest test;
	public cart(WebDriver driver) 
	{
	this.driver=driver;
	//this.test=test;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@class='carticonimage']")
	WebElement cart;
	 @FindBy(xpath="//div[contains(text(),'Lord Shiva Adiyogi Figurine')]")
	 WebElement product;
	 @FindBy(xpath="//button[@name='add']")
	 WebElement add;
	@FindBy(xpath="//span[contains(text(),'Go To Checkout')]")
	WebElement checkout;
	@FindBy(xpath=" //img[@class='wa-optin-widget-close-img']")
	WebElement remove_whatsapp;
	@FindBy(xpath="//button[@id='continue_button']")
	WebElement continuebutton;
	public WebElement Cart() {
	return cart;
	}
	 public WebElement product_selection()
	 {
	 return product;
	 }
	 
	 public WebElement Add_cart()
	 {
	 return add;
	 }
	 
	public WebElement Go_Checkout()
	{
	return checkout;
	}
	
	public WebElement Remove_whatsappimg()
	{
	return remove_whatsapp;
	}
	
	public WebElement continuebutton()
	{
	return continuebutton;
	}
}

