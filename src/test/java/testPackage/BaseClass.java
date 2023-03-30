package testPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.BrowserWait;
import testUtility.StaticBrowser;
import testUtility.TakeScreenshot;

public class BaseClass {
	  static WebDriver driver;
	  static ExtentReports report;
	  static ExtentHtmlReporter extent;
	  static ExtentTest logger;
	@Parameters({"browser"})			//Parameter to run browser through testng.xml
	
	@BeforeTest							//Executed before first @Test method
	public void beforeTest(String browser) {
		
		report = new ExtentReports();
		extent = new ExtentHtmlReporter("test-output"+File.separator+"Reports"+File.separator+"HRMOrange"+System.currentTimeMillis()+".html");
		report.attachReporter(extent);
		
		WebDriver driver = StaticBrowser.openBrowser(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		this.driver=driver;
		BrowserWait.waitFroBrowser(10, driver);			//Calling method for Implicit Wait
	}
	@AfterMethod
	public void captureScreenshot(ITestResult result) throws IOException, InterruptedException {
		Thread.sleep(1000);
		
		if(result.getStatus()==ITestResult.FAILURE) {				//Comparing result using ITestResult
		String path = TakeScreenshot.capturePageScreenshot(driver);
		logger.fail("Test case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());//String message will be displayed in Report if and only if our test cases is failed
		}
//		else if(result.getStatus()==ITestResult.SUCCESS) {
//			logger.pass("Test case is passed");
//		}
		logger.pass("Test case is passed");				//String message will be displayed in Report if and only if our test cases is passed
		report.flush();
		}
	
	@AfterTest
	public void afterTest() {
		  driver.quit();
	  }
}

