package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		String Name = driver.findElement(By.id("txtUsername")).getAttribute("value");
		
		
		System.out.println(Name);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//String label=driver.findElement(By.id("menu_admin_viewAdminModule")).getText();
		//System.out.println("Label is" + Name);
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement e : links)
		{
			System.out.println(e.getText());
		}
		
		
		
					
	}

}
