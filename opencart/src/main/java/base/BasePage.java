package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.CommonUtils;

public class BasePage {

	WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
	CommonUtils.initialize();
	CommonUtils.hardWait(5);
	CommonUtils.launchBrowserAndNavigateToApp();
	CommonUtils.hardWait(5);
		
	}
	
	@AfterTest
	public void close() throws Exception {
		
	//driver.quit();
		
	}
	
}
