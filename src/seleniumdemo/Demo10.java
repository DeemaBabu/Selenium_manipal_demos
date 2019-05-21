package seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		WebElement clicklink=driver.findElement(By.id("button1"));
		for (int i = 0; i<4;i++)
		{
		clicklink.click();
		Thread.sleep(2000);
		}
		ArrayList<String> childwindow= new ArrayList<>(driver.getWindowHandles()); 
		//or we can use
		//List<String> childwindow=new ArrayList<>(driver.getWindowHandles()); 
		System.out.println(childwindow);
		System.out.println(childwindow.size());
		String lastwindow="";
		
		for (int i=1 ; i< childwindow.size();i++)
		{
			driver.switchTo().window(childwindow.get(i));
			driver.navigate().to("http://www.google.com");
			lastwindow = childwindow.get(i);
		}
		
		System.out.println(childwindow.size());
		//Switching to parent window
		driver.switchTo().window(parentwindow);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.quit();
	}
}
