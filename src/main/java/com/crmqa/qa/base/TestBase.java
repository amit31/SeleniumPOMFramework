package com.crmqa.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crmqa.qa.utility.TestUtil;

public class TestBase {

    public 	static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() 
	{
		try {
			
			prop = new Properties();
			FileInputStream fp = new FileInputStream("/Users/amit_sharma1/eclipse-workspace/AutomationFrameworkHybrid/src/main/java/com/crmqa/qa/config/config.properties");
			prop.load(fp);
	
		}
		catch(FileNotFoundException e){
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization1()
	{
		
		 String browserName =prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "/Users/amit_sharma1/Downloads/chromedriver");
			     driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/amit_sharma1/Downloads/geckodriver");
		     driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		//public Log.info("app url is:"+prop.getProperty("url"));
	}
	
	
}
