package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class June16_Alert_MouseHover {

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
		
		//Alert button
		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(20000);
		//Creating alert class for handling java script pop-up
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		//Mouse-Hover
		//driver.findElement(By.xpath("//div[contains(@class,'mouse-hover-content')]/a[2]")).click();
		//Actions
		Actions action=new Actions(driver);
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		Thread.sleep(1000);
		action.moveToElement(mouseHover).perform();
		Thread.sleep(3000);
		
		WebElement reLoad=driver.findElement(By.xpath("//div[contains(@class,'mouse-hover-content')]/a[2]"));
		action.moveToElement(reLoad).click().perform();
		Thread.sleep(2000);
		
		
		
	}

}
