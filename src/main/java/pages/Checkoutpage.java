package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import utilitise.ExcelReader;

public class Checkoutpage {
	WebDriver driver;

	
	 @FindBy(id="first-name")
		private WebElement firstname;
	 
	 @FindBy(id="last-name")
		private WebElement lastname;
	 
	 @FindBy(id="postal-code")
		private WebElement postalcode;
	 
	 @FindBy(id="continue")
		private WebElement continuebtn;

	 @FindBy(id="finish")
		private WebElement finishbtn;
	
	 @FindBy(xpath="//h2[@class='complete-header']")
		private WebElement ordersucceful;
	
	 public Checkoutpage(WebDriver driver) {
		 this.driver=driver;
//			PageFactory.initElements(driver,LoginPage.class);
			PageFactory.initElements(driver,this);
		}
	 public void userbuysproduct() throws IOException {
		 ExcelReader exlread= new ExcelReader();
		 String firstname1=exlread.getvaluefromexcel("firstname");
		 String lastname1=exlread.getvaluefromexcel("lastname");
		 String postalcode1=exlread.getvaluefromexcel("postalcode");
		 firstname.sendKeys(firstname1);
		 lastname.sendKeys(lastname1);
		 postalcode.sendKeys(postalcode1);
		 continuebtn.click();
		 finishbtn.click();
		 Assert.assertEquals(ordersucceful.getText(), "Thank you for your order!");
		 System.out.println("order placed");
	 }
	
	
}

