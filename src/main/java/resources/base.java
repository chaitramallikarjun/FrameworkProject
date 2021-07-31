package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class base {
	public WebDriver driver;
	public Properties prop;

	@Test
	public WebDriver intialiseDriver() throws IOException

	{
		prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		FileOutputStream fos = new FileOutputStream(path);
		prop.store(fos, null);
		if (prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			
					System.getProperty("user.dir")+"\\src\\main\\java\\DriverFiles\\chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("headless");
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public String getScreenShotpath(String methodName, WebDriver driver) throws IOException {
		TakesScreenshot TS = (TakesScreenshot) driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\reports\\" + methodName + ".png";

		FileUtils.copyFile(source, new File(destination));
return destination;
	}

}
