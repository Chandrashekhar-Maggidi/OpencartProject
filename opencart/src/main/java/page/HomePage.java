package page;

import java.util.Properties;

import org.openqa.selenium.By;

import utils.CommonUtils;
import utils.TestngUtils;


public class HomePage {

	public static Properties properties;
	
	//Web Locators

	private final By by_myaccount = By.xpath("//span[text()='My Account']");
	private final By by_login = By.xpath("//a[text()='Login']");
	private final By by_email = By.xpath("//input[@id=\"input-email\"]");
	private final By by_pwd = By.xpath("//input[@id=\"input-password\"]"); 
	private final By by_loginbtn= By.xpath("//input[@value=\"Login\"]");
	private final By by_homeicon=By.xpath("//i[@class=\"fa fa-home\"]");
	
	
	
	public void login() {
		
		try {
			CommonUtils.clickElement(getMyaccount());
			CommonUtils.clickElement(getLogin());
			
			CommonUtils.enterValue(getEmail (), "chandrashekharmaggidi6@gmail.com",true);
			
			CommonUtils.enterValue(getPwd (), "Demo@1997", true);
			
			CommonUtils.clickElement(getLoginBtn ());
			
			CommonUtils.isElementDisplayed(getIcon ());
		}catch(Exception e) {
			TestngUtils.assertFail(e.getMessage());
		}
	}
	
	
	public By getMyaccount ()
	{
		return by_myaccount;
	}
	
	public By getLogin ()
	{
		return by_login;
	}
	
	public By getEmail ()
	{
		return by_email;
	}
	
	public By getPwd ()
	{
		return by_pwd;
	}
	
	public By getLoginBtn ()
	{
		return by_loginbtn;
	}
	
	public By getIcon ()
	{
		return by_homeicon;
	}



}
