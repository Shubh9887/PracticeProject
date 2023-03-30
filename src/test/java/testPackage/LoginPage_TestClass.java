package testPackage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackages.LogInPage_OrangeHRM;
import testUtility.ReadFileData;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
public class LoginPage_TestClass extends BaseClass {
	LogInPage_OrangeHRM  login;
	ReadFileData r;
	SoftAssert s = new SoftAssert();	
  @BeforeClass				//In BeforeClass we can write code for handling alert, create object, etc
  public void beforeClass() {		
  }
 
  @Test(priority=0)
  public void VerifyLoginPageWithInvalidDetails1() throws InterruptedException, EncryptedDocumentException, IOException {
		logger = report.createTest("Verify Login Page With Invalid Details");
	  	login = new LogInPage_OrangeHRM(driver);
		login.sendUsername(r.fetchDataFromExcel(2, 0));
		login.sendPassword(r.fetchDataFromExcel(2, 1));	
		login.clickOnLoginButton();
		String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String CurrentURL = driver.getCurrentUrl();
		s.assertNotEquals(CurrentURL, ExpectedURL);
		s.assertAll();
		//Assert.assertEquals(CurrentURL, ExpectedURL);	
  }
  
  @Test(priority=1)
  public void VerifyLoginPageWithInvalidDetails2() throws InterruptedException, EncryptedDocumentException, IOException {
		logger = report.createTest("Verify Login Page With Invalid Details");
		login = new LogInPage_OrangeHRM(driver);		
		login.ClearBox();
		login.sendUsername(r.fetchDataFromExcel(3, 0));
		login.sendPassword(r.fetchDataFromExcel(3, 1));	
		login.clickOnLoginButton();
		String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String CurrentURL = driver.getCurrentUrl();
		s.assertNotEquals(CurrentURL, ExpectedURL);
		s.assertAll();
		//Assert.assertEquals(CurrentURL, ExpectedURL);	
  }
  
  @Test(priority=0)
  public void VerifyLoginPage()  {
		logger = report.createTest("Verify Login Page");
		Assert.fail();	
  }
 
@Test(priority=2)
  public void VerifyLoginPageWithValidDetails() throws InterruptedException, EncryptedDocumentException, IOException {
		logger = report.createTest("Verify Login Page With Valid Details");	
		login = new LogInPage_OrangeHRM(driver);		
		login.sendUsername(r.fetchDataFromExcel(1, 0));
		login.sendPassword(r.fetchDataFromExcel(1, 1));	
		login.clickOnLoginButton();
	
		String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL, ExpectedURL);
  }
}
