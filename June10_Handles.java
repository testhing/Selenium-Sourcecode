package SeleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June10_Handles {

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
		
		//How to navigate from one window to another
		//How to handle different windows
		String homePageHandle=driver.getWindowHandle();
		System.out.println("The Home page handle is: "+homePageHandle);
		
		//Click on Open Window button
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		
		//Click on Testhing logo from Open Window screen
		//driver.findElement(By.xpath("//a[@rel='home']")).click();
		
		//Get all the handles
		Set<String> allHandles=driver.getWindowHandles();
		System.out.println("The handles are : "+allHandles);
		for(String handles:allHandles) {
			System.out.println(handles);
			if(!handles.equals(homePageHandle)) {
				driver.switchTo().window(handles);
				driver.findElement(By.xpath("//a[@rel='home']")).click();
				Thread.sleep(2000);
				//driver.close(); //driver.quit();
			}
			Thread.sleep(2000);
			
		}
		//Switching back to the homepage window
//		driver.switchTo().window(homePageHandle);
//		driver.findElement(By.id("name")).sendKeys("TesTHING");

	}


}
