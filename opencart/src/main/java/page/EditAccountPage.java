package page;

import java.util.Properties;

import org.openqa.selenium.By;

public class EditAccountPage {
	public static Properties properties;
	private final By by_editaccount = By.xpath("//a[text()='Edit Account']");
	private final By by_telephone=By.xpath("//input[@id=\"input-telephone\"]");
	private final By by_continue =By.xpath("//input[@value=\"Continue\"]");
	private final By by_success = By.xpath("//div[text()='Success: Your account has been successfully updated.']");
	
	
	public By getEditaccount ()
	{
		return by_editaccount ;
	}
	
	public By getTelephone ()
	{
		return by_telephone;
	}
	
	public By getContinue ()
	{
		return by_continue;
	}
	
	public By getSuccess ()
	{
		return by_success;
	}
	

}
