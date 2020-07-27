package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June4_CSSLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open the application
		String url="https://testhing.com/academy/demo/webelements/";
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//CSS Locator
		//Syntax: tagname[attribute='value']
		//driver.findElement(By.cssSelector("input[id='name']")).sendKeys("TesTHING");
		
		//Incase of ID with CSS
		//Syntax: #idvalue or tagname#idvalue
		//input#name or #name
		//driver.findElement(By.cssSelector("#name")).sendKeys("TesTHING");
		
		//Incase of Classname with CSS
		//Syntax: .classname or tagname.classname
		driver.findElement(By.cssSelector(".inputs")).sendKeys("Binitha");
		
		//Using multiple CSS classes to locate elements
		//Syntax: tagname[attribute='entire class name']
		//driver.findElement(By.cssSelector("button[class='btn-style class1']")).click();
		//Syntax: .classname1.classname2.classname3
		//driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();
		
		//Using wild cards to find CSS elements
		//Starting text to find element = ^
		//Ending text to find element = $
		//Text contained to find element = *
		//Syntax: tagname[class^='classname']
		//driver.findElement(By.cssSelector("a[class^='btn-style']")).click();
		//Syntax: tagname[class$='classname']
		//driver.findElement(By.cssSelector("a[class$='class2']")).click();
		//Syntax: tagname[class*='classname']
		driver.findElement(By.cssSelector("a[class*='class1']")).click();
		
		//fieldset>child1>child2
	}

}
