package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo11casepreceefollo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/CSTS/selenium%20training/table.html");
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]//following-sibling::td[2]")).getText());;
	}

}
