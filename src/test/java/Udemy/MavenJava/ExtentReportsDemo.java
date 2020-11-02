package Udemy.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	
	ExtentReports extent;
	
@BeforeTest
public void config()
{
	// ExtentReports, ExtentSparkRepoters
	
	String path = System.getProperty("user.dir") + "\\reports\\index.html";
	ExtentSparkReporter espark=new ExtentSparkReporter(path);
	espark.config().setReportName("Extent Reports Test");
	espark.config().setDocumentTitle("Test Results");
	
	extent = new ExtentReports();
	extent.attachReporter(espark);
	extent.setSystemInfo("Tester", "Aashish");
	
}

@Test
public void callBrowser()
{
	ExtentTest test = extent.createTest("Browser Calling");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aashi\\Documents\\Selenium - Udemy\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	System.out.println(driver.getTitle());
	driver.close();
	
	//test.fail("Reports are Not Matching");		// To fail the script Purposely
	
	extent.flush();
	
}
}

