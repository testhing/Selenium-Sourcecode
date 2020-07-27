package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class June17_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Exception - error that is thrown during the execution of a program
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
		
		//No such element exception
		//driver.findElement(By.id("name")).sendKeys("TesTHING");
		
		//Unhandled alert exception
//		driver.findElement(By.id("alertbtn")).click();
//		driver.findElement(By.id("name")).sendKeys("TesTHING");
		
		//Element not interactable 
//		driver.findElement(By.id("hide-textbox")).click();
//		driver.findElement(By.id("displayed-text")).sendKeys("Test");
		
		//Unexpected tag name exception
//		Select optionValues=new Select(driver.findElement(By.name("cars")));
//		optionValues.selectByIndex(0);
		
		//No such window exception
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		driver.close();
		driver.findElement(By.id("name")).sendKeys("TesTHING");
		
	}

}
