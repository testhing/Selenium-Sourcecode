package pom_pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Using FindBy for locating the elements
	@FindBy(how=How.ID, using="user_login") WebElement userName;
	@FindBy(how=How.ID, using="user_pass") WebElement passWord;
	@FindBy(how=How.ID, using="wp-submit") WebElement signIn;	
	
	public void readUsername(String emailId) {
		userName.sendKeys(emailId);
	}
	
	public void readPassword(String passcode) {
		passWord.sendKeys(passcode);
	}
	
	public void loginClick() {
		signIn.click();
	}

}
