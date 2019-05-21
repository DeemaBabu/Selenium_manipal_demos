package seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumcasestudy11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Deema\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raji");
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thomas");

		//System.out.println(driver.findElement(By.xpath("//input[@type='email']//parent::td//parent::tr//preceding-sibling::tr/td/label")));
	}
}
