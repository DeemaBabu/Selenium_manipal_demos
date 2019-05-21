package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class childDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Deema\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C://Deema//table.html");
		System.out.println(driver.findElement(By.xpath("//*//tr[2]//td[2]//following-sibling::td")).getText());

	}

}
