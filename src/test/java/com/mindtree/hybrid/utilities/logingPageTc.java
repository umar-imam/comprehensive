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

public class logingPageTc extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@Test
	
	public void Loging_Page() throws IOException
	
	{
				
				driver =initializeDriver();
				System.out.println(driver.getTitle());
				landingPage l=new landingPage(driver);
				l.getLogin().click();
				
				log.info("Logged In clicked successfully");
				l.getText().click();
				Assert.assertEquals(l.getText().getText(),"Login");
				logingPage lp= new logingPage(driver);
				lp.getEmail().sendKeys("bivoya6809@hypteo.com");
				lp.getPassword().sendKeys("king900");
				lp.getLogin().click();		
	}	
}
