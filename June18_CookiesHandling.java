package SeleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June18_CookiesHandling {

	public static void main(String[] args) throws InterruptedException { 
		// Cookies contain the information about the user and its preferences in client
		// side
		// One can know the sites navigated by the users
		// 2 types of cookies - Session cookies and Persistent cookies
		// SEssion cookies - will be stored in memory, not in disk. wont have an expiry
		// date
		// Persistent/Permanent cookies - expiry date. They can be visited again

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		String url = "https://testhing.com/dashboard/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("user_login")).sendKeys("binitha.it07@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("v13s23b09@1990");
		driver.findElement(By.id("wp-submit")).click();

		Set<Cookie> values = driver.manage().getCookies();
		System.out.println(values);

		

		Cookie myCookie = driver.manage().getCookieNamed("wordpress_logged_in_544a79ebc54bd2184035c86e6f59f0eb");
		System.out.println(myCookie.getDomain());
		System.out.println(myCookie.getValue());
		
		// Delete the cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		
		// Adding a cookie
		driver.manage().addCookie(myCookie);
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

}
