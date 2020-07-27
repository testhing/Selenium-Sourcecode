package SeleniumDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class June22_DownloadFiles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		//ChromeOptions class is used to manipulate the properties of the driver
		ChromeOptions optionsValue= new ChromeOptions();
		
		//store value in key,value pairs, hashmap
		//Map<Key,Value> variablename= new HashMap<Key,Value>();
		
		Map<String,Object> values= new HashMap<String, Object>();
		values.put("download.prompt_for_download", false);
		
		driver=new ChromeDriver(optionsValue);
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=83.0.4103.39/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		
		
		
		

	}

}
