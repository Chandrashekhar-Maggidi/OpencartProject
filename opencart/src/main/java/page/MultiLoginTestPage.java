package page;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MultiLoginTestPage {

	
	public WebDriver driver;
	
	

	public void LoginTest () throws Exception
	{
	driver = new FirefoxDriver ();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	
	
	FileInputStream fis = new FileInputStream ("D:\\OrangeHRM\\datadriven\\src\\test\\resources\\Testdata.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet =wb.getSheet("Sheet1");
	
	
	
	for (int i=1; i<=sheet.getLastRowNum(); i++)
	{
		String username =sheet.getRow(i).getCell(1).getStringCellValue();
		String password =sheet.getRow(i).getCell(2).getStringCellValue();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(5000);
		
		try {
			String title = driver.getTitle();
			Assert.assertEquals(title, "My Account");
			sheet.getRow(i).createCell(3).setCellValue("pass");
			Thread.sleep(500);
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			
			Thread.sleep(500);
			System.out.println("Login Pass");
		}
		catch (AssertionError e)
		{
			
			System.out.println("Invalid credentails");
			sheet.getRow(i).createCell(3).setCellValue("fail");
			
		}
	}
	
	FileOutputStream fos = new FileOutputStream ("D:\\OrangeHRM\\datadriven\\src\\test\\resources\\Testdata.xlsx");
	wb.write(fos);
	fos.close();
	
	
	driver.quit();
	}
	

}
