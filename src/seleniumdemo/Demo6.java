package seleniumdemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.navigate().to("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			Actions button = new Actions(driver);
			button.sendKeys(Keys.ENTER).perform();
			button.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();

	}

}
