package seleniumdemo;

import java.io.File;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Day12Demo19 {

	public static void main(String[] args) {
		ExtentReports extent;
		ExtentTest logger;
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/deema.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		logger=extent.startTest("First Test");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		logger.log(LogStatus.PASS, title);
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}

}
