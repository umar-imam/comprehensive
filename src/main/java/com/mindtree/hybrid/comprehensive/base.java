package com.mindtree.hybrid.comprehensive;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class base {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 public static ExtentTest test;
	 public static ExtentSparkReporter spark;
	 public static ExtentReports extent;
	
	 public base()
	 {
		 spark = new ExtentSparkReporter("htmlReport//index.html");
		 extent = new ExtentReports();
		 spark.config().setTheme(Theme.STANDARD);
		 spark.config().setDocumentTitle("Automate Report");
		 spark.config().setReportName("Extent Report");
		 extent.attachReporter(spark);
	 }
	 
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\Umar Imam\\eclipse-workspace\\Demo1\\src\\main\\java\\com\\mindtree\\hybrid\\comprehensive\\property.properties");
		
		prop.load(file);
		String browserName=prop.getProperty("browser");
		String urlName=prop.getProperty("url");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umar Imam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-notifications");
			driver= new ChromeDriver(options);
			
		}
		
		else if(browserName.equalsIgnoreCase("FireFox"))
		{
		    //code for firefox
		}
		
		
		else if(browserName.equalsIgnoreCase("IE"))
			
		{
			//code for Internet Explorer
		}
	
		driver.get(urlName);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
	    driver.quit();
	}

	
	
		
	}

