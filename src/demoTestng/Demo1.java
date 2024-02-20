package demoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	
	
	
@Test(priority = 0)
	public void test1() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\veera\\OneDrive\\Desktop\\8AM AUTOMATION\\8am workspace\\SeleniumProject\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		driver.close();

	}

@Test(priority = 1)
public void test2() {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\veera\\OneDrive\\Desktop\\8AM AUTOMATION\\8am workspace\\SeleniumProject\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in");
	driver.close();

}
@Test(priority = 2)
public void test3() {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\veera\\OneDrive\\Desktop\\8AM AUTOMATION\\8am workspace\\SeleniumProject\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in");
	driver.close();

}

 
}
