package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wishList {
	
	
	public WebDriver driver;
	
	By homedecore=By.xpath("//*[@id=\'shopify-section-1601980218b6c234f6\']/div/div/div[2]/a/div/div/div/button");
	By decorProduct=By.cssSelector("a[class*='grid-product__link']");
	By addwishlist=By.cssSelector("button[class*='swym-loaded']");
	By checkwishlist=By.cssSelector("a[class*='swym-redirect']");

	
	
	public wishList(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	

	public  WebElement getHomeDecor()
	{
		return driver.findElement(homedecore);
	}

	public  WebElement getDecoPro()
	{
		return driver.findElement(decorProduct);
	}
	

	public  WebElement getWishList()
	{
		return driver.findElement(addwishlist);
	}


	public WebElement getText() {
		
		return driver.findElement(checkwishlist);
	}
}
