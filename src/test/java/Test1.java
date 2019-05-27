import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test1 {
	
	static ExtentTest test;
	static ExtentReports report;

	WebDriver driver;

	 @BeforeTest
	 public void StartBrowser_NavURL() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	   	   driver = new HtmlUnitDriver();
	   
	 }

	 @AfterTest
	 public void CloseBrowser() {
		 report.endTest(test);
		 report.flush();
    	  driver.quit();
	 }

	 @Test
	 public void testToCompareDoubles() {
		 driver.get("http://52.172.35.54/SpringMVCHibernate");
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
