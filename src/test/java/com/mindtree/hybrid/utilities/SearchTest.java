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

public class SearchTest extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	
	@Test
	
	public void Search_page_navigation() throws IOException
	
	{
				driver =initializeDriver();
				
				System.out.println(driver.getTitle());
				searchPage sp=new searchPage(driver);
				sp.getSearch().sendKeys("socks");
				log.info("Item searched successfully");
				sp.getSearchIcon().click();
				log.info("Item added to cart successfully");
				sp.getCart().click();
				sp.getText().getText();
				
		        Assert.assertEquals(sp.getText().getText(),"Silicon Valley Socks");
		        System.out.println("Test Passed and value matched");
				
	}
}
