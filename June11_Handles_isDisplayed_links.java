package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June11_Handles_isDisplayed_links {

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
		
		//isDisplayed()
		//Locate the element
		
		WebElement nameField=driver.findElement(By.id("displayed-text"));
		nameField.sendKeys("TesTHING");
		boolean nameDisplay=nameField.isDisplayed();
		System.out.println("Verify if the name field is displayed : "+nameDisplay);
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		nameDisplay=nameField.isDisplayed();
		System.out.println("Verify if the name field is displayed : "+nameDisplay);
		
		//How to get all the links from a web page
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int size=allLinks.size();
		System.out.println("The size is : "+size);
		for(int i=0;i<size;i++) {
			String linkText=allLinks.get(i).getText();
			String tagNames=allLinks.get(i).getTagName();
			System.out.println(linkText);
			System.out.println(tagNames);
		}
		
		
		}

}
