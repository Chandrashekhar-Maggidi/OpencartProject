package tests;

import org.testng.annotations.Test;

import base.BasePage;
import page.HomePage;
import utils.CommonUtils;

public class TestHomePage extends BasePage {
	
	HomePage homepage = new HomePage ();
	
	@Test
	public void verifyLoginPage ()
	{
		homepage.login();
	}



}
