package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class June18_Wait {

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
		
		//Wait - Implicit wait, Explicit Wait and Fluent Wait
		
		//Implicit wait = If elements are not available, this implicit wait will tell the webdriver
		//to pause the DOM for certain amount of time, and even then if it's unable to locate the element
		//, the test will eventually fail
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait = custom one. It will wait until the condition is reached. Explicitly tell
		//the driver to wait for certain duration, it will fail if it doesn't locate the element within the
		//specified time
		
		//Advantage of Explicit Wait over Thread.sleep
		//If we mention explicit wait for 20 secs and if the driver locates it before that(say in 10 secs)
		//then it will jump to the next line as it will not wait for the other 10 secs.
		//Thread.sleep = it waits for whole 20 secs, even if it locates the element
		
		driver.findElement(By.xpath("//a[@rel='home']")).click();
		driver.findElement(By.xpath("//span[text()='go to academy']")).click();
		driver.findElement(By.xpath("//a[@rel='home']")).click();
		driver.findElement(By.xpath("//a[text()='about us']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement contactUs=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Contact Us']")));
		contactUs.click();
		//driver.findElement(By.xpath("//a[text()='Contact Us']")).click();

	}

}
