package SeleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June11_HandlesConcept {

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
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Get the home page handle
		String homePageHandle = driver.getWindowHandle();
		System.out.println("The Home page handle is :" + homePageHandle);
		Thread.sleep(2000);

		//Click on the Open Window bton
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		//Get all the window handles
		Set<String> allHandles=driver.getWindowHandles();
		System.out.println("The Handles are: "+allHandles);
		for(String handles:allHandles) {
			System.out.println(handles);
			if(!handles.equals(homePageHandle)) {
				driver.switchTo().window(handles);
				driver.findElement(By.xpath("//a[@rel='home']")).click();
				Thread.sleep(3000);
				driver.close(); //driver.quit()
			}
			Thread.sleep(1000);
	}
		//Switch back to the parent window
		driver.switchTo().window(homePageHandle);
		driver.findElement(By.id("name")).sendKeys("TesTHING");

}
}
