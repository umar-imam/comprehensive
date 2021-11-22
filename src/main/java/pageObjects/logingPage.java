package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logingPage {
	
	
	public WebDriver driver;
	
	By email=By.id("CustomerEmail");
	By password=By.id("CustomerPassword");
	By login=By.xpath("//*[@id='customer_login']/p[1]/input");
	
	
	
	
	public logingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}




	public  WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public  WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public  WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	
	
	

}
