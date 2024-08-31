package simple.cucumber;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class ParallelMethod1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:/Drivers/ChromeDriver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
      // URL of the login website that is tested
      driver.get("https://demoqa.com/");
      driver.manage().window().maximize();
  }
//  @Test
//  public void f1() {
//	  System.setProperty("webdriver.chrome.driver","C:/Drivers/ChromeDriver/chromedriver.exe");
////		WebDriver driver = new ChromeDriver();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(options);
//      // URL of the login website that is tested
//      driver.get("https://demoqa.com/");
//      driver.manage().window().maximize();
//  }
//  @Test
//  public void f2() {
//	  System.setProperty("webdriver.chrome.driver","C:/Drivers/ChromeDriver/chromedriver.exe");
////		WebDriver driver = new ChromeDriver();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(options);
//      // URL of the login website that is tested
//      driver.get("https://demoqa.com/");
//      driver.manage().window().maximize();
//  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
