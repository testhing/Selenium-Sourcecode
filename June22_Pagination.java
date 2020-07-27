package SeleniumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class June22_Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		String url = "https://datatables.net/examples/advanced_init/dt_events.html";
		// To navigate to the URL
		driver.get(url);
		// Maximize the page
		driver.manage().window().maximize();
		// Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Pagination = dividing the content into multiple discreet pages
		//It is mainly used to present only limited content to the user
		//List
		List<WebElement> nameValues=driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
		//Array List declaration - ArrayList<Type> variable=new ArrayList<Type>();
		ArrayList<String> names=new ArrayList<String>();
		
		for(WebElement allValues:nameValues) {
			names.add(allValues.getText());
		}
		//System.out.println("The elements present in the 1st page are: "+names);
		//Locatint the next button
		WebElement nxtBtn=driver.findElement(By.id("example_next"));
		String nxtBtnClass=nxtBtn.getAttribute("class");
		
		//
		while(!nxtBtnClass.contains("disabled")) {
			nxtBtn.click();
			nameValues=driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
			for(WebElement allValues:nameValues) {
				names.add(allValues.getText());
			}
			nxtBtn=driver.findElement(By.id("example_next"));
			nxtBtnClass=nxtBtn.getAttribute("class");
			//System.out.println(names);
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		int size=names.size();
		System.out.println(size);
		
		String entryCount=driver.findElement(By.id("example_info")).getText();
		String count=entryCount.split(" ")[5];
		System.out.println(count);
		
		String sizeCount=String.valueOf(size);
		Assert.assertEquals(count, sizeCount);

	}

}
