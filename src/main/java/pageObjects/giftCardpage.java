package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class giftCardpage {
	
	
	public WebDriver driver;
	
	By gcard=By.cssSelector("a[class*='giftcardlink']");
	By gvalue=By.xpath("//*[@id=\'ProductSelect-738195636312-option-0\']/div[2]/label");
	By gcheck=By.cssSelector("span[class*='money']");
	By gcart=By.cssSelector("button[class*='spice-submit-button']");

	
	
	public giftCardpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}




	public  WebElement getGiftCard()
	{
		return driver.findElement(gcard);
	}
	

	public  WebElement getGiftValue()
	{
		return driver.findElement(gvalue);
	}




	public  WebElement getText()
	{
		return driver.findElement(gcheck);
	}
	

	public  WebElement getGiftcart()
	{
		return driver.findElement(gcart);
	}
	

}
