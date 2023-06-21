package com.moneycorp.testCases;

import com.moneycorp.pageObjects.*;

import org.testng.annotations.Test;

public class TC_Moneycorp_01  extends BaseClass{
	
	@Test
	public void SelLanguageTest() 
	{
	
		driver.get(baseURL);
		
		LaunchingPage lP = new LaunchingPage(driver);
		
		lP.OpenLangDrop();
		lP.SelectLang();
		lP.VerifyLang();
	}

}
