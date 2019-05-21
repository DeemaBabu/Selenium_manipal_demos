package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		//String username = driver.findElement(By.name("userName")).getAttribute("value"); // to get the values getAttribute
		//System.out.println(username);
		
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();


		WebElement dd=driver.findElement(By.name("passCount")); 
		//bacause its dropdown we should store
		Select sel=new Select(dd);
		sel.selectByVisibleText("2");
		
		/*
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		
		for(int i=0; i<data.size();i++)
			System.out.println(data.get(i).getText()); //.getText is required to print value of that dropdown
		
		*/
		
		WebElement d1=driver.findElement(By.name("fromPort"));
		Select sel1=new Select(d1);
		sel1.selectByVisibleText("Sydney");
		
		/*
		List<WebElement> deptfrom =sel1.getOptions();
		for(int j=0; j<deptfrom.size();j++)
			System.out.println(deptfrom.get(j).getText());
		*/
		
		WebElement d2=driver.findElement(By.name("fromMonth"));
		Select sel2=new Select(d2);
		sel2.selectByVisibleText("June");
		
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("Asha");
		driver.findElement(By.name("passLast0")).sendKeys("Rajiv");
		driver.findElement(By.name("passFirst1")).sendKeys("Veena");
		driver.findElement(By.name("passLast1")).sendKeys("Kalyan");
		
		driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 8978");
		
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
				
		for (WebElement e : checkbox)
			e.click();

			
		for (int i=0;i<=checkbox.size();)
		{
			checkbox.get(i).click();
		}
		
	}

}
