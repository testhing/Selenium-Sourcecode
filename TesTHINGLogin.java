package pom_testclass;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom_pageclass.HomePage;
import pom_pageclass.LoginPage;

public class TesTHINGLogin extends BaseClass{
  @Test
  public void loginToAppln() throws InterruptedException {
	  LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	  Thread.sleep(3000);
	  login.readUsername("binitha.it07@gmail.com");
	  login.readPassword("Abcd@1234");
	  login.loginClick();
	  Thread.sleep(5000);
	  
	  HomePage home=PageFactory.initElements(driver, HomePage.class);
	  home.academyPage();
	  home.logOutlink();
  }
}
