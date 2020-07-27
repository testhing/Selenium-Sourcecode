package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class June8_Navigation_CheckBoxRadio {

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
		
		//Passing values to the text field
		WebElement nameField=driver.findElement(By.id("name"));
		nameField.sendKeys("TesTHING");
		Thread.sleep(2000);
		
		//clear the field
		nameField.clear();
		
		//How to get title of the page
		String titleOfThePage=driver.getTitle();
		System.out.println("The title of the page : "+titleOfThePage );
		
		//How to get the current url of the page
		String currentUrl=driver.getCurrentUrl();
		System.out.println("The current url of the page is :"+currentUrl);
		
		//How to navigate from a url to a new url
		String newUrl="https://testhing.com/contact-us/";
		driver.navigate().to(newUrl);
		Thread.sleep(2000);
		
		//Navigating back to the previous url
		driver.navigate().back();
		Thread.sleep(2000);
		
		//How to navigate forward
		//driver.navigate().forward();
		//Thread.sleep(2000);
		
		//How to refresh a web page
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
		//How to get the page source
		//String pageSource=driver.getPageSource();
		//System.out.println(pageSource);
		
		//How to work with Checkbox and Radio button
		//Radio button
		WebElement bmwRadio=driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		//isSelected()
		System.out.println("Verify if the bmw radio button is selected :"+bmwRadio.isSelected());
		WebElement benzRadio=driver.findElement(By.id("benzradio"));
		benzRadio.click();
		System.out.println("Verify if benz radio is selected: "+benzRadio.isSelected());
		
		//
		bmwRadio=driver.findElement(By.id("bmwradio"));
		System.out.println("Verify if the bmw radio button is selected :"+bmwRadio.isSelected());
		
		
		//How to work with Checkbox
		WebElement bmwCheck=driver.findElement(By.id("bmwcheck"));
		bmwCheck.click();
		System.out.println("Verify if the bmw checkbox option is selected :"+bmwCheck.isSelected());
		
		WebElement hondaCheck=driver.findElement(By.id("hondacheck"));
		hondaCheck.click();
		System.out.println("Verify if the honda checkbox option is selected :"+hondaCheck.isSelected());
		
	}

}
