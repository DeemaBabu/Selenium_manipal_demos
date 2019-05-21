package seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class gerurlwebdriverDemo12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Deema\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		String url1= (driver.getCurrentUrl()); //Questions will come
		System.out.println(url1);

	}

}
