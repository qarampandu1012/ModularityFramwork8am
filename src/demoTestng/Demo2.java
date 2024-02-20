//package demoTestng;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Method;
//import org.testng.ITestResult;
//import org.testng.TestNG;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.ITestAnnotation;
//import org.testng.annotations.Test;
//import org.testng.internal.TestNGMethod;
//import org.testng.internal.annotations.ITest;
//
//public class Demo2  {
//
//	WebDriver driver;
//
//	@BeforeTest
//	public void start() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\veera\\OneDrive\\Desktop\\8AM AUTOMATION\\8am workspace\\SeleniumProject\\BrowserDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://jqueryui.com/droppable/");
//		getTestMethodPriority();
//	}
//	 private void getTestMethodPriority() {
//	        // Use reflection to get the method and its annotations
//	 // ITestAnnotation annotation
////	   
//		 Test test=Test
//		
//	      // Return -1 if method or annotation not found
//	    }
//	@Test(priority = 0)
//	public void test1() throws InterruptedException {
//
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
//		System.out.println("Successfully Switched to Frame");
//		Actions act = new Actions(driver);
//
//		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement TargetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
//		act.dragAndDrop(sourceElement, TargetElement).build().perform();
//
//	}
//
//	
//
//	@AfterTest
//	public void close() throws InterruptedException {
//		Thread.sleep(2000);
//
//		driver.quit();
//	}
//
//}
