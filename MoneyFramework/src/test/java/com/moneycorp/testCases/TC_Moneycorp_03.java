package com.moneycorp.testCases;

import org.testng.annotations.Test;

import com.moneycorp.pageObjects.*;

public class TC_Moneycorp_03 extends BaseClass{
	
	@Test
	public void PaymentsSearch() 
	{
	
		driver.get(baseURL);
		
		SearchVerifyPaymentsPage SP = new SearchVerifyPaymentsPage(driver);
		SP.Searchtxt();
		SP.VerifyResult();
		SP.VerifyLinks();
		
		
	}

}
