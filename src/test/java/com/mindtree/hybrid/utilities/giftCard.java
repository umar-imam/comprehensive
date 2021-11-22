package com.mindtree.hybrid.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.hybrid.comprehensive.base;

import pageObjects.giftCardpage;
import pageObjects.landingPage;
import pageObjects.logingPage;
import pageObjects.searchPage;

import java.io.IOException;

public class giftCard extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());

	
	@Test
	
	public void GiftCard_Page() throws IOException, InterruptedException
	
	{
			
				driver =initializeDriver();		
				giftCardpage gc= new giftCardpage(driver);
				
				gc.getGiftCard().click();
				log.info("Gift card value changed successfully");
				gc.getGiftValue().click();
				log.info("Added to cart successfully");
				gc.getGiftcart().click();
			    gc.getText().getText();
			    
			    Assert.assertEquals(gc.getText().getText(),"Rs. 1,000");
			    Thread.sleep(3000);
			    System.out.println("Test Passed and value matched");
				
	}	
}
