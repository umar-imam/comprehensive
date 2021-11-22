
package listeners;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.mindtree.hybrid.comprehensive.base;


public class Listener extends base implements ITestListener 

{ 
	public void onTestFailure(ITestResult result)
	
	{
			ExtentTest test=extent.createTest(driver.getTitle());
			String screenshotpath=null;
			if(result.getStatus()==ITestResult.FAILURE)
		 
		{
			try
			 
		   	  {
				screenshotpath=takeScreenShot.capture(driver, "screenshotforExtentReport");
		      }
				  catch (IOException e)
			{
				  e.printStackTrace();
		    }
			        test.getStatus();
			        test.log(Status.PASS, result.getName());
					test.log(Status.FAIL, result.getThrowable());
					test.fail("Test not matched",MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
					extent.flush();
		  }	
}
	
		public void onTestSuccess(ITestResult result)
		
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		
		{
			ExtentTest test4=extent.createTest(driver.getTitle());
			String screenshotpath = null;
			
			try
			{
				screenshotpath = takeScreenShot.capture(driver, "screenshotforExtentReport");
			}   catch (IOException e)
			
			{
				e.printStackTrace();
			}
				
				test4.info("Umar Imam");
				test4.log(Status.PASS, result.getName());
				test4.pass("Test Succeeded",MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
				extent.flush();
			}
	}
@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}
@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}
@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}

