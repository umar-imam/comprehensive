package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sort {
	
	
	public WebDriver driver;
	
	
	By view=By.cssSelector("a[class*='btn btn-default']");
	By sortclick=By.id("sortBy");
	By sorted=By.xpath("//*[@id='sortBy']/option[3]");
	By check=By.cssSelector("div[class*='grid-product__title']");
	
	
	public sort(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	
	public  WebElement getViewAll()
	{
		return driver.findElement(view);
	}
	


	public  WebElement getSortClick()
	{
		return driver.findElement(sortclick);
	}
	

	public  WebElement getSorted()
	{
		return driver.findElement(sorted);
	}
	

	public  WebElement getText()
	{
		return driver.findElement(check);
	}
}
