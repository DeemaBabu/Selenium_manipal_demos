package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo11_parent {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//*[@id='email']//parent::td//parent::tr//preceding-sibling::tr//td/label")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='email']//parent::td//parent::tr//td/label")).getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='email']//parent::td//parent::tr//preceding-sibling::tr//td[2]/label")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id='email']//parent::td//following-sibling::/td/label)).getText();
		//System.out.println(driver.findElement(By.xpath("//*[@id='email']//ancestor::tr/preceding-sibling::tr/td/label")).getText());
		

	}

}
