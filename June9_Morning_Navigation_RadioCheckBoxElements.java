package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June9_Morning_Navigation_RadioCheckBoxElements {

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
		
		//Sending values to the text field
		WebElement nameField=driver.findElement(By.id("name"));
		nameField.sendKeys("TesTHING");
		Thread.sleep(2000);
		nameField.clear();
		
		//How to get title of the page
		String titleOfThePage=driver.getTitle();
		System.out.println("The title of the page is :"+titleOfThePage);
		
		//How to get the current url of the page
		String currentUrl=driver.getCurrentUrl();
		System.out.println("The current url of the page is :"+currentUrl);
		
		//How to navigate from one url to a new url
		String newUrl="https://testhing.com/about-us/";
		driver.navigate().to(newUrl);
		Thread.sleep(2000);
		System.out.println("The current url of the page is :"+currentUrl);
		
		//How to navigate back to the previous url
		driver.navigate().back();
		Thread.sleep(3000);
		
		//How to navigate to the new url
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		
//		//How to refresh a web page
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
		//How to view the page source
//		String pageSource=driver.getPageSource();
//		System.out.println("The page source is :"+ pageSource);
		
//		driver.navigate().back();
		
		//Radio button functionality
		WebElement bmwRadio=driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		System.out.println("Is the BMW Radio button selected: "+bmwRadio.isSelected());
		
		WebElement benzRadio=driver.findElement(By.id("benzradio"));
		benzRadio.click();
		System.out.println("Is the Benz Radio button selected: "+benzRadio.isSelected());
		//
		System.out.println("Is the BMW Radio button selected: "+bmwRadio.isSelected());
		
		//CheckBox Functionality
		WebElement bmwCheck=driver.findElement(By.id("bmwcheck"));
		bmwCheck.click();
		System.out.println("Is the Benz Checkbox button selected: "+bmwCheck.isSelected());
		
		WebElement benzCheck=driver.findElement(By.id("benzcheck"));
		benzCheck.click();
		System.out.println("Is the Benz Checkbox button selected: "+benzCheck.isSelected());
		//
		System.out.println("Is the Benz Checkbox button selected: "+bmwCheck.isSelected());
		
		
		
		

	}

}
