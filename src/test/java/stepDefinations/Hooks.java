package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import propertiesfile.Propertiesfile;
import utilitise.BrowserStartup;

public class Hooks {
	public static WebDriver driver;
	

	@Before
	public void BeforeSteps() {
	Propertiesfile pop=new Propertiesfile();
	String Browser=	pop.getproperties("Browser");
	String URL=	pop.getproperties("URL");
//	 BrowserStartup bu =new BrowserStartup();
	 this.driver =BrowserStartup.Startup(Browser,URL); // Ensure driver is initialized her
	
	}
    @After
    
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
            String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
            ExtentCucumberAdapter.getCurrentStep().fail("Screenshot", MediaEntityBuilder.createScreenCaptureFromBase64String(new String(base64Screenshot)).build());
        } else {
//            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "screenshot");
//            String base64Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//            ExtentCucumberAdapter.getCurrentStep().pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromBase64String(new String(base64Screenshot)).build());
        }
       driver.close();
       driver.quit();
    }
   
	
}
