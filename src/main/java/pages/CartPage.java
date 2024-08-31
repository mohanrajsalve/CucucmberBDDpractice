package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.model.Report;

public class CartPage {
	WebDriver driver;

	
	 @FindBy(id="shopping_cart_container")
			private WebElement Cartbtn;
	 
	 @FindBy(id="checkout")
		private WebElement checkoutbtn;
	 
	 public CartPage(WebDriver driver) {
		 this.driver=driver;
//			PageFactory.initElements(driver,LoginPage.class);
			PageFactory.initElements(driver,this);
		}
	 public void userclickonCarticon() {
		 Cartbtn.click();
	 }
	 public void useverfiyproductadded(int number) {
		 List<WebElement>prodcutList =new ArrayList<WebElement>();
		 prodcutList=driver.findElements(By.xpath("//div[@class='cart_item_label']"));
		 Assert.assertEquals(prodcutList.size(), number);
		 System.out.println("User added"+number+"prodcut in cart");
		 checkoutbtn.click();
	 }
}
