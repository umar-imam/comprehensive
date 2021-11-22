package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
	
	public WebDriver driver;
	
	By search=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	By dropsearch=By.xpath("//*[@id=\'snize-ac-product-6111616237766\']/a");
	By cart=By.name("add");
	By text=By.cssSelector("h1[class*='product-single__title']");
	
	
	public searchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public  WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
	public  WebElement getSearchIcon()
	{
		return driver.findElement(dropsearch);
	}

	public  WebElement getCart()
	{
		return driver.findElement(cart);
	}
	
	public  WebElement getText()
	{
		return driver.findElement(text);
	}
}
