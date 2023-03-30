package testPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackages.DashboardPage_OrangeHRM;
import testUtility.BrowserWait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DashboardPage_TestClass extends BaseClass{
	SoftAssert s;
	DashboardPage_OrangeHRM dashboard;
	@BeforeClass
	  public void beforeClass() {
		s = new SoftAssert();
	  }

	 @BeforeMethod
	  public void beforeMethod() {
	  }

	 @Test
	  public void verifyTabsPresentOnDashboardPage() {
	
		 dashboard = new DashboardPage_OrangeHRM(driver);
		 
		 BrowserWait.waitFroBrowser(10, driver);
		 
		 dashboard.CheckVisibilityOfAdminTab();
		 boolean result = dashboard.CheckVisibilityOfAdminTab();
		 s.assertTrue(result); 

		 dashboard.CheckVisibilityOfPIMTab();
		 boolean result1 = dashboard.CheckVisibilityOfPIMTab();
		 s.assertTrue(result1);
		 
		 dashboard.CheckVisibilityOfLeaveTab();
		 boolean result2 = dashboard.CheckVisibilityOfLeaveTab();
		 s.assertTrue(result2);
		 
		 dashboard.CheckVisibilityOfTimeTab();
		 boolean result3 = dashboard.CheckVisibilityOfTimeTab();
		 s.assertTrue(result3);
		 
		 dashboard.CheckVisibilityOfRecruitmentTab();
		 boolean result4 = dashboard.CheckVisibilityOfRecruitmentTab();
		 s.assertTrue(result4);
		 
		 dashboard.CheckVisibilityOfMyInfoTab();
		 boolean result5 = dashboard.CheckVisibilityOfMyInfoTab();
		 s.assertTrue(result5);
		 
		 dashboard.CheckVisibilityOfPerformanceTab();
		 boolean result6 = dashboard.CheckVisibilityOfPerformanceTab();
		 s.assertTrue(result6);
		 
		 dashboard.CheckVisibilityOfDashboardTab();
		 boolean result7 = dashboard.CheckVisibilityOfDashboardTab();
		 s.assertTrue(result7);
		 
		 dashboard.CheckVisibilityOfDirectoryTab();
		 boolean result8 = dashboard.CheckVisibilityOfDirectoryTab();
		 s.assertTrue(result8);
		 
		 dashboard.CheckVisibilityOfMaintenanceTab();
		 boolean result9 = dashboard.CheckVisibilityOfMaintenanceTab();
		 s.assertTrue(result9);
		 
		 dashboard.CheckVisibilityOfBuzzTab();
		 boolean result10 = dashboard.CheckVisibilityOfBuzzTab();
		 s.assertTrue(result10);
		 
		s.assertAll();
	  }
	 
  
	 @AfterClass
	  public void afterClass() {	 
	  }
}
