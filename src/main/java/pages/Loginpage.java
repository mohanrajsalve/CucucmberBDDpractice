package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitise.BrowserStartup;
import org.testng.Assert;
public class Loginpage  {
	WebDriver driver;

	
	 @FindBy(xpath="//input[@id='user-name']")
			private WebElement username;
	
	 @FindBy(xpath="//input[@id='password']")
		private WebElement password;
	 

	 @FindBy(id="login-button")
		private WebElement loginbtn;
	
	 @FindBy(xpath="//div[@class='app_logo']")
		private WebElement applogo;
	 
	 public Loginpage(WebDriver driver) {
		 this.driver=driver;
//			PageFactory.initElements(driver,LoginPage.class);
			PageFactory.initElements(driver,this);
		}
	
	
	public void userlogin(String loginid ,String Password) {
		username.sendKeys(loginid);
		password.sendKeys(Password);		
		loginbtn.click();
		Assert.assertEquals(applogo.getText(), "Swag Labs");
		
	}

}
