package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June17_JavaScriptExecutors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		//String url = "https://testhing.com/academy/demo/webelements/";
		// To navigate to the URL
		//driver.get(url);
		// Maximize the page
		driver.manage().window().maximize();
		// Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.location='https://testhing.com/academy/demo/webelements/';");
		
		//Find an element
		WebElement nameField=(WebElement)jse.executeScript("return document.getElementById('name');");
		nameField.sendKeys("Test");
		
		//How to find the size of the window
		//Height
		long Height=(long)jse.executeScript("return window.innerHeight;");
		System.out.println("The height of the window is :"+Height);
		//Width
		long Width=(long)jse.executeScript("return window.innerWidth;");
		System.out.println("The width of the window is :"+Width);
		
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		Thread.sleep(2000);
		
		//How to scroll up, down and element into view
		//Scroll down
		jse.executeScript("window.scrollBy(0,1900);");
		Thread.sleep(3000);
		
		//Scroll up
		jse.executeScript("window.scrollBy(0,-1900);");
		Thread.sleep(2000);
		
		//SCroll Element into view
		
		WebElement mouseHover=driver.findElement(By.id("mousehover"));
		jse.executeScript("arguments[0].scrollIntoView(true);", mouseHover);
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,-190);");
		
	}

}
