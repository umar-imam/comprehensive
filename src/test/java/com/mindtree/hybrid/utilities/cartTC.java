package com.mindtree.hybrid.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.hybrid.comprehensive.base;

import pageObjects.cart;
import pageObjects.contactus;
import pageObjects.giftCardpage;
import pageObjects.landingPage;
import pageObjects.logingPage;
import pageObjects.searchPage;

import java.io.IOException;

public class cartTC extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());

	@Test
	public void cart_checkout() throws IOException, InterruptedException
	
	{
				driver =initializeDriver();
			    cart c=new cart(driver);
		
			    log.info("Navigated to cart");
			   
			    
			    c.product_selection().click();
			    c.Add_cart().click();
			    c.Cart().click();
			
			    log.info("Product added to cart successfully");
			
			
			    c.Go_Checkout().click();
			    c.Remove_whatsappimg().click();
			
			    Assert.assertTrue(c.continuebutton().isDisplayed());
			    log.info("successfully navigated to the checkout page");
			    
			
	}
}
	
	
	

