package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "F:/java_practice/cucumber/resources/sauceDemoTest1.feature",
		glue= {"stepDefinations"},
		plugin = { "pretty","html:target/html_report/cucumber_report.html" ,
//				"json:target/cucumber-reports/Cucumber.json",
//				"junit:target/junit_report/junit_report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
		},
		tags=("@smoketest"), //@smoketest or @Regressiontest
		monochrome = true,
		dryRun = false
		)
 
public class TestRunner extends AbstractTestNGCucumberTests {
//uncoment line to see json and junit report
// for generating extent report need :
//	1)com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
//	2) exetent.properties and extent-config.xml files in project source folder

	//@CucumberOptions -> 1)features : provide path of feature file line according to your project structure
//	2) glue -> provide package name of stepdefination it
//	3)plugin-> Plugin is used for reports 
//	4)tags -> tags used for running feature file with specific tag
//	5)dryrun->if declaired true it will check if feature file has stepdefination mapped
	
}

