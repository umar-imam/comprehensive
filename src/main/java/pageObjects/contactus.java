package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactus {
	
	
	public WebDriver driver;
	
	By cont=By.xpath("//*[@id=\'shopify-section-footer\']/footer[1]/div[1]/div[1]/div[3]/ul/li[1]/a");
	By conname=By.id("ContactFormName-page-contact-template-0");
	By conemail=By.id("ContactFormEmail-page-contact-template-0");
	By conmsg=By.id("ContactFormMessage-page-contact-template-0");
	By consend=By.xpath("//*[@id='contact_form']/button");
	
	
	
	public contactus(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}




	public  WebElement getContact()
	{
		return driver.findElement(cont);
	}
	
	
	public  WebElement getContName()
	{
		return driver.findElement(conname);
	}
	

	public  WebElement getContEmail()
	{
		return driver.findElement(conemail);
	}
	
	

	public  WebElement getContMsg()
	{
		return driver.findElement(conmsg);
	}
	
	public  WebElement getContSend()
	{
		return driver.findElement(consend);
	}
	


	

}
