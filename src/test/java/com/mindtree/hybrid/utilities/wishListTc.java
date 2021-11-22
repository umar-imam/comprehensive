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
import pageObjects.wishList;

import java.io.IOException;

public class wishListTc extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	@Test
	
	public void WishList() throws IOException, InterruptedException
	
		{
					 driver =initializeDriver();		
				     wishList wl= new wishList(driver);
						
					 wl.getHomeDecor().click();
			   		 log.info("Navigated to wishlist");
					 wl.getDecoPro().click();
				     log.info("Product added to wishlist successfully");
				     wl.getWishList().click();
					 Thread.sleep(3000);
					 wl.getText().getText();
						 
					 Assert.assertTrue(wl.getText().isDisplayed());
					 log.info("successfully navigated to the checkout page");
					 Assert.assertEquals(wl.getText().getText(),"The item has been added to your wishlist");
					 System.out.println("Test Passed and value matched");		
	}	
}
