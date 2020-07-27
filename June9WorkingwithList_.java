package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class June9WorkingwithList_ {

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
		
		//getAttribute()
		WebElement nameField=driver.findElement(By.id("name"));
		String nameValue=nameField.getAttribute("name");
		System.out.println("The attribute value of name is: "+nameValue);
		
		String className=nameField.getAttribute("class");
		System.out.println("The attribute value of class is: "+className);
		
		String placeholderValue=nameField.getAttribute("placeholder");
		System.out.println("The attribute value of placeholder is: "+placeholderValue);
		
		String typeValue=nameField.getAttribute("type");
		System.out.println("The attribute value of type is: "+typeValue);
		
		String idValue=nameField.getAttribute("id");
		System.out.println("The attribute value of id is: "+idValue);
		
		//Iterate over the items in the radio group and click the option
		List<WebElement> radioBtn=driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'radio')]"));
		int size=radioBtn.size();
		for(int i=0;i<size;i++) {
			boolean radioSelected=radioBtn.get(i).isSelected();
			if(!radioSelected) {
				radioBtn.get(i).click();
			
		}
			Thread.sleep(1000);
	}
		
		//Iterate over the items in the checkbox group
		List<WebElement> checkBoxOption=driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'checkbox')]"));
		 size=checkBoxOption.size();
		for(int i=0;i<size;i++) {
			boolean checkboxSelected=checkBoxOption.get(i).isSelected();
			if(!checkboxSelected) {
				checkBoxOption.get(i).click();
			}
			Thread.sleep(1000);
		}
		
		
		//Iterate over the dropdown list
		//Declare dd element as an instance of select class
		Select dropdownElement=new Select(driver.findElement(By.id("carselect")));
		//Selecting by index
		dropdownElement.selectByIndex(0);
		Thread.sleep(2000);
		//Selecting by value
		dropdownElement.selectByValue("honda");
		Thread.sleep(2000);
		//Select by Visible Text
		dropdownElement.selectByVisibleText("Benz");
		Thread.sleep(2000);
		
		//To get the option names and print in the console
		List<WebElement> optionNames=dropdownElement.getOptions();
		size=optionNames.size();
		for(int i=0;i<size;i++) {
			System.out.println(optionNames.get(i).getText());
		}
	}

}
