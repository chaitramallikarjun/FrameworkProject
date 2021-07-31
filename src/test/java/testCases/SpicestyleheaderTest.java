package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SpiceStyleHomePage;
import resources.base;

public class SpicestyleheaderTest extends base {
	
	public WebDriver driver;
	public static Logger logger = LogManager.getLogger(SpicestyleheaderTest.class.getName());


	@Test
	public void getspicestyleheadervalidation() throws IOException {
		driver=intialiseDriver();
		logger.debug("successfully initialised browser");
		driver.get(prop.getProperty("url"));
	HomePage hp =new HomePage(driver);
	logger.info("Created Homepage object");
	hp.getspicestyleheader().click();

	logger.debug("successfully closed browser");
	
	
	}
	

}
