package seleniumdemo;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day12Demo18 {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger("Day12Demo18");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		logger.info("Browser Opened");
		String title=driver.getTitle();
		logger.info(title);

	}

}
