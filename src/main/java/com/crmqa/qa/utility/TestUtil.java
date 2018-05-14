package com.crmqa.qa.utility;

import com.crmqa.qa.base.TestBase;

public class TestUtil extends TestBase  {
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=20;
	
	public static void swtichToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}

}
