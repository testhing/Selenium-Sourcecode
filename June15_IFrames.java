package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June15_IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		String url = "https://testhing.com/academy/demo/webelements/";
		// To navigate to the URL
		driver.get(url);
		// Maximize the page
		driver.manage().window().maximize();
		// Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//IFrame
		//Embedding a new page in the current page
//		driver.findElement(By.xpath("//a[contains(@id,'schedule-demo') and contains(@href,'https://testhing.com/academy')]")).click();
		
		//Switch to Iframe by ID
//		driver.switchTo().frame("courses-iframe");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(@id,'schedule-demo') and contains(@href,'https://testhing.com/academy')]")).click();
		
		//Switch to IFrame by name
//		driver.switchTo().frame("iframe-name");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(@id,'schedule-demo') and contains(@href,'https://testhing.com/academy')]")).click();
		
		//Switch to Iframe by index
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(@id,'schedule-demo') and contains(@href,'https://testhing.com/academy')]")).click();
		
		//Switch to Iframe by WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'schedule-demo') and contains(@href,'https://testhing.com/academy')]")).click();
		
		//Switch to the current page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("TesTHING");
		
		

	}

}
