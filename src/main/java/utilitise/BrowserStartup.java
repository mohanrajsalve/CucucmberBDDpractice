package utilitise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserStartup {

		public static WebDriver Startup(String BrowserName,String url) {
			String path ="C:/Drivers/ChromeDriver/chromedriver.exe";
			System.out.println("path = "+path);
//			String BrowserName= "FF";
			WebDriver driver = null;
//			ChromeDriver driverCH=null;
//			FirefoxDriver driverFF= null;
			if(BrowserName.equalsIgnoreCase("CH")) {
//				ChromeDriver driver = new ChromeDriver(options);
				System.setProperty("webdriver.chrome.driver",path);
				driver=new ChromeDriver();
				
			}else if(BrowserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver",path+"\\browser\\geckodriver.exe");
				driver= new FirefoxDriver();
				
			}else if(BrowserName.equalsIgnoreCase("ME")) {
				System.setProperty("webdriver.edge.driver",path+"\\browser\\msedgedriver.exe");
				driver= new EdgeDriver();
				
			}
			else {
				System.out.println("Browser name is invalid");
			}	
			driver.manage().window().maximize();
			driver.get("https://"+url+".com");
			return driver;
			
		}


	}

