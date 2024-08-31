package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import pages.CartPage;
import pages.Checkoutpage;
import pages.Homepage;
import pages.Loginpage;

public class SauceDemoTest1 {
	private WebDriver driver;
	public CartPage cp;
	public Checkoutpage ckp;
	public  SauceDemoTest1() {
		this.driver =Hooks.driver;
		cp=new CartPage(driver);
		ckp=new Checkoutpage(driver);
	}
	
	@Given("use enters login id {string} and password {string}")
	public void use_enters_login_id_and_password(String LoginId, String Password) {
	Loginpage lg = new Loginpage(driver);
	lg.userlogin(LoginId, Password);
	}
	@Given("user adds {string} to cart")
	public void user_adds_to_cart(String prodcut) {
		Homepage hp= new Homepage(driver);
		hp.ClickonAddToCartbtn(prodcut);
	}

	@Given("user go to Cart section")
	public void user_go_to_cart_section() {
		cp.userclickonCarticon();
	}

	@Given("user check if cart has {int} prodcuts")
	public void user_check_if_cart_has_prodcuts(Integer no) {
		cp.useverfiyproductadded(no);
	}

	@Given("user buy the product")
	public void user_buy_the_product() throws IOException {
	  ckp.userbuysproduct();
	}
	
}


