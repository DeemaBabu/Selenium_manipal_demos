package seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javascriptdemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Deema\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		String title= Js.executeScript("return document.title").toString();
		System.out.println(title);
		String URL=Js.executeScript("return document.URL").toString();
		System.out.println(URL);
		String Domain=Js.executeScript("return document.domain").toString();
		System.out.println(Domain);
		Js.executeScript("document.getElementById('txtUsername').value='Admin'");
		Thread.sleep(3000);
		Js.executeScript("history.go(0)"); // to refresh the page
		Js.executeScript("document.getElementById('txtUsername').value='Admin'");
		//Js.executeScript("document.getElementByName('txtPassword').value='admin123'"); //will not work
		
		Js.executeScript("document.querySelector('input#txtPassword').value='admin123'");
		Js.executeScript("document.getElementById('btnLogin').click()");
		
		Js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		Thread.sleep(3000);
		Js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		
		Actions Ac= new Actions(driver);
		/*Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_UP);*/
		
		//OR use this
		
		Ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		
			

	}

}

