package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June11_isDisplayed_getAllLinks {

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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//isDisplayed Functionality
		//Located the element
		WebElement hideShowText=driver.findElement(By.id("displayed-text"));
		//Sending values to the field
		hideShowText.sendKeys("TesTHING");
		//verify if the field is present and displayed
		boolean hideShowVerify=hideShowText.isDisplayed();
		System.out.println("Verify if the HideShow Text field is present: "+hideShowVerify);
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		hideShowVerify=hideShowText.isDisplayed();
		System.out.println("Verify if the HideShow Text field is present: "+hideShowVerify);
		//hideShowText.sendKeys("TesTHING");
		
		//How to get all the links from a web page
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int size=allLinks.size();
		System.out.println("The size of the list is :"+size);
		for(int i=0;i<size;i++) {
			String linkNames=allLinks.get(i).getText();
			String tagName=allLinks.get(i).getTagName();
			System.out.println(linkNames);
			System.out.println(tagName);
		}
	}

}
