package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportNg {
	 static ExtentReports extent;

public static ExtentReports reportGenaration()
{
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter ESR = new ExtentSparkReporter(path);
	ESR.config().setReportName("Atomation Test Report");
	extent = new ExtentReports();
	extent.attachReporter(ESR);
	extent.setSystemInfo("Tester", "chaitra");
	return extent;
	
}

	}


