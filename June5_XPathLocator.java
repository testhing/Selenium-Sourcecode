package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June5_XPathLocator {

	public static void main(String[] args) {
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

		// X-Path
		// Syntax - tag[@attribute='value'] - Alert button 
//		driver.findElement(By.xpath("//input[@onclick='displayAlert()']")).click();

		// Absolute X Path and Relative X Path
		// Absolute XPath - / = Finds the immediate element below the parent element

		// Usage of Absolute and Relative XPath - Testhing logo
//		driver.findElement(By.xpath("html/body/div/header//a[@rel='home']")).click();

		// How to build an effective X-Path - Academy
//		 driver.findElement(By.xpath("html/body/div/header/div/div/div//nav//ul/li[2]/a")).click();

		// Using text to find the element - Contact Us
		//tagname[@attribute='value']//a[text()='value']
//		 driver.findElement(By.xpath("//div[@class='main-navigation']//a[text()='Contact Us']")).click();

		// Using contains to find the element
		// Syntax: //tag[contains(@attribute,'value')]
		// a[contains(href,'Contact Us')] - Example 1 - Open tab
		 driver.findElement(By.xpath("//a[contains(@id,'open')]")).click();
		
		// Using multiple contains
		// Example 2 - Alert button
		// Syntax: //tag[contains(@attribute,'value') and contains(@attribute,value)]
//		 driver.findElement(By.xpath("//input[contains(@class,'btn-style') and contains(@onclick,'displayAlert()')]")).click();

//		Using starts with to find the element-Open Window
//		Syntax: //tagname[starts-with(@attribute,'value')]
//		driver.findElement(By.xpath("//button[starts-with(@class,'btn-style')]")).click();

		// How to find Parent and Sibling Nodes - Academy
		// Parent Node
		// xpath of element//parent::<tag>
		// Preceding Sibling
		// xpath of element//preceding-sibling::<tag>
		// Following sibling
		// xpath of element//following-sibling::<tag>
//driver.findElement(By.xpath("//li[@id='menu-item-1124']//parent::ul//preceding-sibling::li//following-sibling::li")).click();

	}

}
