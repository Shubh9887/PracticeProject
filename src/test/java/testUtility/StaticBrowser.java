package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser {
	
	static WebDriver driver;
	
	public static WebDriver openBrowser(String browser, String URL) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions opt = new ChromeOptions();				//Using due to error in Chrome 111 update to avoid SocketError
			opt.addArguments("---remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(opt);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
}