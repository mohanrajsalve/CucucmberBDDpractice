package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import pages.Loginpage;
import utilitise.BrowserStartup;

public class CucumberBasicEx  {
	
	private WebDriver driver;
	
	public  CucumberBasicEx() {
		this.driver =Hooks.driver;
	}
	
	@Given("user opens {string} browser and open website {string}")
	public void user_opens_browser_and_open_website(String Browser, String URL) {
	
	}


	@Given("user enter website name")
	public void user_enter_website_name() {
		 driver.get("https://www.saucedemo.com/");
	}




}
