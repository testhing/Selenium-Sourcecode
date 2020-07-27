package pom_testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
   public static WebDriver driver=null;
	@BeforeSuite
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://testhing.com/dashboard/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void quitBrowser() {
		driver.quit();
	}

}
