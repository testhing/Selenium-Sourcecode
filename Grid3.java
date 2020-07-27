package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid3 {
  @Test
  public void chromeBrowser2() throws MalformedURLException {
	    String nodeUrl="http://192.168.0.147:31236/wd/hub";
		DesiredCapabilities capabilties=DesiredCapabilities.chrome();
		capabilties.setBrowserName("chrome");
		capabilties.setPlatform(Platform.ANY);
		capabilties.setVersion("83.0.4103.116");
		
		WebDriver driver=new RemoteWebDriver(new URL(nodeUrl), capabilties);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
  }
}
