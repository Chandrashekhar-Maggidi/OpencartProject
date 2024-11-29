package tests;

import org.testng.annotations.Test;

import page.MultiLoginTestPage;

public class DataDrivenTest {
	
	MultiLoginTestPage mlt = new MultiLoginTestPage();
	
	@Test
	public void DataDriven () throws Exception
	{
		mlt.LoginTest();
		
		
	}

}
