package com.mindtree.hybrid.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.hybrid.comprehensive.base;

import pageObjects.allofIt;
import pageObjects.contactus;
import pageObjects.giftCardpage;
import pageObjects.landingPage;
import pageObjects.logingPage;
import pageObjects.searchPage;

import java.io.IOException;

public class allOfItTC extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());

	
	@Test
	
	public void Home_Items() throws IOException, InterruptedException
	
	{
				
					driver =initializeDriver();
					allofIt af=new allofIt(driver);
		
					af.getAll().click();
					log.info("Navigated to next page successfully");
					af.getNext().click();
				
					af.getText().getText();
					Assert.assertEquals(af.getText().getText(),"Snow Globe String LED Lights");
					Assert.assertTrue(af.continuebutton().isDisplayed());
					Thread.sleep(3000);
					System.out.println("Test Passed and value matched");
			
	}	
}
