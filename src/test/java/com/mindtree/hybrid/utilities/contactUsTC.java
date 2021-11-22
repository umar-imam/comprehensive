package com.mindtree.hybrid.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.hybrid.comprehensive.base;

import pageObjects.contactus;
import pageObjects.giftCardpage;
import pageObjects.landingPage;
import pageObjects.logingPage;
import pageObjects.searchPage;

import java.io.IOException;

public class contactUsTC extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());

	
	@Test
	
	public void Contact_Page() throws IOException, InterruptedException
	
	{
			
				driver =initializeDriver();
				contactus cu=new contactus(driver);
			
				log.info("CLick on Contact successfully");
			
				cu.getContact().click();
				cu.getContName().sendKeys("Imam");
				cu.getContEmail().sendKeys("xyz@gmail.com");
				cu.getContMsg().sendKeys("Delay in Delivery");
				cu.getContSend().click();
				
				System.out.println("Test Passed and value matched");
			
		
			
	}	
	
}
