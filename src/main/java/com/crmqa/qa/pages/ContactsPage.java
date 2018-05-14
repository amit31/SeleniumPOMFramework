package com.crmqa.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crmqa.qa.base.TestBase;

public class ContactsPage extends TestBase{

	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactLabel;
	
	
	
	

}
