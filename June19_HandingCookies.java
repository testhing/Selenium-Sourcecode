package SeleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June19_HandingCookies {

	public static void main(String[] args) throws InterruptedException {
		//Cookies
		//Contain information about the user and its preferences on the client side
		//2 types of cookies
		//Session Cookie and Persistent Cookies
		//Session = doesn't have an expiry date. Lost when the browser is closed.
		//Persistent / Permanent cookies = expiry date. 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		String url="https://testhing.com/dashboard/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//
		driver.findElement(By.id("user_login")).sendKeys("binitha.it07@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("s23b09v13@2016");
		driver.findElement(By.id("wp-submit")).click();
		
		//Print the cookies
		Set<Cookie> values=driver.manage().getCookies();
		System.out.println(values);
		
		Cookie cookieName=driver.manage().getCookieNamed("wordpress_logged_in_544a79ebc54bd2184035c86e6f59f0eb");
		Thread.sleep(3000);
		System.out.println(cookieName);
		
		//Delete the cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(7000);
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().addCookie(cookieName);
		Thread.sleep(10000);
		driver.navigate().refresh();
		

	}

}
