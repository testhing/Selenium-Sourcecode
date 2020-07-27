package pom_pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Using FindBy for locating the elements
	@FindBy(how=How.XPATH, using="//a[text()='academy']") WebElement academyLink;
	@FindBy(how=How.XPATH, using="//a[text()='logout']") WebElement logOut;
	
	public void academyPage() {
		academyLink.click();
	}
	public void logOutlink() {
		logOut.click();
	}
	
}
