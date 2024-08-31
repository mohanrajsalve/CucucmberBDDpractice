package simple.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilitise.BrowserStartup;

public class ParallelClass extends BrowserStartup {
	public WebDriver driver=null;
	 @Test
	    public void loginTest () {
	    	
	    	String url = "https://www.saucedemo.com/";
			driver= Startup(url, "CH");
		 driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
			driver.findElement(By.cssSelector("#login-button")).click();
	    }
	
	 
}
