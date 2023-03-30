package pomPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.ElementWait;

public class DashboardPage_OrangeHRM {
	WebDriver driver;

	@FindBy(xpath="//span[text()='Admin']")
	private WebElement AdminTab;
	
	@FindBy (xpath="//span[text()='PIM']")
	private WebElement PIMTab;

	@FindBy (xpath="//span[text()='Leave']")
	private WebElement LeaveTab;
	
	@FindBy (xpath="//span[text()='Time']")
	private WebElement TimeTab;
	
	@FindBy (xpath="//span[text()='Recruitment']")
	private WebElement RecruitmentTab;

	@FindBy (xpath="//span[text()='My Info']")
	private WebElement MyInfoTab;
	
	@FindBy (xpath="//span[text()='Performance']")
	private WebElement PerformanceTab;
	
	@FindBy (xpath="//span[text()='Dashboard']")
	private WebElement DashboardTab;
	
	@FindBy (xpath="//span[text()='Directory']")
	private WebElement DirectoryTab;
	
	@FindBy (xpath="//span[text()='Maintenance']")
	private WebElement MaintenanceTab;
	
	@FindBy (xpath="//span[text()='Buzz']")
	private WebElement BuzzTab;
	
	public DashboardPage_OrangeHRM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}
	

	public boolean CheckVisibilityOfAdminTab() {
		ElementWait.waitForElement("//span[text()='Admin']", 20, driver);
		return AdminTab.isDisplayed();
		
	}
	
	public boolean CheckVisibilityOfPIMTab() {
		return PIMTab.isDisplayed();
		
	}
	
	public boolean CheckVisibilityOfLeaveTab() {
		return LeaveTab.isDisplayed();
	}

	public boolean CheckVisibilityOfTimeTab() {
		return TimeTab.isDisplayed();
	}

	public boolean CheckVisibilityOfRecruitmentTab() {
		return RecruitmentTab.isDisplayed();
	}

	public boolean CheckVisibilityOfMyInfoTab() {
		return MyInfoTab.isDisplayed();
	}

	public boolean CheckVisibilityOfPerformanceTab() {
		return PerformanceTab.isDisplayed();
	}

	public boolean CheckVisibilityOfDashboardTab() {
		return DashboardTab.isDisplayed();
	}
	
	public boolean CheckVisibilityOfDirectoryTab() {
		return DirectoryTab.isDisplayed();
	}

	public boolean CheckVisibilityOfMaintenanceTab() {
		return MaintenanceTab.isDisplayed();
	}
	
	public boolean CheckVisibilityOfBuzzTab() {
		return 	BuzzTab.isDisplayed();
	}
	
}
