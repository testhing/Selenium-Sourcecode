package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class June10_WorkingwithList {

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
		
		//How to get the attribute value 
		WebElement nameField=driver.findElement(By.id("name"));
		String nameValue=nameField.getAttribute("name");
		System.out.println("The attribute value of name is: "+nameValue);
		
		String classValue=nameField.getAttribute("class");
		System.out.println("The attribute value of class is: "+classValue);
		
		String placeholderValue=nameField.getAttribute("placeholder");
		System.out.println("The attribute value of placeholder is: "+placeholderValue);
		
		String typeValue=nameField.getAttribute("type");
		System.out.println("The attribute value of type is: "+typeValue);
		
		String idValue=nameField.getAttribute("id");
		System.out.println("The attribute value of id is: "+idValue);
		
		//How to iterate over the Radio group and click on the items
		List<WebElement> radioBtn=driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'radio')]"));
		int size=radioBtn.size();
		System.out.println("The size of the list is: "+size);
		for(int i=0;i<size;i++) {
			boolean radioSelected=radioBtn.get(i).isSelected();
			if(!radioSelected) {
				radioBtn.get(i).click();
			}
			Thread.sleep(1000);
		}
		
		//How to iterate over the checkbox group
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'checkbox')]"));
		 size=checkBox.size();
		for(int i=0;i<size;i++) {
			boolean checkSelected=checkBox.get(i).isSelected();
			if(!checkSelected) {
				checkBox.get(i).click();
			}
			Thread.sleep(1000);
		}
		
		//Iterate over the dropdown list
		//Decclare dd element as an instance of the select class
		Select dropdownList=new Select(driver.findElement(By.id("carselect")));
		//Select by index
		dropdownList.selectByIndex(0);
		Thread.sleep(1000);
		//Select by value
		dropdownList.selectByValue("honda");
		Thread.sleep(1000);
		//Select by visible text
		dropdownList.selectByVisibleText("Benz");
		Thread.sleep(1000);
		
		//Printing the options
		List<WebElement> optionsDD=dropdownList.getOptions();
		size=optionsDD.size();
		for(int i=0;i<size;i++) {
			String optionName=optionsDD.get(i).getText();
			System.out.println(optionName);
		}
	}

}
