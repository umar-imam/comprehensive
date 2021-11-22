package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	
	public WebDriver driver;
		
		By whatsNew=By.xpath("//*[@id='shopify-section-1598476309369']/div/a/div"); 
		By logintext=By.cssSelector("h1[class*='section-header__title']");
		By login=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]/span\r\n"+ "");
		
	
	
	
	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public  WebElement getwhatsNew()
	{
		return driver.findElement(whatsNew);
		
	}
	
	public  WebElement getText()
	{
		return driver.findElement(logintext);
	}

	public  WebElement getLogin()
	{
		return driver.findElement(login);
	}


	

}
