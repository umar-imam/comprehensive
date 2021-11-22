package com.mindtree.hybrid.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.hybrid.comprehensive.base;

import pageObjects.giftCardpage;
import pageObjects.hovertestcase;
import pageObjects.landingPage;
import pageObjects.logingPage;
import pageObjects.searchPage;

import java.io.IOException;

public class hoverTC extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@Test
	
	public void Hover_Page_Navigation() throws IOException, InterruptedException
	
	{
			
				driver =initializeDriver();
			    hovertestcase hc= new hovertestcase(driver);
			    
			    Actions s=new Actions(driver);
			    WebElement we=hc.getClick1();
			    s.moveToElement(we).perform();
			    Thread.sleep(3000);
				hc.getClick2().click();
				log.info("Hover clicked successfully");
				hc.getHovPro().click();
				log.info("Added to cart successfully");
				hc.getHovCart().click();	
				hc.getText().getText();
				
				Assert.assertEquals(hc.getText().getText(),"Iron Man LED Lamp");
				System.out.println("Test Passed and value matched");	
	}	
}
