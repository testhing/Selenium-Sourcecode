package SeleniumDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class June23_DownloadingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SPH-Saravana\\Desktop\\SeleniumWebdriverwithJAVAcourse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		
		//ChromeOptions Class
		//Is used to manipulate the various properties of chrome driver.
		//Created an object by the name optionsValue of chromeoptions class
		ChromeOptions optionsValue=new ChromeOptions();
		
		//Hashmap = stores the values in key, value pairs
		//Map<Key, Value> values=new Hashmap<Key, Value>();
		Map<String, Object> values=new HashMap<String, Object>();
		values.put("download.prompt_for_download", false);
		
		driver=new ChromeDriver(optionsValue);
		
		//Navigate to the application
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=83.0.4103.39/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on the element
		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		
		

	}

}
