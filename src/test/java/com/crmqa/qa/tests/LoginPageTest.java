package com.crmqa.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crmqa.qa.base.TestBase;
import com.crmqa.qa.pages.HomePage;
import com.crmqa.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage  homePage;
	public LoginPageTest()
	{
		super();// to initialise the Properties else NullPointer Exception
	}
	
	@BeforeMethod
	
	public void setUp()
	{
		
		initialization1();
		 loginPage = new LoginPage();
		
	}
	

	@Test
	
	public void loginPageTitleTest()
	{
		String pageTitle =loginPage.validatePageTitle();
		AssertJUnit.assertEquals(pageTitle,"Free CRM software in the cloud powers sales and customer service");
	}
	
    @Test
	
	public void loginPageImage()
	{
		boolean pageImage =loginPage.validateCRMImage();
		AssertJUnit.assertTrue(pageImage);
	}
	
@Test
	
	public void loginTest() throws InterruptedException
	{
	Thread.sleep(5000);
	homePage =	loginPage.Login(prop.getProperty("userName"), prop.getProperty("password"));  
		
	}
	
    
	
	
	
	@AfterMethod()
	  public void tearDown()
	{
		driver.quit();
	}
	
}
