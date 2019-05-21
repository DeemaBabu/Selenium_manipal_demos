package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childdemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C://CSTS//selenium training//table.html");
		//System.out.println(driver.findElement(By.xpath("//*//tr[2]//td[4]//following-sibling::td")).getText());
		System.out.println(driver.findElement(By.xpath("//*//tr[2]//td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//*//tr[2]//td[3]//following-sibling::td")).getText());
		System.out.println(driver.findElement(By.xpath("//*//tr[2]//td[2]//following-sibling::td[2]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*//tr[2]//td[4]//following-sibling::td[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*//tr[2]//td[4]//following-sibling::tr[1]")).getText());
	}

}
