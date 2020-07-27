package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class June3_LocatorsInFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Open the application
		String url="https://www.gmail.com/";
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Inspect the elements with the help of locators
		//ID, Name, Classname, Link Text,Partial Link Text, Tag name, X-Path, CSS-Selector
		//ID
		driver.findElement(By.name("identifier")).sendKeys("abc");
		//Name
		
		

	}

}
