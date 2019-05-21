package seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://realestate.upskills.in/");
		driver.findElement(By.xpath("//*[@class='sign-in']")).click();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]")); //ab-item
		Actions click= new Actions(driver);
		click.moveToElement(link).click().build().perform();
		
		Actions Rc = new Actions(driver);
		Rc.moveToElement(link).contextClick().build().perform(); //context click is for rightclick
		//or Rc.moveToElement(link).contextClick().peform();
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_DOWN); 
		rob.keyPress(KeyEvent.VK_DOWN);//This is to select the second option from dropdown
		rob.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		

	}

}
