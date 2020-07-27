package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June16_IFrames {

	public static void main(String[] args) {
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
		
		//IFrame= embedding a new page within a current page
		
		
		//Switch to Iframe by id, name, index, Webelement
		//Iframe by ID
//		driver.switchTo().frame("courses-iframe");
//		driver.findElement(By.xpath("//span[text()='go to academy']")).click();
		
		//Iframe by name
		//driver.switchTo().frame("iframe-name");
		
		
		//Iframe by index
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//span[text()='go to academy']")).click();
		
		//Iframe by WebElement
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.findElement(By.xpath("//span[text()='go to academy']")).click();
		
		
		//Switching back to the current page
		driver.switchTo().defaultContent();
		//Sending keys to the name field
		driver.findElement(By.id("name")).sendKeys("TesTHING");
	
		
		

	}

}
