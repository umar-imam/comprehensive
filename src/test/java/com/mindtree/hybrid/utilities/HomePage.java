package com.mindtree.hybrid.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mindtree.hybrid.comprehensive.base;

import pageObjects.landingPage;
import pageObjects.logingPage;
import pageObjects.searchPage;

import java.io.IOException;

public class HomePage extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());

	
	@Test
	
	public void Home_Page_Navigation() throws IOException
	
		{
				driver =initializeDriver();
				landingPage lp= new landingPage(driver);
				
				 lp.getwhatsNew().click();
				 log.info("Clicked successfully");
				 
			   
	    
	   /* Assert.assertEquals(lp.getText().getText(),"Iron Man LED Lamp");
		 System.out.println("Test Passed and value matched");*/		
			
	}	
}
