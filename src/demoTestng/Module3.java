package demoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module3 {

	 WebDriver driver;
	 
	 
	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\veera\\OneDrive\\Desktop\\8AM AUTOMATION\\8am workspace\\SeleniumProject\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");

	}
	
	
	
	@Test(priority = 0)
	public void test1() throws InterruptedException {

		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("Successfully Switched to Frame");
		Actions act = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TargetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(sourceElement, TargetElement).build().perform();

		

	}
	

	@Test(priority = 1)
	public void test2() throws InterruptedException {

		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("Successfully Switched to Frame");
		Actions act = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TargetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(sourceElement, TargetElement).build().perform();

		

	}
	
	

	@Test(priority = 2)
	public void test3() throws InterruptedException {

		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("Successfully Switched to Frame");
		Actions act = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TargetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(sourceElement, TargetElement).build().perform();

		

	}
	
	
	@Test(priority = 3)
	public void test4() throws InterruptedException {

		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("Successfully Switched to Frame");
		Actions act = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TargetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(sourceElement, TargetElement).build().perform();

		

	}
	
	

	@Test(priority = 4)
	public void test5() throws InterruptedException {

		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("Successfully Switched to Frame");
		Actions act = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TargetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(sourceElement, TargetElement).build().perform();

		

	}
	
	
	
	
@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(2000);

		driver.quit();
	}
	
	

}
