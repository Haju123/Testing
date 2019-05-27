import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test2 {
	
	static ExtentTest test;
	static ExtentReports report;

	WebDriver driver;

	 @BeforeTest
	 public void StartBrowser_NavURL() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	 }

	 @AfterTest
	 public void CloseBrowser() {
		 report.endTest(test);
		 report.flush();
    	  driver.quit();
	 }

	 @Test
	 public void testToCompareDoubles() {
		 driver.get("http://104.43.255.181:8888/SpringMVCHibernate");
		 if(driver.getTitle().equals("Person Page"))
			 {
				 test.log(LogStatus.PASS, "Navigated to the specified URL");
			 }
		 else
			 {
			 	 test.log(LogStatus.FAIL, "Test Failed");
			 
			 }
			 
			 }
}
