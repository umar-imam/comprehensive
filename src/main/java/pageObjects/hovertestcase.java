package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hovertestcase {
	
	
	public WebDriver driver;
	
	By hov=By.cssSelector("a[class*='site-nav__link--has-dropdown']");
	By hovInside=By.cssSelector("a[class*='site-nav__dropdown-link--second-level']");
	By hovpro=By.cssSelector("div[class*='grid-product__title']");
	By hovcart=By.cssSelector("button[class*='spice-submit-button']");
	By hovcheck=By.cssSelector("[class*='product-single__title']");
	

	
	
	public hovertestcase(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}




	public WebElement getClick1() 
	{
		
		return driver.findElement(hov);
	}
	

	public WebElement getClick2() 
	{
		
		return driver.findElement(hovInside);
	}
	
	
	public WebElement getHovCart() 
	{
		
		return driver.findElement(hovcart);
	}


	public WebElement getHovPro() {
		// 
		return driver.findElement(hovpro);
	}
	

	public  WebElement getText()
	{
		return driver.findElement(hovcheck);
	}
	
}
