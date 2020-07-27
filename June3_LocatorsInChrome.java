package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June3_LocatorsInChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open the application
		String url="https://www.bigbasket.com/";
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
//		//Wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Inspect the elements with the help of locators
		//ID, Name, Classname, Link Text,Partial Link Text, Tag name, X-Path, CSS-Selector
		//ID
		driver.findElement(By.id("input")).sendKeys("Almonds");
		//Name-> Explained with Firefox
		//Link Text
		//driver.findElement(By.linkText("Login")).click();
		//Partial Link Text
		//driver.findElement(By.partialLinkText("Sign")).click();
		//Classname
		//driver.findElement(By.className("header-banner")).click();
		//Tag-name
		driver.findElement(By.tagName("a")).click();
		
		

	}

}
