package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String underconstructiontitle="Under Construction";
		List<WebElement> list = driver.findElements(By.tagName("a"));
		String[] linktext =  new String[list.size()];
		int i=0;
		for(WebElement e : list)
		{
			linktext[i]=e.getText();
			i++;
					
		}
		
		for(String t: linktext)
		{
			driver.findElement(By.linkText(t));
			if(driver.getTitle().equals(underconstructiontitle))
			{
				System.out.println("\"" + t + "\""+ "\"" + "is UnderConstruction");
			}
			else
			{
				System.out.println("\"" + t + "\""+ "\"" + "is Working");
			}
			driver.navigate().back();
		}
		driver.quit();
		
	}

}
