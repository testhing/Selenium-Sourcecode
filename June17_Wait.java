package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class June17_Wait {

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
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//In Selenium WebDriver, 3 types of waits - Implicit wait, Explicit Wait, Fluent Wait
		//Implicit Wait= If elements are not available, implicit wait tells webdriver
		//to pause the DOM for a certain amount of time.
		
		//Explicit Wait= custom one. It will wait until the condition is reached. =20
		
		//Advantage of Explicit wait
		//On mentioning explicit wait for 20 secs, if it locates the elements, say in 10 seconds, then it will immediately jump 
		//to the next line in your program. But in case of Thread.sleep, it will wait for whole 20 seconds.
		 driver.findElement(By.xpath("//a[@rel='home']")).click();
//		 WebDriverWait wait=new WebDriverWait(driver, 20);
//		 WebElement academy=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='go to academy']")));
//		 academy.click();
//		 
		 //driver.findElement(By.xpath("//span[text()='go to academy']")).click();
		 driver.findElement(By.xpath("//a[@rel='home']")).click();
		 driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		 driver.findElement(By.xpath("//a[text()='about us']")).click();
		 driver.findElement(By.xpath("//a[text()='academy']")).click();
	}

}
