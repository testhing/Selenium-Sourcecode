package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June18_JavaScriptExecutors {

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
		
		//Open the application
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.location='https://testhing.com/academy/demo/webelements/';");
		
		//Sending values to a field
		WebElement nameField=(WebElement)jse.executeScript("return document.getElementById('name');");
		nameField.sendKeys("Test");
		
		//How to get the size of a window
		
		long Height=(long)jse.executeScript("return window.innerHeight;");
		System.out.println("The inner Height of the window is : "+Height);
		
		long Width=(long)jse.executeScript("return window.innerWidth;");
		System.out.println("The inner Width of the window is : "+Width);
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
		//How to perform scroll in a web page
		//Scroll Down
		jse.executeScript("window.scrollBy(0,1900);");
		Thread.sleep(3000);
		
		//Scroll Up
		jse.executeScript("window.scrollBy(0,-1900);");
		Thread.sleep(3000);
		
//		WebElement mouseHover=driver.findElement(By.id("mousehover"));
//		jse.executeScript("arguments[0].scrollIntoView(true);", mouseHover);
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,-400);");
		
		WebElement openTab=driver.findElement(By.id("opentab"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", openTab);
		
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,-190);");
		
	}

}
