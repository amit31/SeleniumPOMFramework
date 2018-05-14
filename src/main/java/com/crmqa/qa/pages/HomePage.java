package com.crmqa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmqa.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//td[@class='headertext' and @align='left']")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
     WebElement contactLink;
   
	//a[contains(text(),'Deals')]
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
    WebElement dealLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
    WebElement taskLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink()
	{
		 contactLink.click();
		 return new ContactsPage();
		 
	}
	
	
	public DealsPage clickOnDealsLink()
	{
		 dealLink.click();
		 return new DealsPage();
		 
	}
	
	public TasksPage clickOnTaskLink()
	{
		 dealLink.click();
		 return new TasksPage();
		 
	}
	
	
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
		
	}
	
	
}
