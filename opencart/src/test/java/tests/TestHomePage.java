package tests;

import org.testng.annotations.Test;

import base.BasePage;
import page.EditAccountPage;
import page.HomePage;
import utils.CommonUtils;

public class TestHomePage extends BasePage {
	
	HomePage homepage = new HomePage ();
	EditAccountPage editaccountpage= new EditAccountPage ();
	
	@Test(priority=0)
	public void verifyLoginPage ()
	{
		homepage.login();
	}
	
	@Test(priority=1)
	public void editAccountInformation ()
	{
		CommonUtils.clickElement(editaccountpage.getEditaccount());
		CommonUtils.enterValue(editaccountpage.getTelephone(), "12345234", true);
		CommonUtils.clickElement(editaccountpage.getContinue());
		CommonUtils.isElementDisplayed(editaccountpage.getSuccess());
	}



}
