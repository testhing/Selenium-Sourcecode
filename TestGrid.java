package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {
	static WebDriver driver;
	static String nodeUrl;

	public static void main(String[] args) {
		try {
			nodeUrl="http://192.168.0.148:16589/wd/hub";
			DesiredCapabilities capabilties=DesiredCapabilities.chrome();
			capabilties.setBrowserName("chrome");
			capabilties.setPlatform(Platform.ANY);
			capabilties.setVersion("83.0.4103.116");
			
			driver=new RemoteWebDriver(new URL(nodeUrl), capabilties);
			driver.get("http://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
