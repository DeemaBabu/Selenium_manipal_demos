package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//WebElement link=driver.findElement(By.linkText("Car Rentals"));
		WebElement link=driver.findElement(By.xpath("//*[contains(text(),'Car Rentals')]"));
		Actions build=new Actions(driver);
		Action moveover=build.moveToElement(link).build();
		moveover.perform();
		build.sendKeys(link,(Keys.ENTER)).perform();
		
	}

}

