package pomPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.ElementWait;

public class AdminPage_OrangeHRM {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement AdminButton;
	
//	@FindBy(how = How.XPATH,using="//span[text()='Admin']")
//	private WebElement AdminButton1;
	
	@FindBy(xpath="//span[text()='User Management ']")
	private WebElement UsermanagementDropdown;
	
	@FindBy(xpath="//a[.='Users']")
	private WebElement UserTab;
	
	
	@FindBy(xpath="(//input[contains(@class,'input')])[2]")
	private WebElement Username;
	
	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	private WebElement UserRole;
	
	@FindBy(xpath="//(//span[text()='Admin'])[2]")
	private WebElement AdminOption;
	
	@FindBy(xpath="//div[@role='listbox']//div[3]")
	private WebElement ESS;
	
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
	private WebElement EmployeeName;
	
	@FindBy(xpath="(//div[@class=\"oxd-select-wrapper\"]//div)[4]")
	private WebElement Status;

	@FindBy(xpath="//div[@role=\"option\"]//span[.='Enabled']")
	private WebElement statusEnabled;
	
	
	@FindBy(xpath="//span[text()='Job ']")
	private WebElement JobDropdown;
	
	@FindBy(xpath="//span[text()='Organization ']")
	private WebElement OrganizationDropdown;
	
	@FindBy(xpath="//span[text()='Qualifications ']")
	private WebElement QualificationsDropdown;

	@FindBy(xpath="//a[text()='Nationalities']")
	private WebElement NationalitiesTab;
	
	@FindBy(xpath="//span[text()='More ']")
	private WebElement MoreTab;

	public AdminPage_OrangeHRM(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*Constructor in POM Class:
	 * Reason why we create constructor in POM class:
	 * 1. We declare constructor in POM class so that we can use instance of Web Driver in all the WebPages 
	 * so that when ever we are running any script it should run in one or same browser only, it should not open 
	 * differennt browser fro different pages.
	 * 2. If we are using PageFactory which will help us to initailize all the Web Elements that we have written
	 * using @FindBy annotation in that same class by using init element method of PageFactory
	 * 
	 * When we create object of this class i.e. AdminPage_OrangeHRM it is automaticlly going to call this constructor and same instance
	 * is used in that class as well
	 * 
	 */
	
	public void AdminButton() {
		ElementWait.waitForElement("//span[text()='Admin']", 10, driver);
		AdminButton.click();
	}
	
	public void ClickOnUserManagement() {
		ElementWait.waitForElement("//span[text()='User Management ']", 10, driver);
		UsermanagementDropdown.click();
	}
	
	public void ClickOnUserTab() {
		ElementWait.waitForElement("//a[.='Users']", 10, driver);
		UserTab.click();
	}
	
	public void sendUsername(String username) {
		ElementWait.waitForElement("(//input[contains(@class,'input')])[2]", 10, driver);
		Username.sendKeys(username);
	}
	
	public void selectUserRole() {
		UserRole.click();
	}
	
	public void selectAdminOption() {
		AdminButton.click();
	}
	
	public void selectESS() {
		ESS.click();
	}
	
	public void sendEmployeeName(String employeeName) {
		EmployeeName.sendKeys(employeeName);
	}
	
	public void selectStatus() {
		Status.click();
	}
	
	public void selectStatusEnabled() {
		statusEnabled.click();
	}
	
	public void ClickOnJobButton() {
		JobDropdown.click();
	}
	
	public void ClickOnOrganizationButton() {
		OrganizationDropdown.click();
	}
	
	public void ClickOnQualificationsButton() {
		QualificationsDropdown.click();
	}
	
	public void ClickOnNationalities() {
		NationalitiesTab.click();
	}
	
	public void ClickOnMore() {
		MoreTab.click();
	}
	
}
