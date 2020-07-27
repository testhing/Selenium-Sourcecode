package SeleniumDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class June19_Pagination {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		//Pagination = Pagination is the concept where we divide the content into multiple discreet pages.
		//Pagination is used to display limited content in the web page
		
		String url="https://datatables.net/examples/advanced_init/dt_events.html";
		driver.get(url);
		//Maximize
		driver.manage().window().maximize();
		//TimeOut
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//Creating a list to store the values that are present in the first page
		List<WebElement> nameValues=driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
		//ArrayList = ArrayList<Type> vname=new ArrayList<Type>()
		ArrayList<String> names=new ArrayList<String>();
		//For each loop to iterate over the elements and store it
		for(WebElement allValues:nameValues) {
			names.add(allValues.getText());
		}
		System.out.println(names);
		//Capturing the name
		WebElement nxtBtn=driver.findElement(By.id("example_next"));
		
		String nxtBtnClass=nxtBtn.getAttribute("class");
		System.out.println(nxtBtnClass);
		
		while(!nxtBtnClass.contains("disabled")) {
			nxtBtn.click();
			nameValues=driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
			for(WebElement allValues:nameValues) {
				names.add(allValues.getText());
			}
			
			nxtBtn=driver.findElement(By.id("example_next"));
			nxtBtnClass=nxtBtn.getAttribute("class");
			
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		int entriesSize=names.size();
		System.out.println(entriesSize);
		
		String count=driver.findElement(By.xpath("//div[text()='Showing 51 to 57 of 57 entries']")).getText();
		String number=count.split(" ")[5];
		System.out.println(number);
		String entryCount=String.valueOf(entriesSize);
		Assert.assertEquals(entryCount, number);
		
	}

}
