package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;

	
//	 @FindBy(xpath="//input[@id='user-name']")
//			private WebElement AddtoCartbtn;
	 
	 public Homepage(WebDriver driver) {
		 this.driver=driver;
//			PageFactory.initElements(driver,LoginPage.class);
			PageFactory.initElements(driver,this);
		}
	 public void ClickonAddToCartbtn(String product) {
		 String item=product.toLowerCase().replace(" ","-");
		WebElement prdct= driver.findElement(By.xpath("//button[@id='add-to-cart-"+item+"']"));
		prdct.click();
		
	 }

	 
}
