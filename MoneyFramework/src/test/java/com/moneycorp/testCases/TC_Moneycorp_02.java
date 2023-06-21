package com.moneycorp.testCases;

import org.testng.annotations.Test;

import com.moneycorp.pageObjects.*;

public class TC_Moneycorp_02 extends BaseClass {
	
	@Test
	public void ForeignExchange() 
	{
	
		driver.get(baseURL);
		
		ForeignExchangePage FP = new ForeignExchangePage(driver);
		FP.FindMoreDetails();
		FP.scrolldown();
		FP.VerifyPage();
		
		
	}

}
