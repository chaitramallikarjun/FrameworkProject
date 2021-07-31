package testCases;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import resources.base;

public class BookingTest extends base {
	public WebDriver driver;
	private static Logger logger = LogManager.getLogger(BookingTest.class.getName());
	@BeforeClass
	public void browerstartUp() throws IOException
	{
	driver=intialiseDriver();
	logger.debug("successfully initialised browser");
	driver.get(prop.getProperty("url"));
}
@Test
public void ticktBooking() 
	{

HomePage hp =new HomePage(driver);
hp.getdeals();
logger.debug("successfully clciked on deals");
logger.info(driver.getTitle());
Assert.assertEquals(driver.getTitle(), "chaitra");


		
	}

@AfterClass
public void browertearDown() throws IOException 
{
driver.close();
logger.debug("successfully closed browser");
}
}
