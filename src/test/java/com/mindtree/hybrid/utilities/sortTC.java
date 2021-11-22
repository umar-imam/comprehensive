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
import pageObjects.sort;

import java.io.IOException;

public class sortTC extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@Test
	
	public void Sort_Product() throws IOException, InterruptedException
	
	{
				 driver =initializeDriver();		
				 sort st=new sort(driver);
				
				 st.getViewAll().click();
				 log.info("Navigated to sortlist");
				 st.getSortClick().click();
				 log.info("Product sorted successfully");
				 st.getSorted().click();
				
			     st.getText().getText();
				 Assert.assertEquals(st.getText().getText(),"Photo Clip String LED Lights");
				 System.out.println("Test Passed and value matched");
				
    }	
}
