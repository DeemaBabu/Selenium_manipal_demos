package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Elements_methos_like_displayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement enb= driver.findElement(By.name("userName"));
		if (enb.isEnabled())
		{
			enb.sendKeys("sunil");
			enb.clear();
			enb.sendKeys("sunil");
		}
		if (driver.findElement(By.name("userName")).isDisplayed());
		
		{
			driver.findElement(By.name("password")).sendKeys("sunil");
			driver.findElement(By.name("login")).click();
			Thread.sleep(8000);
		}

		driver.findElement(By.xpath("//*[@value='oneway']")).click();
		
		if (driver.findElement(By.xpath("//*[@value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@value='oneway']")).click();
		}

		
	}
}
