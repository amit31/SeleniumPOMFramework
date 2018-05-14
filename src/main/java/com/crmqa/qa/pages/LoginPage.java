package com.crmqa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmqa.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	//Page Factor -OR:
	//input[@name='username']
	@FindBy(name="username")
	WebElement  username;
	
    @FindBy(name="password")
	WebElement  password;
	

    
    @FindBy(xpath="//input[@type='submit']")
    WebElement loginBtn;
	
    @FindBy(xpath="//button[@class='btn']")
    WebElement signUpbtn;
  
    @FindBy(xpath="//img[@class='img-responsive']")
    WebElement crmLogo;
    //Initialise the Page Factory basically all Webelements defined above
    public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    }
    //Actions :: 
    public String validatePageTitle()
    {
    	
    	return driver.getTitle();
    	
    }
    
    public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
    	
    }
    
    public HomePage Login(String ume,String pwd) throws InterruptedException
    {
    	username.sendKeys(ume);
    	password.sendKeys(pwd);
    	Thread.sleep(1000);
    	loginBtn.click();
    	
    	return new HomePage();
    }
    
}
