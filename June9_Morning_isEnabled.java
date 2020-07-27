package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June9_Morning_isEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open the application
		String url="https://www.bigbasket.com/";
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//
		WebElement loginClick=driver.findElement(By.linkText("Login"));
				loginClick.click();
		boolean loginUsingOTP=driver.findElement(By.xpath("//button[@class='btn btn-default login-btn']")).isEnabled();
		System.out.println("Is the Login button Enabled: "+loginUsingOTP);
		
		driver.findElement(By.id("otpEmail")).sendKeys("9999999999");
		 loginUsingOTP=driver.findElement(By.xpath("//button[@class='btn btn-default login-btn']")).isEnabled();
		System.out.println("Is the Login button Enabled: "+loginUsingOTP);
		System.out.println("Is the Login button Enabled: "+loginUsingOTP);
		

	}

}
