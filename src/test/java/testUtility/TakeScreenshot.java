package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static String capturePageScreenshot(WebDriver driver) throws IOException {
		
		String currentDirectory=System.getProperty("user.dir");
		
		String path =currentDirectory+File.separator+"test-output"+File.separator+"Screenshots"+System.currentTimeMillis()+".png";

		//String path ="D:\\Software Testing\\Eclipse-Workspace\\Orange_HRM\\test-output\\Screenshots"+System.currentTimeMillis()+".png";
		
		//String source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
		File fileSource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File (path);

		FileHandler.copy(fileSource, destination);
		
		return path;
		
	}
}
