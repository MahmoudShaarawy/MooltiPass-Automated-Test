package mooltipass.automatedTest;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import mooltipass.automatedTest.config.WebDriverFactory;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/test-report",
		"json:target/test-report.json", "junit:target/test-report.xml"} , tags = { "@run" })
public class RunCukesTest {
	protected static WebDriver driver;
	
	 @BeforeClass
    public static void setUp(){
       getNewBrowser();
    }

    @AfterClass
    public static void tearDown(){
    	//closeBrowser();
    }
    
    protected static void getNewBrowser() {
		driver = WebDriverFactory.get();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
    
	protected static void closeBrowser() {
		driver.quit();
		driver = null;
	}
}
