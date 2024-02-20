package demoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	WebDriver driver;

	@BeforeTest
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
		Thread.sleep(2000);
		driver.navigate().to("https://jqueryui.com/checkboxradio/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame);

		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//*[contains(text(),'2 Double')]"));

		if (!checkbox.isSelected()) {

			checkbox.sendKeys(Keys.SPACE);
			System.out.println("Successfully Clicked Checkbox");
		} else {
			System.out.println("Unable to Clicked Checkbox");
		}
	}

	@Test(priority = 2)
	public void test3() throws InterruptedException {
		driver.navigate().to("https://jqueryui.com/droppable/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		System.out.println("Successfully Switched to Frame");
		Actions act = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TargetElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(sourceElement, TargetElement).build().perform();

	}

	 
	@AfterTest
    public void afterTestMethod(ITestResult result) throws InterruptedException {
        // Check the status of the test and return the result accordingly
        if (result.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Test Result: PASS");
        } else {
            System.out.println("Test Result: FAIL");
        }
        Thread.sleep(2000);
		int s=TestNG.getDefault().getStatus();
		driver.quit();
    }
}
