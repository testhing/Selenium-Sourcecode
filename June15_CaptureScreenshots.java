package SeleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June15_CaptureScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Click on Alert button
		driver.findElement(By.id("name")).sendKeys("TesTHING");
		Thread.sleep(1000);
		//captureScreenshot(driver, "C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\TesTHING.png");

	}
	
//	public static void captureScreenshot(WebDriver webdriver, String filepath) throws IOException {
//		//Convert the web driver object to take screenshot
//		TakesScreenshot scrShot=((TakesScreenshot)webdriver);
//		//Call getScreenshotAs() method to create image file
//		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
//		//Move the file to the new destination by creating a path
//		File destFile=new File(filepath);
//		//Copy the file to destination
//		FileUtils.copyFile(srcFile, destFile);
//		
//	}

}
