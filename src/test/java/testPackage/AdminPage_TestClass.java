package testPackage;

import org.testng.annotations.Test;

import pomPackages.AdminPage_OrangeHRM;
import testUtility.BrowserWait;

public class AdminPage_TestClass extends BaseClass{
	AdminPage_OrangeHRM admin;
	
	@Test
	public void sendDataInAdminPage() {
		admin = new AdminPage_OrangeHRM(driver);
		
		BrowserWait.waitFroBrowser(10, driver);
		
		admin.AdminButton();
		
		admin.ClickOnUserManagement();
		
		admin.ClickOnUserTab();
		
		admin.sendUsername("tony123");
			
	}
}
