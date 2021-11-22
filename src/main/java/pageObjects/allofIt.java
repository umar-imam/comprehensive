package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allofIt {
	
	
	public WebDriver driver;
	
	
	By allofit=By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[12]/a");
	By next=By.xpath("//*[@id='CollectionAjaxContent']/div[2]/span[3]/a");
	By check=By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[5]/div/a/div[2]/div[1]");

	
	
	public allofIt(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}



	public WebElement getAll() {
		// TODO Auto-generated method stub
		return driver.findElement(allofit);
	}


	public WebElement getNext() {
		// TODO Auto-generated method stub
		return driver.findElement(next);
	}
	
	
	public  WebElement getText()
	{
		return driver.findElement(check);
	}




	public WebElement continuebutton() {
		
		return driver.findElement(check);
	}






	



	

}
