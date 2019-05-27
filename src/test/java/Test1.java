import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver;

	 @BeforeTest
	 public void StartBrowser_NavURL() {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 }

	 @AfterTest
	 public void CloseBrowser() {
	  driver.quit();
	 }

	 @Test
	 public void testToCompareDoubles() {
	  driver.get("http://www.google.com");
	 }
	}