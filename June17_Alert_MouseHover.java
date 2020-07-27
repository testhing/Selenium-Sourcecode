package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class June17_Alert_MouseHover {

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
		
		//Clicking on Alert button
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		//Alert class is used incase of a javascript pop-up
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(20000);
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(20000);
		alert.dismiss();
		
		
		//driver.findElement(By.xpath("//li[@id='menu-item-1872']/a[text()='login to Dashboard']")).click();
		//Action Class
		Actions actions=new Actions(driver);
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		actions.moveToElement(mouseHover).perform();
		
		WebElement reLoad=driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[2]"));
		actions.moveToElement(reLoad).click().perform();

	}

}
