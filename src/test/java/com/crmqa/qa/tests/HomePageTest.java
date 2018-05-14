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
import com.crmqa.qa.pages.ContactsPage;
import com.crmqa.qa.pages.HomePage;
import com.crmqa.qa.pages.LoginPage;
import com.crmqa.qa.utility.TestUtil;



public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	public HomePageTest()
	{
		super();
		
	}
  
@BeforeMethod
	
	public void setUp() throws InterruptedException
	{
		
		initialization1();
		loginPage = new LoginPage();
		homePage =loginPage.Login(prop.getProperty("userName"), prop.getProperty("password"));
		contactsPage = new ContactsPage();
	}

   @Test (priority=1)

   public void  verifyHomePageTitleTest()
   {
	String hmPageTitle= homePage.verifyHomePageTitle();
	Assert.assertEquals(hmPageTitle,"CRMPRO","The expected & actual title did not match ");
	
   }
   
   @Test (priority=2)

   public void  verifyLoginTest()
   {
     TestUtil.swtichToFrame();
     Assert.assertTrue(homePage.verifyCorrectUserName());
     
	
   }
	
   @Test (priority=3)

   public void  verifyContactLinkTest()
   {
     TestUtil.swtichToFrame();
     contactsPage=homePage.clickOnContactsLink();
	
   }
   
//adding comment
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	

}
